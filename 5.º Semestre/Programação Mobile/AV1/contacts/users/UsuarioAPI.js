const URL = 'https://6f913eb1-8464-419a-a293-2e04ea7fab9d-00-3g2ud43vejmtp.picard.replit.dev/users';

export async function findAll(){
  const requestInit = {
    method: 'GET',
    headers: {
      Authorization: '12116208'
    }
  }

  const responseHTTP = await fetch(URL, requestInit);

  if (responseHTTP.ok) {
    const responseBody = await responseHTTP.json();  

    return responseBody.data;
  } else {
    console.log('Erro ao executar a api GET /users');

    throw new Error(
      'Não foi possível recuperar as consultas. Tente novamente em alguns minutos.'
    )
  }
}

export async function remove(id) {
  const requestInit = {
    method: 'DELETE',
    headers: {
      Authorization: '12116208',
    },
  };

  const responseHTTP = await fetch(`${URL}/${id}`, requestInit);
  if (!responseHTTP.ok) {
    console.log('Erro ao executar a api DELETE /users/{id}');

    throw new Error(
      'Não foi possível cancelar a consulta. Tente novamente em alguns minutos.'
    );
  }
}
