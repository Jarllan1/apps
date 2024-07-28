package paelito.jarllan.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import paelito.jarllan.NotFoundException.OrderItemNotFoundExeption;

@RestControllerAdvice
public class OrderItemExceptionHandler {
    @ExceptionHandler(OrderItemNotFoundExeption.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String OrderItemNotFoundHandler(OrderItemNotFoundExeption e){
        return e.getMessage();
    }
}
