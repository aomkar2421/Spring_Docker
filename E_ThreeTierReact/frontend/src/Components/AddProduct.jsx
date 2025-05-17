import React, { useState } from 'react';
import ProductService from '../service/ProductService';
import { toast } from 'react-toastify';

const AddProduct = () => {
    const [product, setProduct] = useState({
        name: "",
        description: "",
        price: ""
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setProduct({ ...product, [name]: value });
    };

    const saveProduct = (e) => {
        e.preventDefault();
        console.log(product);
        const payload = {
            ...product,
            price: parseFloat(product.price) // ensure it's a number
        };
        ProductService.saveProduct(payload)
            .then((res) => {
                console.log(res);
                toast("Product Added");
            })
            .catch((err) => {
                toast(err);
            })
        setProduct({
            name: "",
            description: "",
            price: ""
        })
    };

    return (
        <div className='container'>
            <div className='row'>
                <div className='col-md-12'>
                    <div className='col-md-6 offset-md-3'>
                        <div className='card'>
                            <div className='card-header text-center fs-5'>
                                Add Product
                            </div>
                            <div className='card-body'>
                                <form onSubmit={saveProduct}>
                                    <div className="mb-3">
                                        <label className="form-label">Product Name</label>
                                        <input
                                            type="text"
                                            className="form-control"
                                            name="name"
                                            value={product.name}
                                            onChange={handleChange}
                                        />
                                    </div>
                                    <div className="mb-3">
                                        <label className="form-label">Product Description</label>
                                        <input
                                            type="text"
                                            className="form-control"
                                            name="description"
                                            value={product.description}
                                            onChange={handleChange}
                                        />
                                    </div>
                                    <div className="mb-3">
                                        <label className="form-label">Product Price</label>
                                        <input
                                            type="text"
                                            className="form-control"
                                            name="price"
                                            value={product.price}
                                            onChange={handleChange}
                                        />
                                    </div>
                                    <div className='mb-3'>
                                        <button type="submit" className='col-md-12 btn btn-primary'>
                                            Submit
                                        </button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default AddProduct;
