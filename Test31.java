public class Test31 {
    public static void main(String[] args){
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int target = 2;
        int targetIndex = 0;
        int searchCount = 0;

        //Search
        if (target > 5){
                if(target > 8){
                    for(int i = 0 ; i < 3 ; i++){
                        if(arr[i] == target){
                            targetIndex = i;
                        }
                        searchCount++;
                    }
                }else if(target <= 8){
                    for(int i = 2 ; i < 5 ; i++){
                        if(arr[i] == target){
                            targetIndex = i;
                        }
                        searchCount++;
                    }
                }
            }else if(target <= 5){
                if(target > 2){
                    for(int i = 5 ; i < 8 ; i++){
                        if(arr[i] == target){
                            targetIndex = i; 
                        }
                        searchCount++;
                    }
                }else if(target <= 2){
                    for(int i = 8 ; i <= 10 ; i++){
                        if(arr[i] == target){
                            targetIndex = i;
                        }
                        searchCount++;
                    }
                }
            }
        System.out.println("The position is "+ targetIndex);
        System.out.println("searchCount "+ searchCount);
    }     
}

