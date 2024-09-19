import { View, StyleSheet } from 'react-native';

import { Perfil } from './components/Contato/Perfil';

export default function App() {
  return (
    <View style={estilo.container}>
      <Perfil />
    </View>
  )
}


const estilo = StyleSheet.create({
  container: {
    flex: 1,
  }
})
