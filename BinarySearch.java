public class BinarySearch{
    static int binarySearch(int[] numArray, int num, int begin, int end) {
        int average = 0;
        if(begin < end){
            average = (begin + end) / 2;
        }
        if(numArray[average] == num){
            return average;
        }
        if(numArray[average] > num){
            return binarySearch(numArray, num, begin, average-1);
        }else{
            return binarySearch(numArray, num, average+1, end);
        }
    }
}