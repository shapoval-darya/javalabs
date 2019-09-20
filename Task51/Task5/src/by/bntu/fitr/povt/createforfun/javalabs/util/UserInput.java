package by.bntu.fitr.povt.createforfun.javalabs.util;
import java.util.Scanner;
public class UserInput {
    public static int inputint(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String  inputstring(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
