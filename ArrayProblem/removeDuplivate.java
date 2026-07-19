package ArrayProblem;
import java.util.Arrays;

public class removeDuplivate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        int k =0;
        for(int i=1;i<=arr.length-1;i++){
            if (arr[i] != arr[k]) {
                k = arr[i];
                k++;
        
            }
           
            
            }
        
        System.out.println(k);
        // System.out.println(Arrays.toString(arr));
    }
}
