package codesignal;

import java.util.Scanner;

public class Kangaroo {

  public static void main(final String[] args) {
    final Scanner in = new Scanner(System.in);
    final int x1 = in.nextInt();
    final int v1 = in.nextInt();
    final int x2 = in.nextInt();
    final int v2 = in.nextInt();

    if (v1 < v2) {
      System.out.println("NO");
    } else {
      if (v1 != v2 && (((x2 - x1) % (v1 - v2))) == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    in.close();
  }
}
