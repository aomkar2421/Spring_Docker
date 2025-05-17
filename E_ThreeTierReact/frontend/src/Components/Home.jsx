import React, { useEffect, useState } from 'react'
import ProductService from '../service/ProductService';
import {toast} from 'react-toastify'
const Home = () => {

    const [allProducts, setAllProducts] = useState([]);

    useEffect(() => {
        init();
    }, [])

    const init = () => {
        ProductService.getAllProducts()
        .then((res) => {
            console.log(res.data)
            setAllProducts(res.data);
            // toast("succesful")
        }).catch((error)=>{
            toast("error occured : ", error)
        })
    }

    const updateProduct = () => {

    }

    const deletProduct = (id) => {
        ProductService.deleteProduct(id)
        .then((res)=>{
            toast("Product Deleted");
            init();
        }).catch((error)=>{
            toast("Error occured ", error)
        })
    }

    return (
        <div className='container mt-4'>
            <div className="row">
                <div className='col-md-12'>
                    <div className='card'>
                        <div className='card-header fs-3 text-center'>
                            All Products
                        </div>

                        <div className='card-body'>
                            <table className="table">
                                <thead className='w-100 bg-black'>
                                    <tr>
                                        <th scope='col'>Id</th>
                                        <th scope='col'>Name</th>
                                        <th scope='col'>Description</th>
                                        <th scope='col'>Price</th>
                                        <th scope='col'>Delete</th>
                                        <th scope='col'>Update</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        allProducts.map((product, num)=>(
                                            <tr>
                                                <td>{num+1}</td>
                                                <td>{product.name}</td>
                                                <td>{product.description}</td>
                                                <td>{product.price}</td>
                                                <td><button className='bg-danger text-white rounded-2' onClick={()=>deletProduct(product.id)}>DELETE</button></td>
                                                <td><button className='bg-primary text-white rounded-2' onClick={updateProduct}>UPDATE</button></td>
                                            </tr>
                                        ))
                                    }
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Home