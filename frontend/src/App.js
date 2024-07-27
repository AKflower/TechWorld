import logo from './logo.svg';
import ProductDetail from './pages/ProductDetail/productDetail';
import './App.css';

import { BrowserRouter, Route, Link, Routes, useLocation, useNavigate } from 'react-router-dom';
import Home from './pages/Home/home';

function App() {
  return (

    <BrowserRouter>

    <Routes>
    <Route path='/' element={<Home />}/>
    <Route path='/detail' element={<ProductDetail />} />
    </Routes>
   
    </BrowserRouter>
  );
}

export default App;
