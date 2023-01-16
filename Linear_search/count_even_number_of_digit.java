package Linear_search;

public class count_even_number_of_digit {
    public static void main(String[] args) {
        int[] arr={23,433,210,432,546,89,4323,32};
        System.out.println(count_even(arr));
    }
    static int count_even(int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++) {
            if (check_even(arr[i])) {
                c++;
            }
        }
        return c;

    }
    static boolean check_even(int num){
       int digit = (int)(Math.log10(num))+1;
        if(digit%2==0){
            return true;
        }
        return false;
    }

}
