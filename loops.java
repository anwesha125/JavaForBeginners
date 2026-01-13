public class loops {
    public static void main(String[] args) {
         System.out.print("For Loop: ");
        // Print numbers 1 to 5 using for loop
        for(int i=1; i<=5; i++){
            System.out.print(i + " ");
        }
         System.out.println();

        // Print numbers 1 to 5 using while loop
        int j=1;
        System.out.print("While Loop: ");
        while(j<=5){
             System.out.print(j +" " );
             j++;
        }
        System.out.println();

        // Print numbers 1 to 5 using do-while loop
        int k=1;
        System.out.print("Do-While Loop: ");
        do{
            System.out.print(k + " ");
            k++;
        }while(k<=5);
    }
}
 
