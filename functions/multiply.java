import java.util.*;
public class multiply {
    public static int multiplication(int a,int b) {
        int multiply = a * b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int multiply= multiplication(a,b);
        System.out.println("Multiplication of these 2 number is:" + multiply);
        }
}
