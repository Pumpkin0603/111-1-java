public class Test15 {
    public static void main(String[] args){
        int i,j;
        

        for( i=6 ;  i>0 ; i--){
        
            for( j=1 ; j<7 ; j++){           
                if(j<i){
                    System.out.printf("*",j);
                }
                else{    
                    System.out.printf("%d",j-i+1);
                  
                }
            }  
            System.out.printf("\n");    
        }        
    }
}