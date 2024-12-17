import java.util.*;

public class exam_ajuby {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] transformedArray = new int[n];
        for (int i = 0; i < n; i++) {
            transformedArray[i] = sc.nextInt();
        }
        Arrays.sort(transformedArray);
        Set<Integer> originalSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (transformedArray[i] % 3 == 0) {
                int originalNum = transformedArray[i] / 3;
                if (originalSet.contains(originalNum)) {
                    System.out.println("-1");
                    return;
                } else {
                    originalSet.add(originalNum);
                    System.out.println(originalNum);
                }
            } else {
                int originalNum = transformedArray[i];
                if (originalSet.contains(originalNum)) {
                    System.out.println("-1");
                    return;
                } else {
                    originalSet.add(originalNum);
                    System.out.println(originalNum);
                }
            }
        }

        List<Integer> originalList = new ArrayList<>(originalSet);
        Collections.sort(originalList);
        for (int num : originalSet) {
            System.out.print(num + " ");
        }
    }
}
