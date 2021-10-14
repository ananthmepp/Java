package Booking;

public class BusBooking {
    private int bookingId;
    private String destination;
    private String tripPackage;
    private double totalAmount;
    public BusBooking(int bookingId, String destination, String tripPackage){
        this.bookingId=bookingId;
        this.destination=destination;
        this.tripPackage=tripPackage;
        this.totalAmount=0;
    }
    public double getTotalAmount(){
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount){
        this.totalAmount=totalAmount;
    }
    public int getBookingId(){
        return bookingId;
    }
    public void setBookingId(int bookingId){
        this.bookingId=bookingId;
    }
    public String getDestination(){
        return destination;
    }
    public void setDestination(String destination){
          this.destination= destination;
    }
    public String getTripPackage(){
        return tripPackage;
    }
    public void setTripPackage(String tripPackage){
          this.tripPackage= tripPackage;
    }
    public boolean validateCouponCode(String couponCode, int numberOfMembers){
        try{
            if(couponCode.equals("BIGBUS")&& numberOfMembers >= 10 || couponCode.equals("MAGICBUS") && numberOfMembers >= 15){
                return true;
            }
            else{
                throw new InvalidCouponCodeException("Invalid Coupon Code");
            }
        }
        catch(InvalidCouponCodeException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        
    }
    public String bookTrip(String couponCode, int numberOfMembers){
        if(!destination.equals("Washington DC")|| !destination.equals("Philadelphia")|| !destination.equals("Orlando")|| !destination.equals("Boston")||!destination.equals("Atlanta")){
            return "Invalid destination";
        }
        if(!this.tripPackage.equals( "Regular") && !this.tripPackage.equals("Premium")){
            return "Invalid package";
        }
        try{
            this.validateCouponCode(couponCode, numberOfMembers);
        }
        catch(InvalidCouponCodeException ex){
            System.out.println(ex.getMessage());
            return "Invalid coupon code";
        }
        if(this.tripPackage.equals("Regular")){
            this.totalAmount = numberOfMembers * 500;
        }
        if(this.tripPackage.equals("Premium")){
            this.totalAmount = numberOfMembers * 800;
        }
        if(this.tripPackage.equals("Premium")){
            this.totalAmount = numberOfMembers*800;
        }
        return "Booking Successful";
    }

}
