public class Test18 {
    public static void main(String[] args){
        int a;
        int k = 7;

        a = k;
        System.out.printf("&d%n", k);
        a = add(k ,4);
        System.out.printf("%d%n", k);
    }
    
    public static int add(int x, int y){
        x += 1;
        return x; 
    }
}