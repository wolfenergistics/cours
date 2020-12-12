import java.util.*;

class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        int n, i = 0, sus = 0, compte = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (i < n) {

            line = sc.nextLine();
            sus = suspect(line);
            if (sus >= 3) {
                compte += 1;
            }

            /* Lisez les données et effectuez votre traitement */
        }
        if (compte >= n / 2) {
            System.out.print("SUSPICIOUS");
        } else {
            System.out.print("OK");
        }
        /*
         * Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes
         * les données.
         */
    }

    public static int suspect(String line) {
        int temp = 0;
        char c;

        for (int i = 0; i < line.length(); i++) {
            c = line.charAt(i);
            if (c <= '2') {
                temp += 1;
            }
            if ((c <= '7') && (temp == 1)) {
                temp += 1;
            }
            if ((c <= '5') && (temp == 2)) {
                temp += 1;
            }
            if ((c <= '9') && (temp == 3)) {
                temp += 1;
            }
        }
        return temp;
    }

}