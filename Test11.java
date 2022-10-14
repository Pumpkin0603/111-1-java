import java.util.Scanner;

public class Test11{
    public static void main(String[] args){
        int row = 0;
        
        String blank = " ";
        String star = "*";
        
        while (row < 5){
            int b = 3 - row;
            while(b >= 0){
                System.out.printf(blank);
                b = b - 1;
            }
            System.out.printf(star);    
            star = star + "**";
            System.out.println("");       
            row = row + 1;
        }
    }
}