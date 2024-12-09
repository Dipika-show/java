import java.util.*;
public class factorial {
    public static void printFactorial(int n){
        int factorial=1;
        //condition
        if(n<0){
            System.out.println("invalid input");
            return;
        }
        //loops
        for(int i=n; i>=1; i--){
            factorial= factorial *i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        //calling the function
        printFactorial(n);

    }
}
