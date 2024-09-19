import { useState } from 'react';
import { Modal, View, Text, TextInput, TouchableOpacity, Alert, StyleSheet } from 'react-native';
import { insert } from './LivrosAPI';

const CadastrarModal = ({ visible, hideModal, onBookInserted }) => {
  const [titulo, setTitulo] = useState('');
  const [autor, setAutor] = useState('');
  const [anoPublicacao, setAnoPublicacao] = useState('');
  const [preco, setPreco] = useState('');
  const [editoraNome, setEditoraNome] = useState('');
  const [editoraCnpj, setEditoraCnpj] = useState('');
  const [loading, setLoading] = useState(false);

  const formatCnpj = (cnpj) => {
    return cnpj.replace(/^(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})$/, '$1.$2.$3/$4-$5');
  };

  const handleInsertBook = async () => {
    if (!titulo || !autor || !anoPublicacao || !preco || !editoraNome || !editoraCnpj) {
      Alert.alert('Erro', 'Por favor, preencha todos os campos.');
      return;
    }

    const anoPublicacaoInt = parseInt(anoPublicacao, 10);
    const precoFloat = parseFloat(parseFloat(preco).toFixed(2));

    if (isNaN(anoPublicacaoInt) || isNaN(precoFloat)) {
      Alert.alert('Erro', 'Ano de Publicação deve ser um número inteiro e Preço deve ser um número com duas casas decimais.');
      return;
    }

    setLoading(true);

    try {
      const response = await insert(titulo, autor, anoPublicacaoInt, precoFloat, editoraNome, editoraCnpj);
      console.log('Livro inserido:', response);
      Alert.alert('Sucesso', 'Livro inserido com sucesso!');
      setTitulo('');
      setAutor('');
      setAnoPublicacao('');
      setPreco('');
      setEditoraNome('');
      setEditoraCnpj('');
      onBookInserted();
    } catch (error) {
      console.error('Erro ao inserir livro:', error);
      Alert.alert('Erro', 'Não foi possível inserir o livro. Tente novamente.');
    } finally {
      setLoading(false);
    }
  };

  return (
    <Modal visible={visible} animationType="slide" transparent={true}>
      <View style={styles.modalOverlay}>
        <View style={styles.modalContainer}>
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
            onChangeText={(text) => setEditoraCnpj(text.replace(/[^0-9]/g, ''))}
            placeholder="CNPJ da Editora"
            keyboardType="numeric"
            maxLength={14}
          />
          <View style={styles.buttonContainer}>
            <TouchableOpacity style={styles.modalButton} onPress={handleInsertBook} disabled={loading}>
              <Text style={styles.modalButtonText}>{loading ? 'Cadastrando...' : 'Cadastrar Livro'}</Text>
            </TouchableOpacity>
            <TouchableOpacity style={styles.modalButton} onPress={hideModal}>
              <Text style={styles.modalButtonText}>Cancelar</Text>
            </TouchableOpacity>
          </View>
        </View>
      </View>
    </Modal>
  );
};

const styles = StyleSheet.create({
  modalOverlay: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'rgba(0, 0, 0, 0.5)', 
  },
  modalContainer: {
    backgroundColor: '#ead7b8',
    padding: 20,
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
    paddingVertical: 10,
  },
  modalButtonText: {
    color: '#f8f8fa',
  },
});

export default CadastrarModal;
