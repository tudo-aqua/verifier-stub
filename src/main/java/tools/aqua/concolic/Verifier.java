/*
 *
 * inspired by the class org.sosy_lab.sv_benchmarks.Verifier from SVCOMP
 *
 */

package tools.aqua.concolic;

public final class Verifier {

  public static void assume(boolean condition) {}

  public static boolean nondetBoolean() {
    return true;
  }

  public static byte nondetByte() {
    return (byte) 0;
  }

  public static char nondetChar() {
    return (char) 0;
  }

  public static short nondetShort() {
    return (short) 0;
  }

  public static int nondetInt() {
    return 0;
  }

  public static long nondetLong() {
    return 0L;
  }

  public static float nondetFloat() {
    return 0f;
  }

  public static double nondetDouble() {
    return 0d;
  }

  public static String nondetString() {
    return new String();
  }

  public static Object nondetObject() {
    return null;
  }
}
