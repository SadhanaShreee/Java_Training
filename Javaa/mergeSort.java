public class mergeSort {
        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 7};
            int[] arr2 = {2, 4, 6};
    
            int size1 = arr1.length;
            int size2 = arr2.length;
    
            int[] merged = new int[size1 + size2];
    
            // Copy elements from arr1
            for (int i = 0; i < size1; i++) {
                merged[i] = arr1[i];
            }
    
            // Copy elements from arr2
            for (int i = 0; i < size2; i++) {
                merged[size1 + i] = arr2[i];
            }
            // Simple bubble sort
        for (int i = 0; i < merged.length - 1; i++) {
            for (int j = 0; j < merged.length - i - 1; j++) {
                if (merged[j] > merged[j + 1]) {
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
        }
    }
}
    
            // Print merged array
            System.out.print("Merged array: ");
            for (int val : merged) {
                System.out.print(val + " ");
            }
        }
    }

