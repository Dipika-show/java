import java.util.*;
public class sumAllNum {
    public static void sumOfn(int n){
        int sum =0;
       //loops
       for(int i=1; i<=n;i++){
        if(i%2!=0){
            sum = sum + i;;
            
        }
        }
        System.out.println("Sum of all number is:" +sum);
       }
       

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sumOfn(n);
        
    }

    

}
