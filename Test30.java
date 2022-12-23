public class Test30 {
    public static void main(String[] args){
        int[] iArr1 = {7,5,4,9,8,1,2};
       
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        float a,b,c,d;
        for(int i = 0 ; i < iArr1.length ; i++){
            if(i < 2){
                sum1 += iArr1[i];
            }else if(i > 1 && i < 4){
                sum2 += iArr1[i];
            }else if(i > 3 && i < 6){
                sum3 += iArr1[i];
            }
            else
                sum4 = iArr1[i];
        }
        a = (float)sum1 / 2;
        b = (float)sum2 / 2;
        c = (float)sum3 / 2;
        d = (float)sum4;

        System.out.println(" 7 and 5 avg : "+ a);
        System.out.println(" 4 and 9 avg : "+ b);
        System.out.println(" 8 and 1 avg : "+ c);
        System.out.println(" 7 and 5 avg : "+ d);

    }
}