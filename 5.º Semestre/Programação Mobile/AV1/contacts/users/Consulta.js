import {View} from 'react-native'
import {Header} from './Header'
import {DadosPaciente} from './DadosPaciente'

export function Consulta() {
  return (
    <View>
      <Header />
      <DadosPaciente/>
    </View>
  );
}