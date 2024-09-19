import './Kanban';
import { Link } from 'react-router-dom';

export default function Header() {

  return(
    <>
      <header>
        <nav className="navbar">
          <Link to="/" className="back-button">
            <img src="Img/Esquerda.png" alt="Voltar" />
          </Link>
          <img src="Img/TrelloVue-Transparent.png" alt="TrelloVue" className="logo" />
        </nav>
      </header>
    </>
  )
}