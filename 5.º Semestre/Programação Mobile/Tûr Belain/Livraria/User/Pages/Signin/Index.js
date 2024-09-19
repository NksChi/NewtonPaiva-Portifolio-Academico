import { useState } from 'react';
import { View, Text, StyleSheet, TextInput, TouchableOpacity, Alert } from 'react-native';
import * as Animatable from 'react-native-animatable';
import { useNavigation } from '@react-navigation/native';

export default function Signin() {
  const [credential, setCredential] = useState('');
  const [password, setPassword] = useState('');
  const navigation = useNavigation();

  const handleCredentialChange = (text) => {
    const numericText = text.replace(/[^0-9]/g, '');
    setCredential(numericText);
  };

  const handleSignin = () => {
    if (!credential || !password) {
      Alert.alert('Erro', 'Credencial e Senha são obrigatórios');
      return;
    }
    if (!/^\d+$/.test(credential)) {
      Alert.alert('Erro', 'A credencial deve conter apenas números');
      return;
    }
    console.log('Button pressed');
    navigation.navigate('Consulta');
  };

  return (
    <View style={styles.container}>
      <Animatable.View delay={600} animation='fadeInLeft' style={styles.containerHeader}>
        <Text style={styles.message}>Bem vindo(a) a Tûr Belain</Text>
      </Animatable.View>
      <Animatable.View animation='fadeInUp' style={styles.containerForm}>
        <Text style={styles.title}>Credencial(RA)</Text>
        <TextInput 
          placeholder='Digite sua credencial' 
          style={styles.input} 
          value={credential} 
          onChangeText={handleCredentialChange} 
          keyboardType='numeric' 
        />
        <Text style={styles.title}>Senha</Text>
        <TextInput 
          placeholder='Digite sua senha' 
          style={styles.input} 
          secureTextEntry={true} 
          value={password} 
          onChangeText={setPassword} 
        />
        <TouchableOpacity style={styles.button} onPress={handleSignin}>
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
    position: 'relative', 
  },
  containerHeader: {
    marginTop: '14%', 
    marginBottom: '8%',
    paddingStart: '5%',
  },
  message: {
    fontSize: 28,
    color: '#c19939', 
    fontWeight: 'bold',
  },
  containerForm: {
    flex: 1,
    backgroundColor: '#d2b48c',
    borderTopLeftRadius: 25,
    borderTopRightRadius: 25,
    paddingStart: '5%',
    paddingEnd: '5%',
  },
  title: {
    fontSize: 20,
    fontWeight: 'bold',
    marginTop: 28,
  },
  input: {
    borderBottomWidth: 1,
    height: 40,
    marginBottom: 12,
    fontSize: 16,
  },
  button: {
    backgroundColor: '#c19939',
    borderRadius: 4,
    paddingVertical: 8,
    width: '100%',
    marginTop: 14,
    justifyContent: 'center',
    alignItems: 'center',
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
