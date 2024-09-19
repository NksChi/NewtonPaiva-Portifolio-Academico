import {Image, View, Text, StyleSheet} from 'react-native'

import Logo from '../../assets/perfil.jpg'

export function Header(){
  return (
    <View style={styles.main}>
      <View>
        <Text style={styles.name} >Erin</Text>
        <Text style={styles.email} >erin.enderson@gmail.com</Text>
      </View>
        <Image style={styles.img} source={Logo} />
    </View>
  )
}

const styles = StyleSheet.create({
  main: {
    alignItems: 'center',
    backgroundColor: '#0fa6fb',
    flexDirection: 'row',
    justifyContent: 'space-between',
    height: 180,
    padding: 20
  },
  name: {
    fontSize: 30,
    fontWeight: 'bold',
    fontFamily: 'Roboto',
    color: '#FFF'
  },
   email: {
    fontSize: 15,
    fontWeight: 'bold',
    fontFamily: 'Roboto',
    color: '#FFF'
  },
  img: {
    width: 100,
    height: 100,
    borderWidth: 1,
    borderRadius: 100
  }
})