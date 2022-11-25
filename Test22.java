import java.util.Scanner;

public class Test22 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("輸入公里數：");
        int i = input.nextInt();
        
        if(i<7){
            System.out.print("總共85元");
        }else{
            System.out.printf("總共%d元",85+(i-7)*5);
        }       
    }
}
