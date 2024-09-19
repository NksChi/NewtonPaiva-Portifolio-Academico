const URL = 'https://user-api.tarleylana.repl.co/users';

export async function findAll() {
  const options = {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json',
      'Authorization': '12116208'
    }
  };

  const httpResponse = await fetch(URL, options);

  if (httpResponse.ok) {
    return await httpResponse.json();
  }
}

export async function insert(contato) {
  const options = {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
      'Authorization': '12116208'
    },
    body: JSON.stringify(contato)
  };

  const httpResponse = await fetch(URL, options);
  if (httpResponse.ok) {
    return await httpResponse.json();
  }
}

export async function remove(id) {
  const options = {
    method: 'DELETE',
    headers: {
      'Content-Type': 'application/json',
      'Authorization': '12116208'
    }
  };

  const httpResponse = await fetch(`${URL}/${id}`, options);
  if (httpResponse.ok) {
    return await httpResponse.json();
  }
}

export async function update(id, novocontato) {
  const options = {
    method: 'PUT',
    headers: {
      'Content-Type': 'application/json',
      'Authorization': '12116208'
    },
    body: JSON.stringify(novocontato)
  };

  const httpResponse = await fetch(`${URL}/${id}`, options);
  if (httpResponse.ok) {
    return await httpResponse.json();
  }
}
