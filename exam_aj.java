import java.util.*;

public class exam_aj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] transformedArray = new int[n];
        for (int i = 0; i < n; i++) {
            transformedArray[i] = sc.nextInt();
        }
        
		sc.close();
        // sort the transformed array in ascending order
        Arrays.sort(transformedArray);

        // initialize a map to store the frequency of each number in the transformed array
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : transformedArray) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // initialize a list to store the original numbers
        List<Integer> originalList = new ArrayList<>();

        // iterate over the transformed array
        for (int i = 0; i < n; i++) {
            int num = transformedArray[i];
            // check if the current number is a potential original number
            if (freqMap.containsKey(num / 3) && freqMap.containsKey(num / 3 * 2)) {
                // add the potential original number to the list
                originalList.add(num / 3);
            } else if (freqMap.containsKey(num / 2)) {
                // add the potential original number to the list
                originalList.add(num / 2);
            } else {
                // print -1 and exit the program if the original array cannot be determined
                System.out.println("-1");
                return;
            }
            // decrement the frequency of the potential original number in the map
            freqMap.put(num / 3, freqMap.get(num / 3) - 1);
            freqMap.put(num / 3 * 2, freqMap.get(num / 3 * 2) - 1);
            freqMap.put(num / 2, freqMap.get(num / 2) - 1);
        }

        // sort the original list in ascending order
        Collections.sort(originalList);

        // print the original numbers
        for (int num : originalList) {
            System.out.print(num + " ");
        }
        
    }
}
