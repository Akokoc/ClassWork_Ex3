import java.util.ArrayList;
import java.util.List;

public class PrimesNumber {
    public static void main(String[] args) {
        System.out.println(getPrimesTill(-9));

    }

    // Task 1
    private static boolean PrimesNumberChecker(int num) {
        for (int i = 2; i <= num / 2; i++) {
            int tempNum = num % i;
            if (tempNum == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getPrimesTill(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (PrimesNumberChecker(i) == true) {
                list.add(i);
            }
        }
        return list;

    }
}
