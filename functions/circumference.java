import java.util.*;
public class circumference {
    public static Double circumference(Double r){
        Double total = 2 *3.14 *r;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println(circumference(r));
    }
}
