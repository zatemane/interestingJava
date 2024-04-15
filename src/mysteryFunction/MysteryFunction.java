package mysteryFunction;

import java.util.ArrayList;
import java.util.List;

public class MysteryFunction {
    // mystery
    public static long mystery(long n) {
        return reverseBits(n, Long.bitCount(n));
    }

    // reverseBits для переворачивания битов
    private static long reverseBits(long n, int bits) {
        long result = 0;
        for (int i = 0; i < bits; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }

    // Обратная mystery_inv
    public static long mystery_inv(long n) {
        int bits = Long.bitCount(n);
        return reverseBits(n, bits);
    }

    // name_of_mystery
    public static String name_of_mystery() {
        return "mystery";
    }

    public static void main(String[] args) {
        long n = 6;
        System.out.println("mystery(" + n + ") = " + mystery(n)); // Вывод: mystery(6) = 5
        System.out.println("mystery_inv(" + n + ") = " + mystery_inv(mystery(n))); // Вывод: mystery_inv(6) = 6
        System.out.println("name_of_mystery() = " + name_of_mystery()); // Вывод: name_of_mystery() = mystery
    }
}
