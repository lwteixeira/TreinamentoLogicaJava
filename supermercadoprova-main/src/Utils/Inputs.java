package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputs {

    public static String inputString(){
        return new Scanner(System.in).nextLine();
    }

    public static int inputInt(){
        try {
        	return new Scanner(System.in).nextInt();
        }catch (InputMismatchException e) {
			// TODO: handle exception]
        	return 9999;
		}
    }

    public static double inputDouble(){
        return new Scanner(System.in).nextDouble();
    }

}
