import { useState } from 'react'
import Navbar from './Components/Navbar'
import { Route, Routes } from 'react-router-dom'
import AddProduct from './Components/AddProduct'
import EditProduct from './Components/EditProduct'
import Home from './Components/Home'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Navbar />
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/addProduct' element={<AddProduct />} />
        <Route path='/editProduct' element={<EditProduct />} />
      </Routes>
    </>
  )
}

export default App
