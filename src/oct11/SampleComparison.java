package oct11;

public class SampleComparison {
    public static void main(String[] args) {
        long starTime;
        long endTime;

        starTime = System.nanoTime();
        // 1.0 - thread safe  , 4387083 ns
        StringBuffer sb = new StringBuffer("Pragra");

        for (int i = 0; i < 100000 ; i++) {
            sb.append(" Inc.");
        }
        endTime = System.nanoTime();

        System.out.println(endTime - starTime + " ns");

        starTime = System.nanoTime();
        // not thread safe , 2221667 ns  , 1.5
        StringBuilder stb = new StringBuilder("Pragra");

        for (int i = 0; i < 100000 ; i++) {
            stb.append(" Inc.");
        }
        endTime = System.nanoTime();

        System.out.println(endTime - starTime + " ns");

    }
}
