import { useState } from 'react';
import { View, StyleSheet, Text } from 'react-native';
import { Header } from './Header';
import { DadosLivros } from './DadosLivros';
import { Searchbar } from 'react-native-paper';

export function Consulta() {
  const [searchQuery, setSearchQuery] = useState('');

  const onChangeSearch = (query) => {
    setSearchQuery(query);
  };

  return (
    <View style={styles.container}>
      <Header />
      <Searchbar
        placeholder="Pesquisar livro"
        onChangeText={onChangeSearch}
        value={searchQuery}
        style={styles.searchBar}
        inputStyle={styles.searchInput}
      />
      <View style={styles.cardsContainer}>
        <DadosLivros searchQuery={searchQuery} />
      </View>
      <View style={styles.watermarkContainer}>
        <Text style={styles.watermarkText}>© 2024 NK.Inc. All rights reserved.</Text>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#d2b48c'
  },
  searchBar: {
    marginHorizontal: 10,
    marginTop: 10,
    borderRadius: 20,
    backgroundColor: '#fff',
  },
  searchInput: {
    fontSize: 16,
  },
  cardsContainer: {
    flex: 1,
    marginTop: 10,
  },
  watermarkContainer: {
    position: 'absolute',
    bottom: 0,
    right: 0,
    left: 0,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 1,
    backgroundColor: 'rgba(255, 255, 255, 0.6)',
  },
  watermarkText: {
    fontSize: 14,
    color: '#7b4f44',
    fontWeight: 'bold',
  },
});
