/*
 *
 * inspired by the class org.sosy_lab.sv_benchmarks.Verifier from SVCOMP
 *
 */

package tools.aqua.concolic;

public class Tainting {
    
    // colors for vulnerabilities of securibench-micro
    public static final int SQL_INJECTION = 1;
    public static final int XSS = 2;
    public static final int IFSPEC = 3;
    public static final int FILE_OPERATIONS = 4;
    public static final int INTERNAL_INFO = 5;
    public static final int CMD_INJECTION = 6;
    public static final int WEAK_HASHING_CONFIG = 7;
    public static final int WEAK_CRYPTO_CONFIG = 8;

    // taint value with color
    public static int taint(int value, int color) {
        return value;
    }

    public static boolean taint(boolean value, int color) {
        return value;
    }

    public static byte taint(byte value, int color) {
        return value;
    }

    public static char taint(char value, int color) {
        return value;
    }

    public static short taint(short value, int color) {
        return value;
    }

    public static long taint(long value, int color) {
        return value;
    }

    public static float taint(float value, int color) {
        return value;
    }

    public static double taint(double value, int color) {
        return value;
    }

    public static String taint(String value, int color) {
        return value;
    }

    public static Object taint(Object value, int color) {
        return value;
    }

    // clean value from taint of color
    public static int clean(int value, int color) {
        return value;
    }

    public static boolean clean(boolean value, int color) {
        return value;
    }

    public static byte clean(byte value, int color) {
        return value;
    }

    public static char clean(char value, int color) {
        return value;
    }

    public static short clean(short value, int color) {
        return value;
    }

    public static long clean(long value, int color) {
        return value;
    }

    public static float clean(float value, int color) {
        return value;
    }

    public static double clean(double value, int color) {
        return value;
    }

    public static String clean(String value, int color) {
        return value;
    }

    public static Object clean(Object value, int color) {
        return value;
    }


    // check if value is tainted with color
    public static void check(int value, int color) {
    }

    public static void check(boolean value, int color) {
    }

    public static void check(byte value, int color) {
    }

    public static void check(char value, int color) {
    }

    public static void check(short value, int color) {
    }

    public static void check(long value, int color) {
    }

    public static void check(float value, int color) {
    }

    public static void check(double value, int color) {
    }

    public static void check(String value, int color) {
    }

    public static void check(Object value, int color) {
    }

    public static void valueCheckFailed(String value, String forbiddenValue, int color) {
    }


    public static void transferTaint(String from, byte[] to) {
    }

    public static void transferTaint(byte[] from, byte[] to) {
    }

    public static void transferTaint(byte[] from, String to) {
    }

    // stop taint analysis
    public static void stopAnalysis() {
    }

}
