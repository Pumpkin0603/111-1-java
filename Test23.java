import java.util.Arrays;

public class Test23 {
    public static void main(String[] args) {
   
        int[] iArr = { 7, 3, 4, 9, 6};
        /*int i = 0;

        for(int x = 0; x < iArr.length; x++) {
            for(int y = 0; y < iArr.length; y++){
                if(iArr[x]>iArr[y]){
                    i = iArr[x];
                    iArr[x] = iArr[y];
                    iArr[y] = i;
                }
            }
        }*/
        Arrays.sort(iArr);
        for(int y = 0; y < iArr.length; y++) {
            System.out.println(">>" + iArr[y]);
        }

    }
}

