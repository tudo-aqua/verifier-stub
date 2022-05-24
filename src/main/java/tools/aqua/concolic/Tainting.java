/*
 *
 * inspired by the class org.sosy_lab.sv_benchmarks.Verifier from SVCOMP
 *
 */

package tools.aqua.concolic;

public class Tainting {

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

    // stop taint analysis
    public static void stopAnalysis() {
    }

}
