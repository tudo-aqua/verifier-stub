/*
 *
 * inspired by the class org.sosy_lab.sv_benchmarks.Verifier from SVCOMP
 *
 */

package tools.aqua.concolic;
import java.util.ArrayList;
import java.util.Random;

public final class RandomVerifierInput {
  private static int[] preSeededInts = {0,2,4,8,16,-2,-4,-8,-16};
  private static float[] preSeededFloats = {0f,2f,4f,8f,16f,-2f,-4f,-8f,-16f};
  private static ArrayList<Integer> oldIntVals = new ArrayList();
  private static ArrayList<Float> oldFloatVals = new ArrayList();
  private static Random r = new Random();

  public static void assume(boolean condition) {}

  public static boolean nondetBoolean() {
    return r.nextBoolean();
  }

  public static byte nondetByte() {
    return (byte )generateInt();
  }

  public static char nondetChar() {
    return (char) generateInt();
  }

  public static short nondetShort() {
    return (short) generateInt();
  }

  public static int nondetInt() {
    return generateInt();
  }

  public static long nondetLong() {
    return generateInt();
  }

  public static float nondetFloat() {
    return generateFloat();
  }

  public static double nondetDouble() {
    return generateFloat();
  }

  public static String nondetString() {
    int size = r.nextInt(1000);
    byte[] b = new byte[size];
    r.nextBytes(b);
    return new String(b);
  }

  private static int generateInt(){
      int random = -2000;
      double chance = r.nextGaussian();
      if (chance < -1){
        int index = r.nextInt(preSeededInts.length - 1);
        random = preSeededInts[index];
      } else if(chance > 1 && oldIntVals.size() > 0){
        int index = r.nextInt(oldIntVals.size());
        random = oldIntVals.get(index);
      }else{
        random = r.nextInt(1000);
        if (r.nextBoolean()){
          random = random*-1;
        }
        oldIntVals.add(random);
      }
      System.out.println("Generated: " + random+ " by chance: "+ chance);
      return random;
  }

  private static float generateFloat(){
    float random = -2000f;
    double chance = r.nextGaussian();
    if (chance < -1){
      int index = r.nextInt(preSeededInts.length);
      random = preSeededInts[index];
    } else if(chance > 1 && oldFloatVals.size() > 0 ){
      int index = r.nextInt(oldFloatVals.size());
      random = oldFloatVals.get(index);
    }else{
      random = r.nextFloat() * 1000;
      if (r.nextBoolean()){
        random = random*-1;
      }
      oldFloatVals.add(random);
    }
    System.out.println("Generated: " + random+ " by chance: "+ chance);
    return random;
  }
}
