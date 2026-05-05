public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 10, 12};
        
        int[] C = new int[A.length + B.length];
        
        int i = 0; 
        int j = 0; 
        int k = 0; 
        
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        
        while (i < A.length) {
            C[k] = A[i];
            i++;
            k++;
        }
        
        while (j < B.length) {
            C[k] = B[j];
            j++;
            k++;
        }
        
        System.out.print("Merged Sorted Array C: ");
        for (int num : C) {
            System.out.print(num + " ");
        }
    }
}