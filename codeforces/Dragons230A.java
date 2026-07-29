import java.io.*;
import java.util.*;

public class Dragons230A {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int s = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    Map<Integer, Integer> dragons = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int str = Integer.parseInt(st.nextToken());
      int rew = Integer.parseInt(st.nextToken());
      if (s <= str) {
        dragons.put(str, rew);
      } else {
        s += rew;
      }
    }
    for (int key : dragons.keySet()) {
      if (key >= s) {
        System.out.println("NO");
        System.exit(0);
      } else {
        s += dragons.get(key);
      }
    }
    System.out.print("YES");
  }
}
