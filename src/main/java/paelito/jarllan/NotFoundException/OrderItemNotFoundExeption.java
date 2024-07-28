package paelito.jarllan.NotFoundException;

public class OrderItemNotFoundExeption extends RuntimeException{
    public OrderItemNotFoundExeption(Long orderItemId){
        super("Could not found prodcuct with" + orderItemId);
    }
    
}
