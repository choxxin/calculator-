import java.util.*;
public class rand {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first no");
        double a = sc.nextDouble();
        
        char c = sc.next().charAt( 0);
        System.out.println("eneter the 2nd no");
        double b = sc.nextDouble() ;

        switch(c){
            case '+' : System.out.println("sum is :-" + a+b );
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/'  : System.out.println(a/b);
                break;
            default : System.out.println("error");
            sc.close();
        }

        
    }

    
}
