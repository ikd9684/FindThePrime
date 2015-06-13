package jp._9684.sandbox.prime;

public class FindThePrime {

    public static void main(String[] args) {

        int max = 100;
        if (0 < args.length) {
            max = Integer.parseInt(args[0]);
        }

        for (int i = 2; i <= max; i++) {

            int j;
            for (j = 2; j < i; j++) {

                if (i % j == 0) {
                    break;
                }
            }

            if (i == j) {
                System.out.println(i);
            }
        }
    }

}
