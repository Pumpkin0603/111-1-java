import java.util.Scanner;

public class Test5{
    public static void main(String[] args){
        int num1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Emter first integer:");
        num1 = input.nextInt();
        
        if (num1 >= 90 & num1 <= 100){
            System.out.println("A");
        }
        else if (num1 >= 80 & num1 < 90){
            System.out.println("B");
        }
        else if (num1 >= 70 & num1 < 80){
            System.out.println("C");
        }
        else if (num1 >= 60 & num1 < 70){
            System.out.println("D");
        }
        else {
            System.out.println("E");
        }
    }
}
