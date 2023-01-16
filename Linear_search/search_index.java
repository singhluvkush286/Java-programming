package Linear_search;

public class search_index {
    public static void main(String[] args) {
        int[] arr={23,43,21,43,56,89,43,32};
        int target=23;
        System.out.println(search(arr,target));

    }
    static int search(int[] arr , int target ){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
