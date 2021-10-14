package Booking;

public class InvalidCouponCodeException extends Exception {
    protected String message;
    public InvalidCouponCodeException(String message){
        super(message);
    }
}
