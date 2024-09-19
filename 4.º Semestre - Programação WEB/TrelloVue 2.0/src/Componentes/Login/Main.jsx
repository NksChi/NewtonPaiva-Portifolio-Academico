import './Login.css';
import { useNavigate } from 'react-router-dom';
import React from 'react';

export default function Main() {
  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    navigate('./Kanban');
  };

  return(
    <>
      <img className="logo1" src="Img/TrelloVue-Transparent.png" alt="" />
      <section className="area-login">
        <div className="email">
          <h1>Fazer login no TrelloVue</h1>
             <form id="login-form" onSubmit={handleSubmit}>
            <input type="email" name="email" id="email" placeholder="Email" required/>
            <input type="password" name="senha" id="senha" placeholder="Senha" required/>
            <input type="submit" value="Continuar"/>
          </form>
          <div>
            <p>
              <a href="#">Problema ao se conectar?</a>
            </p>
            <p>
              <a href="#">Criar conta</a>
            </p>
          </div>
        </div>
      </section>
    </>
  )
}