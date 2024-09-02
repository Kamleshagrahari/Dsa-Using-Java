//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the maximum product subarray
    long maxProduct(int[] arr, int n) {
        if (n == 0) {
            return 0; // Handle edge case of empty array
        }

        long maxProduct = arr[0]; // Initialize max product with the first element

        // Outer loop to fix the starting index of the subarray
        for (int i = 0; i < n; i++) {
            long currentProduct = 1; // Start a new product for the subarray

            // Inner loop to fix the ending index of the subarray
            for (int j = i; j < n; j++) {
                currentProduct *= arr[j]; // Calculate the product of the subarray
                maxProduct = Math.max(maxProduct, currentProduct); // Update max product
            }
        }

        return maxProduct;
    }
}
