import java.io.*;
import java.util.*;

public class RegistrationSystem4C {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    HashMap<String, Integer> users = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String name = br.readLine();
      if (!users.containsKey(name)) {
        users.put(name, 1);
        System.out.println("OK");
      } else {
        System.out.println(name + users.get(name));
        users.put(name, users.get(name) + 1);
      }
    }
  }
}
