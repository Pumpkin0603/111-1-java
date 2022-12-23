public class Test28 {
    public static void main(String[] args){
        int[] iArr1 = {7,5,4,9,8,1,2};
        int flag_count = 1;
        int [] flag = new int[iArr1.length];
       
        int max = 0;
        int min = 10;
        int sum = 0;
        float avg;
        for(int i = 0 ; i < iArr1.length ; i++){
            if(iArr1[i] > max)
                max = iArr1[i];
            if(iArr1[i] < min)
                min = iArr1[i];
                sum += iArr1[i];
        }
        avg = (float)sum / iArr1.length;


        int med = 0;
        for(int i = 0 ; i < 4 ; i++){
            int flag_min = 1000;
            int flag_min_index = 0;
            for(int j = 0 ; j < iArr1.length ; j++){
                if(iArr1[j] < flag_min && flag[j] == 0){
                    flag_min = iArr1[j];
                    flag_min_index = j;
                }  
            } 
            flag[flag_min_index] = flag_count;
            flag_count++;
            med = iArr1[flag_min_index];
        }
        
        System.out.println("max: "+ max);
        System.out.println("min: "+ min);
        System.out.println("avg: "+ avg);
        System.out.println("med: "+ med);
    }
}
