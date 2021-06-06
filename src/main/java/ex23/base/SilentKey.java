package ex23.base;
import java.util.Scanner;
public class SilentKey {

    public static void step(){
        Scanner in = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String ask;
        ask = in.nextLine();
        if(ask.equals("y") || ask.equals("yes")||ask.equals("Yes")){
           BatteryCorroded.step();
        }
        else if(ask.equals("n") || ask.equals("no") || ask.equals("No")){
            slickingNoise.step();
        }
    }
}
