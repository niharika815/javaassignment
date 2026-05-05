public class ArrayElementFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        
        boolean[] visited = new boolean[n];

        System.out.println("Element | Frequency");
        System.out.println("-------------------");

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            
            System.out.println("   " + arr[i] + "    |    " + count);
        }
    }
}