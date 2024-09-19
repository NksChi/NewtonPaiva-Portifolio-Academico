import { useState } from 'react'
import { View, Text, FlatList, StyleSheet } from 'react-native'
import { Button } from 'react-native-paper'
import { Card } from './Card'
import { findAll, remove } from './UsuarioAPI'

export function DadosPaciente() {
  const [users, setUsers] = useState([])

  const findUsers = async () => {
    const users = await findAll()
    setUsers(users)
  };

  const onDelete = async (id) => {
    console.log('Removendo o contato...')
    await remove(id)
    alert('Contato excluído com sucesso!')
    await findUsers()
  };

  return (
    <View>
      <FlatList
        data={users}
        renderItem={(ri) => (
          <Card
            {...ri.item}
            textStyle={{ fontSize: 10 }}
            onDelete={() => onDelete(ri.item.id)}
          />
        )}
        keyExtractor={(item) => item.id}
        contentContainerStyle={styles.lacuna}
        numColumns={1}
        horizontal={false}
      />
      <Button  onPress={findUsers} style={styles.button} color= 'white'>
        Atualizar
      </Button >
    </View>
  )
}

const styles = StyleSheet.create({
  lacuna: {
    gap: 10
  },
  button:{
    backgroundColor: '#228b22',
    alignSelf: 'center',
    marginTop: 50
  }
})
