package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.logging.Logger;

@Aspect
@Component
public class AddRent {
    private Logger logger = Logger.getLogger(AddRent.class.getName());
    @AfterReturning("execution(* codegym.vn.appborrowbook.service.iml.PersonBookBorrowerService.*(..))")
    public void writeLogPersonBookBorrowerServiceCreate(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        logger.info("AfterReturning: person borrower service End call " + methodName );
    }
    @AfterReturning("execution(* codegym.vn.appborrowbook.service.iml.BookService.*(..))")
    public void writeLogBookService(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        logger.info("AfterReturning: book service End call " + methodName );
    }
    @AfterReturning("execution(* codegym.vn.appborrowbook.controller.PersonController.*(..))")
    public void returnRentList(JoinPoint point) {
        String methodName = point.getSignature().getName();
        logger.info("Controller " + methodName + LocalDateTime.now());
    }
}
