import java.util.Scanner;

public class Test10{
    public static void main(String[] args){
        int row = 0;
        int t;
        while (row < 9){  
            t = row;
            if(row >= 5){
                t = 8 - row;
            }
            int star = 0;
            while(star <= t){
                System.out.printf("*");
                star = star + 1;  
            }
            System.out.println("");       
            row = row + 1;
        }
    }
}