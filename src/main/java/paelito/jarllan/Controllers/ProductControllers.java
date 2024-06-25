package paelito.jarllan.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import paelito.jarllan.Model.Product;
import paelito.jarllan.Repository.ProductRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProductControllers {

    ProductRepository repo;

    public ProductControllers(ProductRepository repo) {
        this.repo = repo;
    }
      
     //127.0.0.1:8080/products
    @GetMapping("/products")
    public List <Product>getProducts() {
        return repo.findAll();
    }

  /*  public Product geProduct(Long id){
        return repo.findByid(id);
    } */

    //http:127.0.0.1:8080/product/new
    @PostMapping("/product/new")
    public String addProduct(@RequestBody Product newProduct){
        repo.save(newProduct);
        return "A new product is added. Yey!";
    } 
}
