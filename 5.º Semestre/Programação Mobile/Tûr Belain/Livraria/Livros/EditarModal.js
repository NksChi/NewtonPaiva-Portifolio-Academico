import { useState, useEffect } from 'react';
import { Modal, View, Text, TextInput, TouchableOpacity, StyleSheet } from 'react-native';

export function EditModal({ visible, hideModal, book, onSave }) {
  const [titulo, setTitulo] = useState('');
  const [autor, setAutor] = useState('');
  const [anoPublicacao, setAnoPublicacao] = useState('');
  const [preco, setPreco] = useState('');
  const [editoraNome, setEditoraNome] = useState('');
  const [editoraCnpj, setEditoraCnpj] = useState('');

  useEffect(() => {
    setTitulo(book.titulo);
    setAutor(book.autor);
    setAnoPublicacao(book.anoPublicacao.toString());
    setPreco(book.preco.toString());
    setEditoraNome(book.editora.nome);
    setEditoraCnpj(book.editora.cnpj);
  }, [book]);

  const formatCnpj = (cnpj) => {
    return cnpj.replace(/^(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})$/, '$1.$2.$3/$4-$5');
  };

  const handleSave = () => {
    onSave({
      ...book,
      titulo,
      autor,
      anoPublicacao: parseInt(anoPublicacao),
      preco: parseFloat(preco),
      editora: { nome: editoraNome, cnpj: editoraCnpj },
    });
    hideModal();
  };

  return (
    <Modal visible={visible} animationType="slide" transparent={true}>
      <View style={styles.modalContainer}>
        <View style={styles.modalContent}>
          <TextInput
            style={styles.input}
            value={titulo}
            onChangeText={setTitulo}
            placeholder="Título"
          />
          <TextInput
            style={styles.input}
            value={autor}
            onChangeText={setAutor}
            placeholder="Autor"
          />
          <TextInput
            style={styles.input}
            value={anoPublicacao}
            onChangeText={setAnoPublicacao}
            placeholder="Ano de Publicação"
            keyboardType="numeric"
          />
          <TextInput
            style={styles.input}
            value={preco}
            onChangeText={setPreco}
            placeholder="Preço"
            keyboardType="numeric"
          />
          <TextInput
            style={styles.input}
            value={editoraNome}
            onChangeText={setEditoraNome}
            placeholder="Nome da Editora"
          />
          <TextInput
            style={styles.input}
            value={formatCnpj(editoraCnpj)}
            onChangeText={text => setEditoraCnpj(text.replace(/[^0-9]/g, ''))}
            placeholder="CNPJ da Editora"
            keyboardType="numeric"
            maxLength={14}
          />
          <View style={styles.buttonContainer}>
            <TouchableOpacity style={styles.modalButton} onPress={handleSave}>
              <Text style={styles.modalButtonText}>
                Salvar
              </Text>
            </TouchableOpacity>
            <TouchableOpacity style={styles.modalButton} onPress={hideModal}>
              <Text style={styles.modalButtonText}>
                Cancelar
              </Text>
            </TouchableOpacity>
          </View>
        </View>
      </View>
    </Modal>
  );
}

const styles = StyleSheet.create({
  modalContainer: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  modalContent: {
    backgroundColor: '#ead7b8',
    padding: 20,
    margin: 20,
    borderRadius: 10,
    width: '80%',
  },
  input: {
    borderBottomWidth: 1,
    marginBottom: 10,
    padding: 5,
  },
  buttonContainer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
  },
  modalButton: {
    backgroundColor: '#c19939',
    borderRadius: 4,
    justifyContent: 'center',
    alignItems: 'center',
    flex: 1,
    marginHorizontal: 8,
    paddingVertical: 10
  },
  modalButtonText: {
    color: '#f8f8fa'
  },
});
