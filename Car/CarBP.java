public class CarBP {
    String make;
    String model;
    double year;
    double mileage;
    String trim;
    String oilChange;
    String carWash;
    public CarBP(String make, String model, int year,  int mileage, String trim, String oilChange, String carWash) {
        this.make = make;
        this.model= model;
        this.year= year;
        this.mileage= mileage;
        this.trim=trim;
        this.oilChange= oilChange;
        this.carWash=carWash;
    }
    public String carInfo(){
        return("Make: " + this.make + "\r\n" +
        "Model: " + this.model + "\r\n"+
        "Year: " + this.year + "\r\n"+
        "Mileage: "+ this.mileage+ "\r\n"+
        "Trim: "+ this.trim+ "\r\n"+
        "Oil Change: "+ this.oilChange+ "\r\n"+
        "Car Wash: "+ this.carWash);
    }

    public String changeOil(){
        if(oilChange.equals("yes")){
            System.out.println("Looks like your "+ model + " needs an oil change, let me do that for you real quick!");
            oilChange = "Come back in when the oil change lights comes on and we will give you a 5% discount!";
        }
        else{
            System.out.println("Looks like your "+ model + " is good on oil, bring it back when the oil change light comes on!");
        }
        return oilChange;
    }

    public String washCar(){
        if(carWash.equals("yes")){
            System.out.println("Looks like your "+ model + " needs an car wash, let me do that for you real quick!");
            oilChange = "Crazy what a wash can do to a car huh?";
        }
        else{
            System.out.println("Looks like your "+ model + " already looks squeaky clean, bring it back when it gets dirty!");
        }
        return carWash;
    }
}