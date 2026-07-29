import java.io.*;
import java.util.*;

public class Taxi158B {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    HashMap<Integer, Integer> map = new HashMap<>();
    int total = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      // System.out.println("one" + map.values());
      int cur = Integer.parseInt(st.nextToken());
      if (cur == 4) {
        total++;
        // System.out.println("four");
      } else {
        // System.out.println(cur + " cur");
        if (map.getOrDefault(4 - cur, 0) > 0) {
          // System.out.println(cur + " match " + map.getOrDefault(4 - cur, 0));
          total++;
          map.put(4 - cur, map.getOrDefault(4 - cur, 0) - 1);
        } else {
          map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
      }
      // System.out.println("two" + map.values() + " total " + total);
    }
    if (!map.isEmpty()) {
      int twos = map.getOrDefault(2, 0);
      int ones = map.getOrDefault(1, 0);
      int threes = map.getOrDefault(3, 0);
      // System.out.println(ones + " ones " + twos + " twos " + threes + " threes " +
      // " first");
      if (threes > 0) {
        // System.out.println(ones + " ones " + twos + " twos " + threes + " threes
        // second");
        total += threes + twos;
        twos = 0;
      } else if (twos > 0) {
        if (ones >= 2) {
          // System.out.println(ones + " ones " + twos + " twos " + threes + " threes" + "
          // third");
          total++;
          ones -= 2;
          twos--;
        } else if (ones == 1) {
          // System.out.println(ones + " ones " + twos + " twos " + threes + " threes " +
          // "fourth");
          total++;
          ones--;
          twos--;
        } else {
          // System.out.println(ones + " ones " + twos + " twos " + threes + " threes " +
          // "fifth");
          total += twos;
        }
      }
      // System.out.println(ones + " ones " + twos + " twos " + threes + " threes " +
      // "sixth");
      total += ones / 4 + ((ones % 4 > 0) ? 1 : 0);
    }
    System.out.println(total);
  }
}
