
      
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


void main() {
        int[] arr = {4, 2, 1, 3};
        int n = arr.length;
        Arrays.sort(arr); // [1, 2, 3, 4]
        //Brute force solution
        /*// Step 1: Sort the array
        
        // Step 2: Find minimum absolute difference
        int minimumAbsoluteDiff = arr[1] - arr[0];
        for (int i = 0; i < n - 1; i++) {
            minimumAbsoluteDiff = Math.min(minimumAbsoluteDiff, arr[i + 1] - arr[i]);
        }

        // Step 3: Collect all pairs with that difference
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] == minimumAbsoluteDiff) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        // Step 4: Print result
        System.out.println(result); */
        
        //Now Optimal Solution
        List<List<Integer>> result = new ArrayList<>();
        int minimumAbsoluteDiff = arr[1] - arr[0];
        for (int i = 0; i < n-1; i++) {
            int currentAbsoluteDiff= arr[i+1]-arr[i];
            if(currentAbsoluteDiff<minimumAbsoluteDiff){
                minimumAbsoluteDiff=currentAbsoluteDiff;
                result.clear();
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }else if (currentAbsoluteDiff==minimumAbsoluteDiff) {
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        IO.print((result));

    }

