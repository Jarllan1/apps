package paelito.jarllan.NotFoundException;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException(Long orderid){
        super("Order Could not found  with" + orderid);
    }
    
}
