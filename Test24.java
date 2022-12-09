public class Test24 {
    public static void main(String[] args) {
   
        int[] iArr = { 7, 3, 4, 9, 6};
        int i = 0;
        int count = 0;
        for(int x = 0; x < iArr.length-1; x++) {
            for(int y = 0; y < iArr.length-1-x; y++){
                if(iArr[y] > iArr[y+1]){
                    i = iArr[y+1];
                    iArr[y+1] = iArr[y];
                    iArr[y] = i;
                }
                count++;
            }
            
        }
        
        for(int y = 0; y < iArr.length; y++) {
            System.out.println(">>" + iArr[y]);
        }
        System.out.println(">>" + count);
    }
}