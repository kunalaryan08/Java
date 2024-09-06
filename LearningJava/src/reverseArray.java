
import java.util.Arrays;
import java.util.Collection;


public class reverseArray {

    static void swap(int[] list, int idx1, int idx2){
        int temp = idx1;
        idx1 = idx2;
        idx2 = temp;
    }

    static void reverse(int[] list,int start, int end){
        while(start < end){
            swap(list,start,end);
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6};
        int start = 0, end = list.length - 1;
        System.out.println(Arrays.toString(list));
        
        reverse(list,start,end);

        System.out.println(Arrays.toString(list));

    }


}

