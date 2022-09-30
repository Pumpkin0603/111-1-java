import java.util.Scanner;

public class Test4{
    public static void main(String[] args){
        int num1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Emter first integer:");
        num1 = input.nextInt();
        
        if (num1 >= 60 & num1 <= 70){
                System.out.println("<=70");
            }
        else {
            System.out.println("<60");
        }
    }
}
