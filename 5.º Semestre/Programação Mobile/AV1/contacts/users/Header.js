import {View, Text, StyleSheet} from 'react-native';

export function Header(){
  return (
    <View style={styles.main}>
        <Text style={styles.name} >Consulta</Text>
    </View>
  )
}

const styles = StyleSheet.create({
  main: {
    alignItems: 'center',
    backgroundColor: '#2e8b57',
    height: 100,
    padding: 20,
    marginBottom: 20
  },
  name: {
    fontSize: 30,
    fontWeight: 'bold',
    fontFamily: 'Roboto',
    marginTop: 10,
    color: '#FFF'
  },
});
