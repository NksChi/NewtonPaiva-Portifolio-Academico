// Obtém o formulário e o campo de entrada
const formTask = document.getElementById('addTask');
const task = document.getElementById('task');

// Adiciona um ouvinte de evento ao formulário
formTask.addEventListener('submit', (event) => {
  // Impede que o formulário seja enviado
  event.preventDefault();

  // Verifica se o campo de entrada não está vazio
  if (task.value != '') {
    // Chama a função para adicionar um novo cartão
    addCard(task.value);

    // Limpa o campo de entrada
    task.value = '';
  }
});

// Função para adicionar um novo cartão
function addCard(value) {
  // Obtém o quadro "To Do"
  const todo = document.querySelector('#todo');

  // Cria um novo elemento de cartão
  const newCard = document.createElement('div');
  newCard.classList.add('card');
  newCard.draggable = true;
  newCard.innerHTML = `
    <div class="status todo"></div>
    <div class="content"><p>` + value + `</p></div>
  `;

  // Adiciona ouvintes de evento para o cartão
  newCard.addEventListener('dragstart', dragStart);
  newCard.addEventListener('drag', drag);
  newCard.addEventListener('dragend', dragEnd);

  // Adiciona o novo cartão ao quadro "To Do"
  todo.appendChild(newCard);
}

// Obtém todos os cartões e zonas de queda
const cards = document.querySelectorAll('.card');
const dropZones = document.querySelectorAll('.dropzone');

// Adiciona ouvintes de evento para os cartões
cards.forEach((card) => {
  card.addEventListener('dragstart', dragStart);
  card.addEventListener('drag', drag);
  card.addEventListener('dragend', dragEnd);
});

// Função para lidar com o início do arrasto
function dragStart() {
  // Adiciona uma classe de destaque às zonas de queda
  dropZones.forEach((dropZone) => dropZone.classList.add('highlight'));
  this.classList.add('dragging');

  // Remove a classe de status atual do cartão com base no quadro pai
  switch (this.parentElement.id) {
    case 'todo':
      this.firstElementChild.classList.remove('todo');
      break;
    case 'doing':
      this.firstElementChild.classList.remove('doing');
      break;
    case 'review':
      this.firstElementChild.classList.remove('review');
      break;
    case 'done':
      this.firstElementChild.classList.remove('done');
      break;
    case 'trash':
      this.firstElementChild.classList.remove('todo');
      break;
    default:
      break;
  }
}

// Função para lidar com o arrasto (pode ser deixada em branco)
function drag() {
  // Implementação opcional
}

// Função para lidar com o final do arrasto
function dragEnd() {
  // Remove o destaque das zonas de queda
  dropZones.forEach((dropZone) => dropZone.classList.remove('highlight'));

  // Remove a classe de destaque do cartão
  this.classList.remove('dragging');

  // Adiciona a classe de status adequada com base no novo quadro
  switch (this.parentElement.id) {
    case 'todo':
      this.firstElementChild.classList.add('todo');
      break;
    case 'doing':
      this.firstElementChild.classList.add('doing');
      break;
    case 'review':
      this.firstElementChild.classList.add('review');
      break;
    case 'done':
      this.firstElementChild.classList.add('done');
      break;
    case 'trash':
      // Remove o cartão se ele estiver no quadro "Trash"
      this.parentElement.removeChild(this);
      break;
    default:
      break;
  }
}

// Adiciona ouvintes de evento para as zonas de queda
dropZones.forEach((dropZone) => {
  dropZone.addEventListener('dragenter', dragEnter);
  dropZone.addEventListener('dragover', dragOver);
  dropZone.addEventListener('dragleave', dragLeave);
  dropZone.addEventListener('drop', drop);
});

// Função para lidar com a entrada de arrasto nas zonas de queda (pode ser deixada em branco)
function dragEnter() {
  // Implementação opcional
}

// Função para lidar com o arrasto sobre as zonas de queda
function dragOver() {
  this.classList.add('over');

  // Obtém o cartão que está sendo arrastado
  const cardBeingDragged = document.querySelector('.dragging');

  // Move o cartão para a zona de queda
  this.appendChild(cardBeingDragged);

  // Atualiza a classe de status do cartão com base no novo quadro
  switch (this.parentElement.id) {
    case 'todo':
      cardBeingDragged.firstElementChild.classList.add('todo');
      break;
    case 'doing':
      cardBeingDragged.firstElementChild.classList.add('doing');
      break;
    case 'review':
      cardBeingDragged.firstElementChild.classList.add('review');
      break;
    case 'done':
      cardBeingDragged.firstElementChild.classList.add('done');
      break;
    case 'trash':
      cardBeingDragged.firstElementChild.classList.remove('todo');
      break;
    default:
      break;
  }
}

// Função para lidar com a saída de arrasto das zonas de queda (pode ser deixada em branco)
function dragLeave() {
  // Implementação opcional
}

// Função para lidar com o abandono do cartão na zona de queda
function drop(event) {
  event.preventDefault();
  this.classList.remove('over');
}

// Obtém a zona de lixo e adiciona ouvintes de evento para a exclusão
const trashZone = document.getElementById('trash');
trashZone.addEventListener('dragover', allowDrop);
trashZone.addEventListener('drop', deleteCard);

// Função para permitir a queda na zona de lixo
function allowDrop(event) {
  event.preventDefault();
}

// Função para excluir o cartão da zona de lixo
function deleteCard(event) {
  event.preventDefault();

  // Obtém o cartão que está sendo arrastado
  const cardBeingDragged = document.querySelector('.dragging');

  // Remove o cartão se ele existir
  if (cardBeingDragged) {
    cardBeingDragged.parentElement.removeChild(cardBeingDragged);
  }
}
