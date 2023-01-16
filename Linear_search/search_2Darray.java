package Linear_search;

import java.util.Arrays;

public class search_2Darray {
    public static void main(String[] args) {
        int[][] arr={{1,23,38},
                {12,33,5,43},
                {89,42,34},
                {67,32,44,22}

        };
        int target=5;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
