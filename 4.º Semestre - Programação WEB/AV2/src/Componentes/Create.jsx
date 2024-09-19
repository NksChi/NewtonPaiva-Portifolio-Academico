import React, { useRef } from 'react';
import { useNavigate } from 'react-router-dom';
import { insert } from './ContatoApi';

export default function Create() {
  const navigate = useNavigate();

  const inputNomeRef = useRef();
  const inputEndereçoRef = useRef();
  const inputTelefoneRef = useRef();

  const salvar = async () => {
    const nome = inputNomeRef.current.value;
    const endereco = inputEndereçoRef.current.value;
    const telefone = inputTelefoneRef.current.value;

    const novoContato = {
      nome: nome,
      endereco: endereco,
      telefone: telefone,
    };

    const contato = await insert(novoContato);

    alert(`Contato cadastrado com sucesso! ID=${contato.id}`);
    navigate('/contatos');
  };

  const cancelar = () => {
    navigate('/contato');
  };

  return (
    <div>
      <h1>Cadastro de contatos</h1>
      <div>
        <label>Nome:</label>
        <input ref={inputNomeRef} type="text" placeholder="Nicolas" />
      </div>
      <div>
        <label>Endereço:</label>
        <input ref={inputEndereçoRef} type="text" placeholder="Belo Horizonte" />
      </div>
      <div>
        <label>Telefone:</label>
        <input ref={inputTelefoneRef} type="tel" placeholder="(12) 34567-8900" />
      </div>
      <div>
        <button onClick={salvar}>SALVAR</button>
        <button onClick={cancelar}>CANCELAR</button>
      </div>
    </div>
  );
}
