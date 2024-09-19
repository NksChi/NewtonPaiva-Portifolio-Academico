import { useState, useEffect } from 'react';
import { View, FlatList, Text, TouchableOpacity, Alert, StyleSheet } from 'react-native';
import { Card } from './Card';
import CadastrarModal from './CadastroModal';
import { EditModal } from './EditarModal';
import { findAll, remove, update } from './LivrosAPI';

export function DadosLivros() {
  const [livros, setLivros] = useState([]);
  const [modalVisible, setModalVisible] = useState(false);
  const [editModalVisible, setEditModalVisible] = useState(false);
  const [currentBook, setCurrentBook] = useState(null);

  const carregarLivros = async () => {
    try {
      const livrosCarregados = await findAll();
      setLivros(livrosCarregados);
    } catch (error) {
      console.error('Erro ao carregar livros:', error.message);
    }
  };

  useEffect(() => {
    carregarLivros();
  }, []);

  const excluirLivro = async (id) => {
    try {
      await remove(id);
      Alert.alert('Sucesso', 'Livro excluído com sucesso!');
      await carregarLivros();
    } catch (error) {
      console.error('Erro ao excluir livro:', error.message);
      Alert.alert('Erro', 'Não foi possível excluir o livro. Tente novamente mais tarde.');
    }
  };

  const atualizarLivro = async (livro) => {
    try {
      await update(livro.id, livro.titulo, livro.autor, livro.anoPublicacao, livro.preco, livro.editora.nome, livro.editora.cnpj);
      Alert.alert('Sucesso', 'Livro editado com sucesso!');
      await carregarLivros();
      hideEditModal();
    } catch (error) {
      console.error('Erro ao atualizar livro:', error.message);
      Alert.alert('Erro', 'Não foi possível atualizar o livro. Tente novamente mais tarde.');
    }
  };

  const showModal = () => setModalVisible(true);
  const hideModal = () => setModalVisible(false);

  const showEditModal = (livro) => {
    setCurrentBook(livro);
    setEditModalVisible(true);
  };
  
  const hideEditModal = () => setEditModalVisible(false);

  const onBookInserted = () => {
    hideModal();
    carregarLivros();
  };

  return (
    <View style={{ flex: 1 }}>
      <FlatList
        data={livros}
        renderItem={({ item }) => (
          <Card
            {...item}
            textStyle={{ fontSize: 10 }}
            onDelete={() => excluirLivro(item.id)}
            onEdit={() => showEditModal(item)}
          />
        )}
        keyExtractor={(item) => item.id.toString()}
        contentContainerStyle={{ padding: 10 }}
      />
      <View style={styles.buttonContainer}>
        <TouchableOpacity color="#c19939" onPress={showModal}>
          <Text style={styles.buttonText}>Cadastrar Livro</Text>
        </TouchableOpacity>
      </View>
      <CadastrarModal visible={modalVisible} hideModal={hideModal} onBookInserted={onBookInserted} />
      {currentBook && (
        <EditModal
          visible={editModalVisible}
          hideModal={hideEditModal}
          book={currentBook}
          onSave={atualizarLivro}
        />
      )}
    </View>
  );
}

const styles = StyleSheet.create({
  buttonContainer: {
    color: '#f8f8fa',
    flexDirection: 'row',
    justifyContent: 'center',
    marginTop: 10,
    marginBottom: 50
  },
  buttonText: {
    color: '#f8f8fa',
    backgroundColor: '#c19939',
    borderRadius: 4,
    paddingVertical: 8,
    paddingHorizontal: 16,
    justifyContent: 'center',
    alignItems: 'center',
    marginHorizontal: 5,
  },
});
