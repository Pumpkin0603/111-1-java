public class Test17 {
    public static void main(String[] args){
        float a = 0.0f;
        float b = 0.8f;
        
        a += 0.1;
        a += 0.1;
        a += 0.1;
        a += 0.1;
        a += 0.1;
        a += 0.1;
        a += 0.1;
        a += 0.1;
        if (a == b)
            System.out.printf("a == b");
        else
            System.out.printf("a != b");
        }
}