package ex23.base;

import java.util.Scanner;

public class carhavefuelinject {
    public static void step(){
        String ask;
        Scanner in = new Scanner(System.in);
        System.out.print("Does you car have fuel injection? ");
        ask = in.nextLine();
        if(ask.equals("y") || ask.equals("yes") || ask.equals("Yes")){
            System.out.print("Get it in for service.");
        }
        else if(ask.equals("n") || ask.equals("no") || ask.equals("No")){
            System.out.print("Check to ensure the choke is opening and closing.");
        }
    }
}
