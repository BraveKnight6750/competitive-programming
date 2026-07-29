import java.io.*;
import java.util.*;

public class DealEmOut {
  public static void main(String[] ar) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int unknown = 0;
    int value = a + b + c;

    for (int i : new int[] {a, b, c}) {
      if (i == 0) {
        unknown++;
      }
    }

    int known = 3 - unknown;

    double expectedValue = (416.0 - value) / (52.0 - known);

    double total = value + expectedValue * unknown;

    System.out.printf("%.2f", total);
  }
}
