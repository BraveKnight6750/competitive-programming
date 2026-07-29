import java.io.*;
import java.util.*;

public class EvenOdds318A {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long n = Long.parseLong(st.nextToken());
    long k = Long.parseLong(st.nextToken());
    long sol = 0;
    if (n % 2 == 0) {
      if (k <= (n / 2)) {
        sol = 2 * k - 1;
      } else {
        sol = 2 * (k - n / 2);
      }
    } else if (n % 2 == 1) {
      if (k == (n / 2) + 1) {
        sol = n;
      } else if (k <= n / 2) {
        sol = 2 * k - 1;
      } else if (k > (n / 2) + 1) {
        sol = 2 * (k - (n / 2) - 1);
      }
    }
    System.out.print(sol);
  }
}
