
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);
        System.out.println("first side : ");
        double side1 = newscanner.nextDouble();
        System.out.println("secound side: ");
        double side2 = newscanner.nextDouble();
        double hypotenuse = calculateHypotenuse(side1, side2);
        newscanner.close();
        System.out.println("Hypotenus : " + hypotenuse);
    }
    public static double calculateHypotenuse (double side1 , double side2) {
        return Math.sqrt(side1 * side1 + side2 * side2);
    }

}
