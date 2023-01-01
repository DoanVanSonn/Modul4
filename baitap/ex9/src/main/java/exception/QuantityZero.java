package exception;

public class QuantityZero extends Exception{
    public QuantityZero(String errorLine){
        super(errorLine);
    }
}
