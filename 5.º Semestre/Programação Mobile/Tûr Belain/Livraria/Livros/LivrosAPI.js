const URL = 'https://api-livro-dot-api-samples-423102.uc.r.appspot.com/api/livros';
const AUTH_TOKEN = 'Bearer 12116208';

const requestHeaders = {
  Authorization: AUTH_TOKEN,
  'Content-Type': 'application/json',
};

export async function findAll() {
  try {
    const response = await fetch(URL, { 
      method: 'GET', 
      headers: { Authorization: AUTH_TOKEN } }
      );

    if (!response.ok) {
      console.error('Erro ao executar a API GET /livros');
      throw new Error('Não foi possível recuperar os livros. Tente novamente em alguns minutos.');
    }

    return await response.json();
  } catch (error) {
    console.error(error.message);
    throw error;
  }
}

export async function insert(titulo, autor, anoPublicacao, preco, editoraNome, editoraCnpj) {
  const requestBody = JSON.stringify({
    titulo,
    autor,
    anoPublicacao,
    preco,
    editora: { nome: editoraNome, cnpj: editoraCnpj },
  });

  try {
    const response = await fetch(URL, { method: 'POST', headers: requestHeaders, body: requestBody });

    if (!response.ok) {
      const errorResponse = await response.text();
      console.error('Erro ao executar a API POST /livros', errorResponse);
      throw new Error('Não foi possível inserir o livro. Tente novamente em alguns minutos.');
    }

    return await response.json();
  } catch (error) {
    console.error('Erro ao inserir livro:', error);
    throw error;
  }
}

export async function remove(id) {
  try {
    const response = await fetch(`${URL}/${id}`, { method: 'DELETE', headers: { Authorization: AUTH_TOKEN } });

    if (!response.ok) {
      console.error('Erro ao executar a API DELETE /livros/{id}');
      throw new Error('Não foi possível excluir o livro. Tente novamente em alguns minutos.');
    }
  } catch (error) {
    console.error(error.message);
    throw error;
  }
}

export async function update(id, titulo, autor, anoPublicacao, preco, editoraNome, editoraCnpj) {
  const requestBody = JSON.stringify({
    titulo,
    autor,
    anoPublicacao,
    preco,
    editora: { nome: editoraNome, cnpj: editoraCnpj },
  });

  const requestInit = {
    method: 'PUT',
    headers: {
      ...requestHeaders,
      'Content-Type': 'application/json',
    },
    body: requestBody,
  };

  try {
    const response = await fetch(`${URL}/${id}`, requestInit);

    if (!response.ok) {
      const errorResponse = await response.text();
      console.error('Erro ao executar a API PUT /livros/{id}', errorResponse);
      throw new Error('Não foi possível atualizar o livro. Tente novamente em alguns minutos.');
    }

    return await response.json();
  } catch (error) {
    console.error('Erro ao atualizar o livro:', error.message);
    throw error;
  }
}
