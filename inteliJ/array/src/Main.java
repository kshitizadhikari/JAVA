public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 4, 6};
        int [][] b = {
                {32, 54, 6},
                {54,12, 4},
                {98, 8, 1},
        };

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("**");

        }
        System.out.println();
        System.out.println();
        //triangle - diamond
        int m=1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= m; k++) {
                System.out.printf("* ");
            }
            m++;
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf(" ");
            }
            for (int k = 4; k >=i ; k--) {
                System.out.printf(" *");
            }
            System.out.println();
        }

    }
}