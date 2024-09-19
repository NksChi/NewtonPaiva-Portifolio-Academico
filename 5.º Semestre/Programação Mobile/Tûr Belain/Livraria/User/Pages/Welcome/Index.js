import { View, Text, StyleSheet, TouchableOpacity } from 'react-native';
import * as Animatable from 'react-native-animatable';
import { useNavigation } from '@react-navigation/native';

export default function Welcome() {
  const navigation = useNavigation();

  return (
    <View style={styles.container}>
      <View style={styles.containerLogo}>
        <Animatable.Image
          animation='flipInY'
          source={require('../../../../assets/Logo.png')}
          style={styles.logo}
          resizeMode='contain'
        />
      </View>
      <Animatable.View delay={600} animation='fadeInUp' style={styles.containerForm}>
        <Text style={styles.title}>Área exclusiva dos Funcionários</Text>
        <TouchableOpacity style={styles.button} onPress={() => navigation.navigate('Signin')}>
          <Text style={styles.buttonText}>Acessar</Text>
        </TouchableOpacity>
      </Animatable.View>
      <View style={styles.watermarkContainer}>
        <Text style={styles.watermarkText}>© 2024 NK.Inc. All rights reserved.</Text>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#7b4f44',
  },
  containerLogo: {
    flex: 2,
    justifyContent: 'center',
    alignItems: 'center',
  },
  containerForm: {
    flex: 0.6,
    backgroundColor: '#d2b48c',
    borderTopLeftRadius: 25,
    borderTopRightRadius: 25,
    paddingHorizontal: '20%',
    paddingVertical: '10%',
  },
  logo: {
    width: '100%',
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
    textAlign: 'center',
    marginBottom: 12,
  },
  button: {
    backgroundColor: '#c19939',
    borderRadius: 50,
    paddingVertical: 8,
    width: '60%',
    alignSelf: 'center',
    justifyContent: 'center',
    alignItems: 'center',
    marginTop: 20,
  },
  buttonText: {
    fontSize: 18,
    color: '#f8f8fa',
    fontWeight: 'bold',
  },
  watermarkContainer: {
    position: 'absolute',
    bottom: 0,
    right: 0,
    left: 0,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 1,
    backgroundColor: 'rgba(255, 255, 255, 0.6)',
  },
  watermarkText: {
    fontSize: 14,
    color: '#7b4f44',
    fontWeight: 'bold',
  },
});
