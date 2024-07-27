import logo from './logo.svg';
import './App.css';

import { BrowserRouter, Route, Link, Routes, useLocation, useNavigate } from 'react-router-dom';
import Home from './pages/Home/home';

function App() {
  return (

    <BrowserRouter>

    <Routes>
    <Route path='/' element={<Home />}/>
    </Routes>
   
    </BrowserRouter>
  );
}

export default App;
