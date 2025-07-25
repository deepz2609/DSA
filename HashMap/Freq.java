import java.util.HashMap;
public class Freq {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int a[] = {1,2,2,1,4,5,2,4};
        for(int i: a){
            map.put(i, map.getOrDefault(a[i], 0)+1);
        }
        System.out.println(map);
    }
}
