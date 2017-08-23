import javax.swing.*;
import java.util.Scanner;

public class EvenEntryLoopJava {
    public static void main(String[] args) {
        final int sentinelvalue = 999;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an even number or 999 to exit");
        int inputnum = input.nextInt();
        while ( inputnum != sentinelvalue){
            if(inputnum % 2 == 0){
            System.out.println("Good Job");
            System.out.println("Enter an even number or 999 to exit");
            inputnum = input.nextInt();}

            else{
                System.out.println("ERROR: Please enter a even number ");
                System.out.println("Enter an even number or 999 to exit");
                inputnum = input.nextInt();

            }

        }
        System.out.println("goodbye");
        System.exit(0);





    }



}
