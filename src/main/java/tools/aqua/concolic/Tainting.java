/*
 *
 * inspired by the class org.sosy_lab.sv_benchmarks.Verifier from SVCOMP
 *
 */

package tools.aqua.concolic;

public class Tainting {

    // taint value with color
    public static int taint(int value, int color, boolean deep) {
        return value;
    }

    // clean value from taint of color
    public static int clean(int value, int color, boolean deep) {
        return value;
    }

    // check if value is tainted with color
    public static void check(int value, int color, boolean deep) {
    }

    // stop taint analysis
    public static void stopAnalysis() {
    }

}
