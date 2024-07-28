package paelito.jarllan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
    public Long getId() {
        return id;
    }


    private @Id
    @GeneratedValue Long id;
    private String productName;
    private String description;
    private double price;
    private String url;

    Product(){}
    
    public Product(String productName, String description, double price, String url) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.url = url;
    }

    //getters
    
    public long Id() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }


    //setters

    public void setProductName(String productName) {
        this.productName = productName;
    }



    public void setDescription(String description) {
        this.description = description;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    


}
