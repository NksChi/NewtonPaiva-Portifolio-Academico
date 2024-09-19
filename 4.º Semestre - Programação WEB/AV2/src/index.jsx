import React from 'react';
import ReactDOM from 'react-dom/client';
import {createBrowserRouter, RouterProvider} from 'react-router-dom';

import App from './App'
import Read from './Componentes/Read'
import Create from './Componentes/Create'

const router = createBrowserRouter([
  {
    path: '/', element: <App/>
  },
  {
    path: '/contato/new', element: <Read/>
  },
  {
    path: '/contato', element: <Create/>
  }
]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
)