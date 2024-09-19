import { useState, useEffect } from 'react';
import { View, Text, StyleSheet, Dimensions } from 'react-native';
import MapView, { Marker, Polyline } from 'react-native-maps';
import * as Location from 'expo-location';

export default function RunMapScreen() {
  const [location, setLocation] = useState(null);
  const [routeCoordinates, setRouteCoordinates] = useState([]);
  const [startLocation, setStartLocation] = useState(null);
  const [timeElapsed, setTimeElapsed] = useState(0);
  const [distance, setDistance] = useState(0);
  const [pace, setPace] = useState(0);
  const [bpm, setBpm] = useState(0);
  const [nikeFuel, setNikeFuel] = useState(0);

  useEffect(() => {
    let timer;
    (async () => {
      let { status } = await Location.requestForegroundPermissionsAsync();
      if (status !== 'granted') {
        alert('Permission to access location was denied');
        return;
      }

      const locationSubscription = await Location.watchPositionAsync(
        {
          accuracy: Location.Accuracy.High,
          timeInterval: 1000,
          distanceInterval: 1,
        },
        (newLocation) => {
          const { latitude, longitude } = newLocation.coords;
          setLocation(newLocation);
          setRouteCoordinates((prevCoords) => [...prevCoords, { latitude, longitude }]);
          if (!startLocation) {
            setStartLocation(newLocation);
          }
          setDistance((prevDistance) => prevDistance + 0.01);
          setPace(timeElapsed > 0 ? (timeElapsed / 60) / (distance / 1000) : 0);
          setBpm(Math.floor(Math.random() * (160 - 120 + 1)) + 120); 
          setNikeFuel(distance * 0.5); 
        }
      );

      timer = setInterval(() => {
        setTimeElapsed((prevTime) => prevTime + 1);
      }, 1000);

      return () => {
        if (locationSubscription) {
          locationSubscription.remove();
        }
        clearInterval(timer);
      };
    })();
  }, [timeElapsed, distance, startLocation]);

  return (
    <View style={styles.container}>
      {location ? (
        <MapView
          style={styles.map}
          initialRegion={{
            latitude: -19.9079193,
            longitude: -43.9623218,
            latitudeDelta: 0.01,
            longitudeDelta: 0.01,
          }}
        >
          {startLocation && (
            <Marker
              coordinate={{
                latitude: startLocation.coords.latitude,
                longitude: startLocation.coords.longitude,
              }}
              title="Início"
              description="Ponto de partida"
              pinColor="#007bff"
            />
          )}
          <Marker
            coordinate={{
              latitude: -19.926399,
              longitude: -43.992746,
            }}
            title="Newton Paiva"
            description="Campus Carlos Luz"
            pinColor="#007bff"
          />
          <Polyline coordinates={routeCoordinates} strokeWidth={5} strokeColor="#007bff" />
        </MapView>
      ) : (
        <Text style={styles.loadingText}>Carregando mapa...</Text>
      )}
      <View style={styles.statsContainer}>
        <Text style={styles.stat}>Tempo: {formatTime(timeElapsed)}</Text>
        <Text style={styles.stat}>Distância: {distance.toFixed(2)} km</Text>
        <Text style={styles.stat}>Pace: {formatPace(pace)}</Text>
        <Text style={styles.stat}>BPM: {bpm}</Text>
        <Text style={styles.stat}>Calorias: {(distance * 60).toFixed(2)} kcal</Text>
        <Text style={styles.stat}>Elevação: 55 m</Text>
        <Text style={styles.stat}>NikeFuel: {nikeFuel.toFixed(2)}</Text>
      </View>
    </View>
  );
}

const formatTime = (seconds) => {
  const minutes = Math.floor(seconds / 60);
  const remainingSeconds = seconds % 60;
  return `${minutes}:${remainingSeconds < 10 ? '0' : ''}${remainingSeconds}`;
};

const formatPace = (pace) => {
  const paceMin = Math.floor(pace);
  const paceSec = Math.round((pace - paceMin) * 60);
  return `${paceMin}:${paceSec < 10 ? '0' : ''}${paceSec} min/km`;
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#cadcdc',
    padding: 20,
  },
  map: {
    width: Dimensions.get('window').width,
    height: 300,
    borderRadius: 10,
    marginBottom: 20,
  },
  loadingText: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  statsContainer: {
    flexDirection: 'column',
    alignItems: 'center',
  },
  stat: {
    fontSize: 16,
    marginBottom: 10,
    color: '#000',
  },
});
