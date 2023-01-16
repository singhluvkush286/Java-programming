package Linear_search;

public class search_range {
    public static void main(String[] args) {
        int[] arr={23,43,21,43,56,89,43,32};
        int target=43;
        System.out.println(search(arr,target,2,5));

    }
    static int search(int[] arr , int target ,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
