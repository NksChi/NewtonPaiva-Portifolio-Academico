import { View, Text, StyleSheet, TouchableOpacity } from 'react-native';
import { AntDesign } from '@expo/vector-icons';

export function Card({ id, titulo, autor, anoPublicacao, preco, editora, onDelete, onEdit }) {
  const formatCnpj = (cnpj) => {
    return cnpj.replace(/^(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})$/, '$1.$2.$3/$4-$5');
  };

  return (
    <View style={styles.card}>
      <View style={styles.cardDetails}>
        <Text style={styles.detailText}><Text style={styles.label}>Título:</Text> {titulo}</Text>
        <Text style={styles.detailText}><Text style={styles.label}>Autor:</Text> {autor}</Text>
        <Text style={styles.detailText}><Text style={styles.label}>Ano de Publicação:</Text> {anoPublicacao}</Text>
        <Text style={styles.detailText}><Text style={styles.label}>Preço:</Text> {preco}</Text>
        <Text style={styles.detailText}><Text style={styles.label}>Nome da Editora:</Text> {editora.nome}</Text>
        <Text style={styles.detailText}><Text style={styles.label}>CNPJ da Editora:</Text> {formatCnpj(editora.cnpj)}</Text>
      </View>
      <View style={styles.actions}>
        <TouchableOpacity
          mode="contained"
          onPress={() => onEdit(id, titulo, autor, anoPublicacao, preco, editora.nome, editora.cnpj)}
          style={styles.button}
          labelStyle={styles.buttonLabel}
        >
          <AntDesign name="edit" size={24} color="#FDC952" />
        </TouchableOpacity>
        <TouchableOpacity
          mode="contained"
          onPress={onDelete}
          style={styles.button}
          labelStyle={styles.buttonLabel}
        >
          <AntDesign name="delete" size={24} color="#FDC952" />
        </TouchableOpacity>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  card: {
    flexDirection: 'row',
    backgroundColor: '#7b4f44',
    borderRadius: 10,
    padding: 10,
    marginBottom: 10,
  },
  cardDetails: {
    flex: 1,
  },
  label: {
    fontWeight: 'bold',
  },
  detailText: {
    marginBottom: 5,
    color: '#FDC952',
  },
  actions: {
    alignItems: 'center',
    justifyContent: 'center',
    flexDirection: 'column',
  },
  button: {
    margin: 20,
    marginHorizontal: 5,
  },
  buttonLabel: {
    color: '#f8f8fa',
  },
});
