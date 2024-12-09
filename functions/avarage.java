import java.util.*;
public class avarage {

    public static void printAvg(float a, float b, float c){
        float avarage = (a+b+c)/3;
        System.out.println(" The avarage is :" + avarage);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        printAvg(a, b, c);
    }
}
