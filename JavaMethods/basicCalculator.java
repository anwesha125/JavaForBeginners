package JavaMethods;
import java.util.Scanner;

public class basicCalculator {

    public static int add(int a, int b){
        return (a+b);
    }

    public static int subtract(int a, int b){
        return (a-b);
    }

    public static int multiply(int a, int b){
        return (a*b);
    }

    public static int divide(int a, int b){
        return (a/b);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char operator = sc.next().charAt(0);

        if(operator == '+'){
            System.out.println(add(n1,n2));
        }
        if(operator == '-'){
            System.out.println(subtract(n1,n2));
        }
        if(operator == '*'){
            System.out.println(multiply(n1,n2));
        }
        if(operator == '/'){
            System.out.println(divide(n1,n2));
        }

        sc.close();
    }
}
