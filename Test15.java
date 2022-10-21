public class Test15 {
    public static void main(String[] args){
        int i,j;
        

        for( i=1 ;  i<7 ; i++){
            for( j=0 ; j<6 ; j++){
                
                if(j<6-i){
                System.out.printf("*",j);
                }
                else{
                System.out.printf("%d",j);
                }
            }  
     
            System.out.printf("\n");    
        }        
    }
}