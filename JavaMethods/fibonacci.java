import java.util.*;
public class fibonacci {
    public static int fibo(int n){
        if (n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }
        else{
            return ((fibo(n-1)) + fibo(n-2));
        }
    }

    public static void main(String[] args){

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The first " + num + " numbers of fibo series: " );
        for(int i=0; i<num;i++){
            System.out.println(fibo(i) + " ");
        }
        sc.close();
    }
}

