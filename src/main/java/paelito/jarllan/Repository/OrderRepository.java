package paelito.jarllan.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import paelito.jarllan.Model.Order;


public interface OrderRepository extends JpaRepository <Order, Long>{

}