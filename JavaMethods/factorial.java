import java.util.Scanner;

class factorial{
    public static int fact(int n){
        if(n==0|| n==1){
            return 1;
        }
        else{
            return (n*(fact(n-1)));
        }
    }

    public static void main(String[] args){

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + fact(num));
        sc.close();
    }
}