public class loops {
    /**
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            System.out.println();
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
        }

        System.out.println();
        System.out.println();

        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        //

        for (int i = 1; i <= n; i++) {
            for (int j = 4; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 4; j++) {

                if (j == 2 || j == 4) {
                    System.out.print("o");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {

            if (i == 1 || i == 3) {
                for (int j = 1; j <= 4; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("o");
                }
            }
            System.out.println();
        }

    }
}