import java.util.Scanner;

public class Test7{
    public static void main(String[] args){
        int grade;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Emter first integer:");
        grade = input.nextInt();
        
        if(grade <= 100 && grade >= 0){
            switch (grade / 10){
                case 9:
                case 10:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("E");
                    break;
            }
        }
        else {    
            System.out.println("pls type 0~100");
        }
    }
}
