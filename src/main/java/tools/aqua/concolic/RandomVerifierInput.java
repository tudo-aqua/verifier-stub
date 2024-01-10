/*
 *
 * inspired by the class org.sosy_lab.sv_benchmarks.Verifier from SVCOMP
 *
 */

package tools.aqua.concolic;
import java.util.Random;

public final class RandomVerifierInput {
  private static Random r = new Random();

  public static void assume(boolean condition) {}

  public static boolean nondetBoolean() {
    return r.nextBoolean();
  }

  public static byte nondetByte() {
    return (byte )r.nextInt();
  }

  public static char nondetChar() {
    return (char) r.nextInt();
  }

  public static short nondetShort() {
    return (short) r.nextInt();
  }

  public static int nondetInt() {
    return r.nextInt();
  }

  public static long nondetLong() {
    return r.nextLong();
  }

  public static float nondetFloat() {
    return r.nextFloat();
  }

  public static double nondetDouble() {
    return r.nextDouble();
  }

  public static String nondetString() {
    int size = r.nextInt(1000);
    byte[] b = new byte[size];
    r.nextBytes(b);
    return new String(b);
  }

}
