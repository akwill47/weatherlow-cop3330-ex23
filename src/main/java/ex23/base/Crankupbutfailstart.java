package ex23.base;
import java.util.Scanner;

public class Crankupbutfailstart {
    public static void step(){
        String ask;
        Scanner in = new Scanner(System.in);
        System.out.print("Check spark plug connections. ");
        ask = in.nextLine();
        if(ask.equals("y") || ask.equals("yes") || ask.equals("Yes")){
            System.out.print("Check to ensure the choke is opening and closing.");
        }
        else if(ask.equals("n") || ask.equals("no") || ask.equals("No")){
            Enginestartanddie.step();
        }
    }
}
