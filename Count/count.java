import java.util.*;
public class count {
    static int countRabbits(int Heads,int Legs)
{
    int count = 0;
    count = (Legs) - 2 * (Heads);
    count = count / 2;
    return count;
}
public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    System.out.println("How many heads did you count in the zoo?");
    int heads = scan.nextInt();
    System.out.println("How many legs did you count in the zoo?");
    int legs = scan.nextInt();
    if(legs%2 != 0 || heads ==0 || heads>legs){
        System.out.println("No way you counted that, recount and come back!");
    }
    else{
    int Rabbits = countRabbits(heads, legs);
    System.out.println("Rabbits = " + Rabbits);
    System.out.println("Chickens = " +(heads - Rabbits));
    }
}
}
