import java.util.Random;
import java.util.Scanner;


public class stone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Random x = new Random();
        System.out.println("Press any key to generate a random number from 0 to 9 (Press 'q' to quit)");
        Random x = new Random();

        for(int i=0;i<=20;i++){
            sc.nextLine();
            int n = x.nextInt(10); // Generates random number between 0 and 9
            System.out.println("Random Number 1: " + n);
        
        
            if(n>=1 && n<=3){
                String a = "Stone";
                System.out.println(a);
                Random y = new Random();
                sc.nextLine();
                int p = y.nextInt(1,6);
                System.out.println("Random Number 2: " + p);
                if(p>=1 && p<=3){
                    String b = "Paper";
                    System.out.println(b);
                }
                else if(p>=4 && p<=6){
                    String c = "Scisor";
                    System.out.println(c);
                }

                else{
                    System.out.println("You won extra chance..");
                }
                
            }
            else if(n>=7 && n<=9){
                String c = "Scisor";
                System.out.println(c);
                Random y = new Random();
                sc.nextLine();
                int p = y.nextInt(1,6);
                System.out.println("Random Number 2: " + p);
                if(p>=1 && p<=3){
                    String a = "Stone";
                    System.out.println(a);
                }
                else if(p>=4 && p<=6){
                    String b = "Paper";
                    System.out.println(b);
                }
                else{
                    System.out.println("You won extra chance..");
                }
                
            }
            else if(n>=4 && n<=6){
                String b = "Paper";
                System.out.println(b);
                Random y = new Random();
                sc.nextLine();
                int p = y.nextInt(1,6);
                System.out.println("Random Number 2: " + p);
                if(p>=1 && p<=3){
                    String c = "Scisor";
                    System.out.println(c);
                }
                else if(p>=4 && p<=6){
                    String a = "Stone";
                    System.out.println(a);
                }
                else{
                    System.out.println("You won extra chance..");
                }
                
            }
            else{
                System.out.println("You won extra chance..");
            }

        }  
        sc.close();
        
        
    }
}
