import logo from './logo.svg';
import ProductDetail from './pages/ProductDetail/productDetail';
import Cart from './pages/Cart/cart';
import Register from './pages/Register/register';
import Login from './pages/Login/login';
import { ToastContainer, toast } from 'react-toastify';
import './App.css';

import { BrowserRouter, Route, Link, Routes, useLocation, useNavigate } from 'react-router-dom';
import Home from './pages/Home/home';

function App() {
  return (

    <BrowserRouter>
    <ToastContainer />
    <Routes>
    <Route path='/home' element={<Home />}/>
    <Route path='/detail' element={<ProductDetail />} />
    <Route path='/home/cart' element={<Cart />} />
    <Route path='/login' element={<Login />} />
    <Route path='/register' element={<Register />} />
    </Routes>
   
    </BrowserRouter>
  );
}

export default App;
