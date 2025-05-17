import axios from 'axios'

const API_URL = "http://localhost:8080";

class ProductService{

    saveProduct(product){
        return axios.post(API_URL+"/", product);
    }

    getAllProducts(){
        return axios.get(API_URL+"/")
    }

    deleteProduct(id){
        return axios.delete(API_URL+`/delete/${id}`);
    }

    updateProduct(product, id){
        axios.post(`${API_URL}/product/${id}`, product);
    }
}

export default new ProductService();