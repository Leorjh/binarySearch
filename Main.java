import java.util.Arrays;

public class Main{
    public static void main (String[] args){
        int[] arrayNum = {9,4,5,3,7,2,0};
        int num = 7;
        int begin = 0;
        int end = arrayNum.length - 1;
        Arrays.sort(arrayNum);
        int result = BinarySearch.binarySearch(arrayNum, num, begin, end);
        System.out.println("The number: " + num + " is in position:  " + result + " of the array: " + Arrays.toString(arrayNum));
    }
}
