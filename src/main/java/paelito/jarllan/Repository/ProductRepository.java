package paelito.jarllan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import paelito.jarllan.Model.Product;


public interface ProductRepository extends JpaRepository <Product, Long>{

}

