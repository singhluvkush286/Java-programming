package Linear_search;

//import java.util.Arrays;

public class max_2Darray {
    public static void main(String[] args) {
        int[][] arr={{1,23,38},
                {12,33,5,43},
                {89,42,34},
                {67,320,44,22}

        };
        //int target=5;
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max=arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                    // return new int[]{i,j};
                }
            }
        }
        return max;

    }
}
