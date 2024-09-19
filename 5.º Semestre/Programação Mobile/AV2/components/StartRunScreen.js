import { useState, useEffect } from 'react';
import { View, Text, TouchableOpacity, StyleSheet } from 'react-native';
import { IconButton } from 'react-native-paper';

export default function StartRunScreen({ navigation }) {
  const [isRunning, setIsRunning] = useState(false);
  const [timeElapsed, setTimeElapsed] = useState(0);
  const [distance, setDistance] = useState(0);
  const [pace, setPace] = useState(0);
  const [bpm, setBpm] = useState(0);

  useEffect(() => {
    let timer;
    if (isRunning) {
      timer = setInterval(() => {
        setTimeElapsed((prevTime) => prevTime + 1);
        setDistance((prevDistance) => prevDistance + 0.01);
        setPace(timeElapsed > 0 ? (timeElapsed / 60) / (distance / 1000) : 0);
        setBpm(Math.floor(Math.random() * (160 - 120 + 1)) + 120);
      }, 1000);
    } else if (!isRunning && timeElapsed !== 0) {
      clearInterval(timer);
    }
    return () => clearInterval(timer);
  }, [isRunning, timeElapsed, distance]);

  const handleStartStop = () => {
    if (isRunning) {
      setIsRunning(false);
      setTimeElapsed(0);
      setDistance(0);
      setPace(0);
      setBpm(0);
    } else {
      setIsRunning(true);
      navigation.navigate('RunMap');
    }
  };

  return (
    <View style={styles.container}>
      <View style={styles.statsContainer}>
        <View style={styles.stat}>
          <Text style={styles.statLabel}>Pace:</Text>
          <Text style={styles.statValue}>{formatPace(pace)}</Text>
        </View>
        <View style={styles.stat}>
          <Text style={styles.statLabel}>BPM:</Text>
          <Text style={styles.statValue}>{bpm}</Text>
        </View>
        <View style={[styles.stat, { alignItems: 'center' }]}>
          <Text style={styles.statLabel}>Tempo:</Text>
          <Text style={styles.statValue}>{formatTime(timeElapsed)}</Text>
        </View>
      </View>
      <View style={styles.distanceContainer}>
        <Text style={styles.distanceText}>{distance.toFixed(2)} km</Text>
      </View>
      <View style={styles.bottomContainer}>
        <TouchableOpacity
          style={[styles.iconButton, { marginBottom: 20 }]}
          onPress={handleStartStop}
        >
          <IconButton
            icon={isRunning ? 'pause' : 'play'}
            color="#fff"
            size={60}
          />
        </TouchableOpacity>
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
  if (pace === 0) return '0:00';
  const paceMin = Math.floor(pace);
  const paceSec = Math.round((pace - paceMin) * 60);
  return `${paceMin}:${paceSec < 10 ? '0' : ''}${paceSec} min/km`;
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#cadcdc',
    padding: 20,
    justifyContent: 'flex-start',
  },
  statsContainer: {
    flexDirection: 'row',
    justifyContent: 'space-around',
    marginTop: 20,
  },
  stat: {
    flexDirection: 'column',
    alignItems: 'center',
    marginBottom: 10,
  },
  statLabel: {
    fontSize: 16,
    marginBottom: 5,
    color: '#555',
  },
  statValue: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#000',
  },
  distanceContainer: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  distanceText: {
    fontSize: 48,
    fontWeight: 'bold',
    color: '#000',
    textAlign: 'center',
  },
  bottomContainer: {
    flex: 1,
    justifyContent: 'flex-end',
    marginBottom: 36,
  },
  iconButton: {
    backgroundColor: '#000',
    borderRadius: 50,
    alignSelf: 'center',
  },
});
