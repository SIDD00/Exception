package UserDefinedExceptions;

public class InsufficientFundsException extends Exception {
    private double amt;
    public InsufficientFundsException(double amt){
        this.amt=amt;
    }
    public double getAmt(){
        return this.amt;
    }
}
