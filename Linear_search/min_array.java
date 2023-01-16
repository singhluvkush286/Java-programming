package Linear_search;

//import static java.util.*;

public class min_array {
    public static void main(String[] args) {
      //   static void main(String[] args) {
            int[] arr={23,43,21,43,5,89,43,32};
            //int target=43;
            System.out.println(min(arr));

    }
    static int min(int[] arr ){
        int min= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]< min){
                min=arr[i];
               // return i;
            }
        }
        return min;
    }
}
