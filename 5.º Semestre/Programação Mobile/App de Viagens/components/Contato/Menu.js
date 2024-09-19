import { View, Text, StyleSheet } from 'react-native'

export function Menu() {
  return (
    <>
      <View style={styles.main}>
        <Text style={styles.title}>Nome</Text>
        <Text style={styles.content}>Erin Henderson</Text>
        <Text style={styles.title}>CPF</Text>
        <Text style={styles.content}>055.887.998-55</Text>
        <Text style={styles.title}>Telefone</Text>
        <Text style={styles.content}>(31) 9 8844-9988</Text>
        <Text style={styles.title}>Número do Cartão</Text>
        <Text style={styles.content}>5324 2843 0393 7591</Text>
        <Text style={styles.title}>Data de Validade</Text>
        <Text style={styles.content}>22/10/2021</Text>
        <Text style={styles.title}>Código Segurança(CVV)</Text>
        <Text style={styles.content}>246</Text>
      </View>
    </>
  );
}

const styles = StyleSheet.create({
  main: {
    alignItems: 'left',
    backgroundColor: '#FFF',
    flexDirection: 'columm',
    padding: 15,
    gap: 3
  },
  title:{
    fontSize: 30,
    fontWeight: 'bold',
    fontFamily: 'Roboto',
    color: '#b8bec5'
  },
  content:{
    fontSize: 30,
    fontWeight: 'normal',
    fontFamily: 'Roboto',
    color: '#525c65'
  }
})