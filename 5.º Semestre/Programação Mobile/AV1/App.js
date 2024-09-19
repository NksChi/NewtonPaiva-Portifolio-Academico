import { View, StyleSheet } from 'react-native';
import {Consulta} from './contacts/users/Consulta';

export default function App() {
  return (
    <View style={styles.container}>
    <Consulta/>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  }
});