import './Kanban';

export default function Footer() {

  return(
    <>
      <footer>
        <div className="footers">
          <div className="task">
            <h2><label htmlFor="task">ADD TAREFA</label></h2>
            <form id="addTask" method="POST">
              <input id="task" name="task" type="text" autoComplete="off" required />
            <button type="submit"><img src="Img/Plus.png" alt="Add task"/></button>
            </form>
          </div>
          <div className="trash">
            <h2>Trash</h2>
            <div className="dropZone" id="trash"></div>
          </div>
        </div>
      </footer>
    </>
  )
}