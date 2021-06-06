package ex23.base;

import java.util.Scanner;

public class slickingNoise {
    public static void step(){
        String ask;
        Scanner in = new Scanner(System.in);
        System.out.print("Does the car make a slicking noise? ");
        ask = in.nextLine();
        if(ask.equals("y") || ask.equals("yes")||ask.equals("Yes")){
            System.out.print("Replace the battery.");
        }
        else if(ask.equals("n") || ask.equals("no") || ask.equals("No")){
            Crankupbutfailstart.step();
        }
    }
}
