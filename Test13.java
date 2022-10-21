//import java.util.Scanner;

public class Test13 {
    public static void main(String[] args){
        int blank = 4;
        int star = 0;
        int i,j;

        for( i=0 ;  i<9 ; i++){

            for( j=0 ; j<blank ; j++){
                System.out.printf(" ");
            }
            for( j=0 ; j<=star ; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
            if(i<4){
                blank -= 1;
                star += 2;
            }
            else{
                blank += 1;
                star -= 2;
            }
        }
    }
}
