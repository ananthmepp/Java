import java.util.Scanner;
import java.util.ArrayList;
public class  Restaurant {
    public static void main(String[] args) {
        ArrayList<BPRestaurant> catalog = new ArrayList<BPRestaurant>();
        Scanner input = new Scanner(System.in);
        int add;
        boolean mainLoop = true;
        int intInput;
        while(true){
        System.out.println("Welcome to Ananth, restaurants catalog, please input your restaurants info when prompted.");
        System.out.println("1. View Catalog Entries");
        System.out.println("2. Add a Restaurant");
        System.out.println("Enter a number to choose");
        add = input.nextInt();
            switch(add){
                case 1:
                for (int i = 0; i < catalog.size();i++) 
                        { 		      
                            System.out.println(catalog.get(i)); 		
                        }   
                break;
                case 2:
                System.out.println("What is the name of your restaurant?");
                String restaurantName = input.next();
                System.out.println("What is a good contact number for your restaurant?");
                long restaurantContact = input.nextLong();
                System.out.println("Where is the restaurant located?");
                String restaurantAddress = input.next();
                System.out.println("What is your restaurant rated on Yelp?");
                float rating = input.nextFloat();
                System.out.println("What type of restaurant?");
                String type = input.next();
                catalog.add(new BPRestaurant(restaurantName, restaurantContact, restaurantAddress, rating, type));
             } 
    }
}
}
