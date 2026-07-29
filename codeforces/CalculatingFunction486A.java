import java.io.*;
import java.util.*;

public class CalculatingFunction486A {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long n = Long.parseLong(st.nextToken());
    n++;
    long num = n / 2;
    int negativity = (n % 2 == 0) ? -1 : 1;
    System.out.print(num * negativity);
  }
}
