import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {

        String regex = "#(\\w{6})" ;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите цвет: \n ");
        String s = sc1.nextLine();
        Pattern p2 = Pattern. compile (regex);
        Matcher m2 = p2.matcher(s);
        boolean b1 = m2.matches();
        System.out.println( b1);
    }
}