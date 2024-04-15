package squareIntoSquares;

import java.util.ArrayList;
import java.util.List;

public class Decomposer {
    public static String decompose(long n) {
        List<Long> result = decomposeHelper(n, n * n, n - 1);
        if (result == null) {
            return "null";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.size() - 1; i++) {
                sb.append(result.get(i)).append(" ");
            }
            sb.append(result.get(result.size() - 1));
            return sb.toString();
        }
    }

    private static List<Long> decomposeHelper(long target, long remaining, long start) {
        if (remaining == 0) {
            List<Long> list = new ArrayList<>();
            list.add(target);
            return list;
        }

        for (long i = start; i > 0; i--) {
            long next = remaining - i * i;
            if (next >= 0) {
                List<Long> result = decomposeHelper(target, next, i - 1);
                if (result != null) {
                    result.add(i);
                    return result;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(decompose(11)); // 121
        System.out.println(decompose(50)); // 2500
    }
}
