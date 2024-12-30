import java.util.Scanner;

public class addition {
    public static void main(String[] args){
        int x,y,sum;
        Scanner myObj= new Scanner (System.in);
        System.out.println("enter value of X:");
        x = myObj.nextInt();

        System.out.println("enter value of Y:");
        y = myObj.nextInt();

        sum=x+y;
        System.out.println("addition of X , Y ="+sum);

        myObj.close();
    }
    
}