
import java.util.Scanner;

public class AboutMe{
    public static void main(String[] args) {
        String fName = "Ananth";
        String lName = "Mepperla";
        Boolean grad = true;
        String Graduat;
        int gradYear = 2021;
        if (grad == true){
            Graduat = "graduated";
        }
        else{
            Graduat = "not graduated";
        }
        char f = fName.charAt(0);
        char l = lName.charAt(0);
        String major = "Information Security";
        String university = "Arizona State";
        String [][] workExp = {
            {"SBM Management", "Technical Writer Intern"},
            {"City of Hope", "Project Management Intern"}
        };
        System.out.println("My name is "+ fName + " " + lName+ ". "+ "I went to " + university +", studied "+ major + " and "+ Graduat + " in " + gradYear+ ".");
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        System.out.println("Nice to meet you, "+ userName+ "!");

        Boolean emp = false;
        while(emp == false)
        {
            System.out.println("How's the job search?");
            System.out.println("Get a job yet?");
            String userAns = input.next();
            
            if (userAns.equals("yes")){
                emp = true;
                System.out.println("Wow congrats!");
            }
            else{
                System.out.println("Tough luck, keep applying :(");
            }
        }


    }
}