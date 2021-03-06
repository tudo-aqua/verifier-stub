/*
 *
 * inspired by the class org.sosy_lab.sv_benchmarks.Verifier from SVCOMP
 *
 */

package tools.aqua.concolic;

public class Witness {

	private static int[] counters = new int[1];

	private static void ensureIndexExists(int i) {
		if (i < counters.length) {
			return;
		}
		int[] newCounters = new int[i+1];
		System.arraycopy(counters, 0, newCounters, 0, counters.length);
		counters = newCounters;
	}

	public static void assume(int id, boolean ... assumptions) {
		ensureIndexExists(id);
		int idx = counters[id];
		counters[id]++;
		Verifier.assume(idx < assumptions.length ? assumptions[idx] : true);
	}

	public static <T> T assume(T value, int id, boolean ... assumptions) {
		assume(id, assumptions);
		return value;
	}

	public static void invariant(boolean invariant) {
		assert invariant;
	}

}
