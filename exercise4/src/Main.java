import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int maxDist = maxDistance(arr);
        System.out.println("Maximum distance between two occurrences of the same element: " + maxDist);
    }

    public static int maxDistance(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxDist = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int dist = i - map.get(arr[i]);
                if (dist > maxDist) {
                    maxDist = dist;
                }
            } else {
                map.put(arr[i], i);
            }
        }
        return maxDist;
    }
}