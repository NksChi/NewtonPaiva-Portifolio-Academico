import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Login from './Componentes/Login/Login.jsx';
import Kanban from './Componentes/Kanban/Kanban.jsx';

const App = () => {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/kanban" element={<Kanban />} />
      </Routes>
    </Router>
  );
};

export default App;