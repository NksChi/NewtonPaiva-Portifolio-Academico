import {Image, View, Text, StyleSheet} from 'react-native'

import Logo from '../../assets/sol.jpg'

export function Propaganda() {
  return (
    <View style={styles.main}>
      <Image style={styles.img} source={Logo} />
      <View>
        <Text style={styles.desconto} >Você tem 50% de desconto</Text>
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
  main: {
    alignItems: 'center',
    backgroundColor: '#FFF',
    flexDirection: 'row',
    justifyContent: 'space-around',
    padding: 4,
    borderRadius: 20,
    marginTop: -30,
    alignSelf: 'center',
    borderWidth: 1,
    borderColor: '#dcdfe4'
  },
  desconto: {
    fontSize: 22,
    fontWeight: 'bold',
    fontFamily: 'Roboto',
    color: '#000'
  },
  img: {
    width: 100,
    height: 100,
    borderWidth: 1,
    borderColor: '#c1c1c1',
    borderRadius: 20
  }
})