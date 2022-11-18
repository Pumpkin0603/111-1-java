public class Test21 {
    public static void main(String[] args){
      
        

        for (int i = 0; i < 9; i++) {
            for (int j = -1; j < 10; j++) {
                if (Math.abs(4 - i) + Math.abs(j - 4) <= 4){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
     
    }        
}

