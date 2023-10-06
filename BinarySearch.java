public class BinarySearch{
    static int binarySearch(int[] arrayNum, int num, int begin, int end) {
        int average = 0;
        if(begin < end){
            average = (begin + end) / 2;
        }
        if(arrayNum[average] == num){
            return average;
        }
        if(arrayNum[average] > num){
            return binarySearch(arrayNum, num, begin, average-1);
        }else{
            return binarySearch(arrayNum, num, average+1, end);
        }
    }
}