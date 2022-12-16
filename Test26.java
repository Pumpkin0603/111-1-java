public class Test26 {
    public static void main(String[] args){
        int[] myArr = {7,5,4,8,1,2};
        int a = 0 ;
       for(int i = 0 ; i < myArr.length/2 ; i++){
        a = myArr[i];
        myArr[i] = myArr[5-i];
        myArr[5-i] = a;
       }
       for(int i = 0 ; i < myArr.length ; i++){
        System.out.println(myArr[i]);
       }  
    }
}
