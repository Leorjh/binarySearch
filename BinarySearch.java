public class BinarySearch{
    static int binarySearch(int[] numArray, int num, int left, int right) {
        if (left <= right) {
            int middle = left + (right - left) / 2;

            if (numArray[middle] == num) {
                return middle;
            }

            if (numArray[middle] > num) {
                return binarySearch(numArray, num, left, middle - 1);
            } else {
                return binarySearch(numArray, num, middle + 1, right);
            }
        }

        return -1;
    }
}