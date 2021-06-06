package ex23.base;

import java.util.Scanner;

public class Enginestartanddie {
    public static void step(){
        String ask;
        Scanner in = new Scanner(System.in);
        System.out.print("Does the engine start and then die? ");
        ask = in.nextLine();
        if(ask.equals("y") || ask.equals("yes")||ask.equals("Yes")){
            carhavefuelinject.step();
        }
        else if(ask.equals("n") || ask.equals("no") || ask.equals("No")){
            System.out.print("This should not be possible.");
        }
    }
}
