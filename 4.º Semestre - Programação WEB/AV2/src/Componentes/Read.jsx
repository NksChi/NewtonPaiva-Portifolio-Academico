import { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import { findAll, remove } from './ContatoApi';

export default function Read() {
  const [contatos, setContatos] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    pesquisar();
  }, []);

  const pesquisar = async () => {
    const res = await findAll();

    setContatos(res.data); 
    console.log('Sucesso na pesquisa de contatos', res);
  };

  const irParaCadastro = () => {
    navigate('contato/new');
  };

  const excluir = async (id) => {
    await remove(id);
    alert('Registro excluido com sucesso');
  };

  return (
    <>
      <h1>Contatos</h1>
      <button onClick={pesquisar}>Pesquisar</button>
      <button onClick={irParaCadastro}>Cadastrar</button>

      <table>
        <thead>
          <tr>
            <th>Nome</th>
            <th>Endereço</th>
            <th>Telefone</th>
          </tr>
        </thead>
        <tbody>
          {contatos.map((contato) => (
            <tr key={contato.id}> 
              <td>{contato.nome}</td>
              <td>{contato.endereco}</td>
              <td>{contato.telefone}</td>
              <td>
                <button onClick={() => excluir(contato.id)}>Excluir</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
}