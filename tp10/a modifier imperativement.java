import java.util.Scanner;

class Image {

    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] arg) {

        boolean[][] image = { { false, false, false, false, false, false, false, false, false, false, false, false },
                { false, false, false, false, true, true, true, true, false, false, false, false },
                { false, false, false, true, false, false, false, false, true, false, false, false },
                { false, false, true, false, true, false, false, true, false, true, false, false },
                { false, false, true, false, false, false, false, false, false, true, false, false },
                { false, false, true, false, false, false, false, false, false, true, false, false },
                { false, false, true, false, false, true, true, false, false, true, false, false },
                { false, false, false, true, true, false, false, true,true, false, false, false },
                { false, false, false, false, true, true, true, true, false, false, false, false },
                { false, false, false, false, false, false, false, false, false, false, false, false } };

        afficherImage(image);

    }

    public static void effacerImage(boolean[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j; j < tableau[j].length; j++) {
                tableau[i][j] = false;
            }
        }

    }

    public static boolean[][] creerImage(int l, int L) {
        boolean[][] tableau = new boolean[l][L];
        return tableau;

    }

    public static void afficherImage(boolean[][] tableau) {

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                if (tableau[i][j] == true) {
                    System.out.print('X');
                } else {
                    System.out.print(' ');
                }

            }
            System.out.print('\n');
        }

    }
}
