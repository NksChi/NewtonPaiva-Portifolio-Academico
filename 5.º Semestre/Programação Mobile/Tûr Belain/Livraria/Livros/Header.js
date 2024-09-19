import { SafeAreaView, View, Image, StyleSheet, TouchableOpacity } from 'react-native';
import Logo from '../../assets/Logo.png';

export function Header() {
  const handleHomePress = () => {
    console.log('Home button pressed');
  };

  return (
    <SafeAreaView style={styles.safeArea}>
      <View style={styles.main}>
        <TouchableOpacity onPress={handleHomePress}>
          <Image source={Logo} style={styles.img} />
        </TouchableOpacity>
      </View>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  safeArea: {
    backgroundColor: '#7b4f44',
  },
  main: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
    height: 85,
    paddingHorizontal: 5,
  },
  img: {
    width: 80,
    height: 80,
  },
});
