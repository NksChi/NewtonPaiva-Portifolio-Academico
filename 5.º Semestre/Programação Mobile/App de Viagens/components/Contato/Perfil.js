import {View, StyleSheet } from 'react-native'
import {Header} from './Header'
import { Propaganda } from './Propaganda'
import { Menu } from './Menu'
import { Button } from 'react-native-paper'


export function Perfil() {
  return (
    <View>
      <Header />
      <Propaganda/>
      <Menu/>
      <Button  mode="contained" style={styles.button}>
        Cliente Gold
      </Button>
    </View>
  );
}

const styles = StyleSheet.create({
  button:{
    backgroundColor: '#f18d27',
    alignSelf: 'flex-end',
    marginRight: 20
  }
})


