public class BinarySearch {
    public static int binarySearch(int[]array, int target, int left, int right){
        if (left > right) {
            return -1;
        }
        
        // Calculate middle index
        int mid = left + (right - left) / 2;
        
        // Check if middle element is the target
        if (array[mid] == target) {
            return mid;
        }
        
        // If target is smaller, search in left half
        if (array[mid] > target) {
            return binarySearch(array, target, left, mid - 1);
        }
        
        // If target is larger, search in right half
        return binarySearch(array, target, mid + 1, right);
    }

    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }
    
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        
        int result = binarySearch(sortedArray, target);
        
        if (result == -1) {
            System.out.println("Element " + target + " not found in the array");
        } else {
            System.out.println("Element " + target + " found at index " + result);
        }
    }
}
