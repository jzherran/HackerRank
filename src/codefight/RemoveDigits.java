package codefight;

import java.util.Arrays;

/**
 * @author jzherran@gmail
 * @date 3/23/17
 */
public class RemoveDigits {

  public static void main (String[] args) {
    System.out.println(Arrays.toString(removeDigits(15243, 2)));
    System.out.println(Arrays.toString(removeDigits(10391938, 4)));
    System.out.println(Arrays.toString(removeDigits(1038, 3)));
  }

  public static long[] removeDigits(long n, int k) {
    String s = String.valueOf(n);
    String z = String.valueOf(Long.MAX_VALUE);
    String x = String.valueOf(Long.MIN_VALUE);
    for(int i = 0; i <= s.length()-k; i++) {
      String t = "";
      for (int j = i; j < i+k; j++) {
        t += s.charAt(j);
      }
      long l = Long.parseLong(t);
      if(l > Long.parseLong(x)) {
        x = t;
      }
      if(l < Long.parseLong(z)) {
        z = t;
      }
    }
    return new long[]{new Long(z), new Long(x)};
  }
}
