package ex23.base;
import java.util.Scanner;
public class BatteryCorroded {

    public static void step(){
        String ask;
        Scanner in = new Scanner(System.in);
        System.out.print("Are the battery terminals corroded? ");
        ask = in.nextLine();
        if(ask.equals("y") || ask.equals("yes") || ask.equals("Yes")){
            System.out.print("Clean the terminals and try again");
        }
        else if(ask.equals("n") || ask.equals("no") || ask.equals("No")){
            System.out.print("Replace cables and try again.");
        }
    }
}
