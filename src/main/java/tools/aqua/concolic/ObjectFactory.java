/*
 *
 * inspired by the interface org.sosy_lab.sv_benchmarks.ObjectFactory from SVCOMP
 *
 */
package tools.aqua.concolic;

public interface ObjectFactory<T> {
  T createObject();
}
