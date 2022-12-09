public class Test25 {
    public static void main(String[] args) {
   
        int[] iArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int count = 0;
        int x = 0;
        int a = iArr.length;
        for(x = 0; x < iArr.length; x++) {
                a = a/2;
                if(iArr[x] == 2){
                    System.out.printf("2在位置%d",x);
                    break;  
                }else if(iArr[x] > 2){
                    x += a-1;
                }
            count++;
        }
        System.out.printf(" 次數%d",count);
        
        /*for(int y = 0; y < iArr.length; y++) {
            System.out.println(">>" + iArr[y]);
        }
        System.out.println(">>" + count);*/
    }
}