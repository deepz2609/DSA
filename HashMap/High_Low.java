
import java.util.*;

public class High_Low {

    public static void main(String[] args) {
        int a[] = {1, 1, 2, 2, 3, 45, 2, 5, 2};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     int key = entry.getKey();
        //     int Freq = entry.getValue();
        //     if (Freq > maxFreq) {
        //         maxFreq = Freq;
        //         maxKey = key;
        //     }
        //     if (Freq < minFreq) {
        //         minFreq = Freq;
        //         minKey = key;
        //     }
        // }
        // System.out.println("Most frequent: " + maxKey + " -> " + maxFreq);
        // System.out.println("Least frequent: " + minKey + " -> " + minFreq);
        int maxFreq = Collections.max(map.values());
        int minFreq = Collections.min(map.values());

        List<Integer> maxKeys = new ArrayList<>();
        List<Integer> miniKeys = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                maxKeys.add(entry.getKey());
            }
            if (entry.getValue() == minFreq) {
                miniKeys.add(entry.getKey());
            }
        }
        System.out.println("Most frequent: " + maxKeys + " -> " + maxFreq);
        System.out.println("Least frequent: " + miniKeys + " -> " + minFreq);

    }
}
