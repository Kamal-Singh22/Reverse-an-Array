public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0; 
        int end = arr.length - 1;
        
        // Swap elements from the start and end moving towards the center
        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers closer
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example input
        System.out.println("Original Array:");
        printArray(arr);
        
        reverseArray(arr); // Reverse the array
        
        System.out.println("Reversed Array:");
        printArray(arr);
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
