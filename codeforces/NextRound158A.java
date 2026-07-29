import java.io.*;
import java.util.*;

public class NextRound158A {
  public static void main(String[] ar) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());

    int atK = 0;
    for (int i = 0; i < k; i++) {
      int cur = Integer.parseInt(st.nextToken());
      if (cur <= 0) {
        System.out.println(i);
        System.exit(0);
      }
      if (i == k - 1) {
        atK = cur;
      }
    }
    int total = k;
    for (int i = k; i < n; i++) {
      int cur = Integer.parseInt(st.nextToken());
      if (cur == atK) {
        total++;
      }
    }
    System.out.println(total);
  }
}
