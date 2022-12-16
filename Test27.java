public class Test27 {
    public static void main(String[] args){
        int[] iArr1 = {7,5,4,9,8,1,2};
        int[] iArr2 = new int[4];
        int a;
        int b = 0;
        for(int x = 0; x < iArr1.length-1 ; x++) {
            for(int y = 0; y < iArr1.length-1-x ; y++){
                if(iArr1[y] > iArr1[y+1]){
                    a = iArr1[y+1];
                    iArr1[y+1] = iArr1[y];
                    iArr1[y] = a;
                }
            } 
        }
        for(int x = 0 ; x < iArr1.length ; x++){ 
            b += iArr1[x];
        }
            iArr2[0] = iArr1[6];
            iArr2[1] = iArr1[0];
            iArr2[2] = b/iArr1.length; 
            iArr2[3] = iArr1[6/2];
        for(int y = 0 ; y < iArr2.length ; y++){
            System.out.println(iArr2[y]);
        }      
    }
}
