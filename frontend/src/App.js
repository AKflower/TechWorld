import logo from './logo.svg';
import ProductDetail from './pages/ProductDetail/productDetail';
import Cart from './pages/Cart/cart';
import Login from './Login/login';
import './App.css';

import { BrowserRouter, Route, Link, Routes, useLocation, useNavigate } from 'react-router-dom';
import Home from './pages/Home/home';

function App() {
  return (

    <BrowserRouter>

    <Routes>
    <Route path='/home' element={<Home />}/>
    <Route path='/detail' element={<ProductDetail />} />
    <Route path='/home/cart' element={<Cart />} />
    <Route path='/' element={<Login />} />
    </Routes>
   
    </BrowserRouter>
  );
}

export default App;
