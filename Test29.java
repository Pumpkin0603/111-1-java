import java.util.Scanner;
public class Test29 {
    public static void main(String[] args){
        int[] iArr1 = {7,5,4,9,8,1,2};
        int flag_count = 1;
        int [] flag = new int[iArr1.length];
        int c = 0;
       
        Scanner a = new Scanner(System.in);
        System.out.print("輸入要找的第幾小數字：");
        int b = a.nextInt();

        for(int i = 0 ; i < b ; i++){
            flag_count = 1;
            int flag_min = 1000;
            int flag_min_index = 0;
            for(int j = 0 ; j < iArr1.length ; j++){
                if(iArr1[j] < flag_min && flag[j] == 0){
                    flag_min = iArr1[j];
                    flag_min_index = j;
                }  
            } 
            flag[flag_min_index] = flag_count;
            flag_count++;
            c = iArr1[flag_min_index];
        }
        System.out.printf("第%d小數為：",b);
        System.out.print(c);
    }
}
