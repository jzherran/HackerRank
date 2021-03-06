package hackerrank;

import java.math.BigInteger;

public class remainFib {

    public static void main(String[] args) {
        System.out.println(remainFibCalculation("56"));
    }

    static String remainFibCalculation(String number) {
        BigInteger n = new BigInteger(number);
        BigInteger prevPrev = BigInteger.ONE, prev = new BigInteger("2"), curr = new BigInteger("3");
        while (n.compareTo(BigInteger.ZERO) > 0) {
            prevPrev = prev;
            prev = curr;
            curr = prevPrev.add(prev);
            n = n.subtract(curr.subtract(prev).subtract(BigInteger.ONE));
        }

        n = n.add(curr.subtract(prev).subtract(BigInteger.ONE));
        return prev.add(n).toString();
    }
}
