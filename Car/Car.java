import java.util.*;
public class Car {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the make of your vehicle: ");
        String uMake = input.next();

        System.out.println("Please enter the model of your vehicle: ");
        String uModel = input.next();

        System.out.println("Please enter the year of your vehicle: ");
        int uYear = input.nextInt();

        System.out.println("Please enter the milage of your vehicle: ");
        int uMileage = input.nextInt();

        System.out.println("Please enter the trim of your vehicle: ");
        String uTrim = input.next();

        System.out.println("Do you need your oil changed? Please answer yes or no.");
        String uOC = input.next();

        System.out.println("Do you need a car wash? Please answer yes or no.");
        String uW = input.next();



        CarBP uInput = new CarBP(uMake, uModel, uYear, uMileage, uTrim, uOC, uW);
        System.out.println(uInput.carInfo());
        
        if(uOC.equals("yes")){
            System.out.println(uInput.changeOil());
        }

        if(uW.equals("yes")){
            System.out.println(uInput.washCar());
        }

        
    }
}
