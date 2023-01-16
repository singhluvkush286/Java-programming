package Linear_search;

import java.util.Arrays;

public class search_string {
    public static void main(String[] args) {
        String name="Luvkush Singh";
        char target='i';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));



    }
    static int search(String name , char target){
        int i=0;
        for(char x : name.toCharArray()){
            if(x==target){
                return i;
            }
            i++;
        }
        return -1;
    }

}
