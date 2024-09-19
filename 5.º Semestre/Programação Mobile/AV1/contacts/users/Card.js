import { View, Image, Text, StyleSheet } from 'react-native';
import { FontAwesome } from '@expo/vector-icons';
import { Button } from 'react-native-paper'
import Avatar from '../../assets/Paciente.png';

export function Card({ dataConsulta, descricaoExame, historico, textStyle, onDelete }) {
  return (
    <View style={styles.view}>
      <Image source={Avatar} style={[styles.img, textStyle]} />
      <View style={styles.viewText}>
        <Text>Consulta: {dataConsulta}</Text>
        <Text style={[styles.strong, textStyle]}>Exame: {descricaoExame}</Text>
        <Text>Histórico: {historico}</Text>
      </View>
      <Button onPress={onDelete}>
        <FontAwesome name="remove" size={24} color="black" />
      </Button>
    </View>
  );
}

const styles = StyleSheet.create({
  view: {
    flexDirection: 'row',
    borderWidth: 1,
    borderRadius: 10,
  },
  img: {
    height: 90,
    width: 70,
    borderRadius: 10,
  },
  viewText: {
    paddingLeft: 10,
    justifyContent: 'center',
  },
  strong: {
    fontSize: 18,
    fontWeight: 'bold',
  },
});
