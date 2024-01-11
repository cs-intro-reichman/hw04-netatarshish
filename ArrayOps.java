public class ArrayOps {
    public static void main(String[] args) {
        int [] array1 = {2,8,3,7,8};
        int [] array2 = {1,2,0};
        System.out.println(secondMaxValue(array1));
        
    }
    
    public static int findMissingInt (int [] array) {
        boolean check = false;
        int missing = 0;
        for(int i = 0; i<=array.length;i++){
            for(int j=0;j<array.length;j++){
                if(i==array[j]){
                    check=true;
                }
                }
                if(!check){
                    missing = i;
                }
                check=false;
            
        }
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int max = array [0];
        int secondMax = 0;
        for(int i = 1; i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        if(array[0]!=max){
                secondMax=array[0];
            }
            else{
                secondMax=array[1];
            }
        for(int j = 0;j<array.length;j++){
            if(array[j]<=max&&array[j]>=secondMax){
                secondMax=array[j];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean check = false;
        boolean endCheck = true;
        for(int i = 0; i<array1.length;i++){
            for(int j = 0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    check = true;
                }
                }
                if(!check){
                    endCheck = false;
            }
            check = false;
        }
        for(int t = 0; t<array2.length;t++){
            for(int y = 0;y<array1.length;y++){
                if(array2[t]==array1[y]){
                    check = true;
                }
                }
                if(!check){
                    endCheck = false;
            }
            check = false;
        }

        return endCheck;
    }

    public static boolean isSorted(int[] array) {
    boolean decreasing = false;
    boolean increasing = false;
    boolean check = true;

    if (array.length < 2) {
        return true;
    }

    int t = 0;
    while (t < array.length - 1 && array[t] == array[t + 1]) {
        t += 1;
    }

    if (t < array.length - 1) {
        if (array[t] > array[t + 1]) {
            decreasing = true;
        } else {
            increasing = true;
        }
    }

    for (int i = t; i < array.length - 1; i++) {
        if (decreasing && array[i] < array[i + 1]) {
            check = false;
            break; 
        } else if (increasing && array[i] > array[i + 1]) {
            check = false;
            break; 
        }
    }

    return check;
}

}
