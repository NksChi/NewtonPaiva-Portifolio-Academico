import { useNavigate } from 'react-router-dom';
import './Kanban.css'

export default function Main() {
  const navigate = useNavigate();
  const navigateToLogin = () => {
    navigate('/');
  };

  const dragOver = (event) => {
    event.preventDefault();

  };

  const drop = (event) => {
    event.preventDefault();

  };

  return(
    <>
        <section className="boards">
          <div className="board">
            <h2>A FAZER</h2>
              <div className="dropzone" id="todo" onDragOver={dragOver} onDrop={drop}>
                <div className="card" draggable="true">
                <div className="status todo"></div>
                <div className="content">
                  Tarefa a fazer 1: Lorem ipsum dolor sit amet.
                </div>
              </div>
              <div className="card" draggable="true">
                <div className="status todo"></div>
                <div className="content">
                  Tarefa a fazer 2: Consectetur adipiscing elit.
                </div>
              </div>
            </div>
          </div>
          <div className="board">
            <h2>FAZENDO</h2>
            <div className="dropzone" id="doing" onDragOver={dragOver} onDrop={drop}>
              <div className="card" draggable="true">
                <div className="status doing"></div>
                <div className="content">
                  Tarefa em andamento 1: Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                </div>
              </div>
              <div className="card" draggable="true">
                <div className="status doing"></div>
                <div className="content">
                  Tarefa em andamento 2: Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip
                  ex ea commodo consequat.
                </div>
              </div>
            </div>
          </div>
          <div className="board">
            <h2>REVISÃO</h2>
            <div className="dropzone" id="review" onDragOver={dragOver} onDrop={drop}>
              <div className="card" draggable="true">
                <div className="status review"></div>
                <div className="content">
                  Tarefa em revisão 1: Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu
                  fugiat nulla pariatur.
                </div>
              </div>
              <div className="card" draggable="true">
                <div className="status review"></div>
                <div className="content">
                  Tarefa em revisão 2: Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt
                  mollit anim id est laborum.
                </div>
              </div>
            </div>
          </div>
          <div className="board">
            <h2>CONCLUÍDO</h2>
            <div className="dropzone" id="done" onDragOver={dragOver} onDrop={drop}>
              <div className="card" draggable="true">
                <div className="status done"></div>
                <div className="content">
                  Tarefa concluída 1: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
                  incididunt ut labore et dolore magna aliqua.
                </div>
              </div>
              <div className="card" draggable="true">
                <div className="status done"></div>
                <div className="content">
                  Tarefa concluída 2: Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex
                  ea commodo consequat.
                </div>
              </div>
            </div>
          </div>
        </section>
    </>
  )
}