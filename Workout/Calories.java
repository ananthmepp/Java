public class Calories{
    public static double calsCalc(double hoursPerDay, double calsPerHour){
        if(hoursPerDay < 1){
            System.out.println("Stop being lazy, get after it!!");
        }
        if(calsPerHour<400){
            System.out.println("Gotta start working out harder!");
        }
        double dailyBurn = hoursPerDay * calsPerHour;
        return dailyBurn *7;
    }
    public static void main(String[] args) {
        double calories = calsCalc(.5, 300);
        System.out.println(calories);
    }
}