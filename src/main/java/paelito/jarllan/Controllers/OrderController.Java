package paelito.jarllan.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import paelito.jarllan.Model.Order;
import paelito.jarllan.NotFoundException.OrderNotFoundException;
import paelito.jarllan.Repository.OrderRepository;

@RestController
public class OrderController {

    private final OrderRepository repo;

    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    // Endpoint to retrieve all orders
    @GetMapping("/orders")
    public List<Order> getOrders() {
        return repo.findAll();
    }

    // Endpoint to retrieve a single order by orderId
    @GetMapping("/order/{id}")
    public Order getOrder(@PathVariable Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new OrderNotFoundException(id));
    }

    // Endpoint to create a new order
    @PostMapping("/order/new")
    public String addOrder(@RequestBody Order newOrder) {
        repo.save(newOrder);
        return "A new order is added!";
    }

    // Endpoint to delete an order by orderId
    @DeleteMapping("/order/delete/{id}")
    public String deleteOrder(@PathVariable Long id) {
        repo.deleteById(id);
        return "An order is deleted!";
    }
}
