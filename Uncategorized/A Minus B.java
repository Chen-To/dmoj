import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int a;
    a = in.nextInt();
    for (int i = 0; i < a; i++) {
      int b = in.nextInt();
      int c = in.nextInt();
      System.out.println(b-c);
    }
    }
}
