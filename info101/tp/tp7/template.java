import java.util.Scanner;

class mastermind {

    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] arg) {

        int[] solution1, proposition1, solution2, proposition2;
        char[] resultat1, resultat2;
        boolean gagne1, gagne2;
        int taille, intera, interb, compteur1 = 0, compteur2 = 0;
        String joueurs;

        System.out.println("combien de joueurs ?");
        joueurs = clavier.next();

        if (joueurs.equals("un")) {
            do {
                System.out.println("combien de nombre a trouvé ?(4 minimun)");
                taille = clavier.nextInt();
            } while (taille < 4);
            System.out.println("entrer l'intervalle des valeurs a trouver");
            intera = clavier.nextInt();
            interb = clavier.nextInt();
            solution1 = RemplirSolution(taille, intera, interb);
            afficherTableauEntier(solution1);
            do {
                compteur1 += 1;
                System.out.println("essai num" + compteur1 + ":");
                proposition1 = SaisirProposition(taille, intera, interb);
                gagne1 = AfficherResultat(proposition1, solution1);

            } while (gagne1 != true);
            System.out.println("vous avez gagne en " + compteur1 + " essais");
        }

    }

    public static void afficherTableauEntier(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println(" ");
    }

    public static void afficherTableauCarateres(char[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println('\n');
    }

    public static int[] RemplirSolution(int taille, int intera, int interb) {
        int[] tab = new int[taille];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (interb - intera) + intera);
            for (int j = 0; j < i; j++) {
                if (tab[i] == tab[j]) {
                    tab[i] = (int) (Math.random() * (interb - intera) + intera);
                }
            }
        }

        return tab;
    }

    public static int[] SaisirProposition(int taille, int intera, int interb) {
        int[] tab = new int[taille];

        for (int i = 0; i < tab.length; i++) {
            do {
                System.out.println("valeur entre " + intera + " a " + interb + " inclus");
                tab[i] = clavier.nextInt();
            } while ((tab[i] < intera) || (tab[i] > interb));
        }
        return tab;
    }

    public static boolean BienPlacee(int[] solution, int valeur, int position) {

        if (valeur == solution[position]) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean MalPlacee(int[] solution, int valeur, int position) {
        boolean tempo = false;
        for (int i = 0; i < solution.length; i++) {
            if ((valeur == solution[i]) && (valeur == solution[position])) {
                tempo = true;
            }

        }
        return tempo;

    }

    public static char[] Compare(int[] proposition, int[] solution) {
        int i, j;
        boolean bp, mp;
        char[] tab = new char[(solution.length)];

        // verification bien placée
        for (i = 0; i < tab.length; i++) {
            bp = BienPlacee(solution, proposition[i], i);
            if (bp = true) {
                tab[i] = 'B';
            }
            bp = false;

        }
        // mal placée
        for (j = 0; i < tab.length; i++) {
            mp = MalPlacee(solution, proposition[j], i);
            if ((mp = true) || (tab[j] != 'B')) {
                tab[j] = 'M';
            }
            mp = false;
        }

        return tab;
    }

    public static boolean Gagne(char[] resultat) {
        int taille = (resultat.length);
        int bp = 0;

        for (int i = 0; i < taille; i++) {
            if (resultat[i] == 'B') {
                bp += 1;
            }
        }
        if (bp == taille) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean AfficherResultat(int[] proposition, int[] solution) {
        char[] comparaison = new char[(solution.length)];
        System.out.println("voici votre reponse :");
        afficherTableauEntier(proposition);
        System.out.println("voici le resultat de la comparaison");
        comparaison = Compare(proposition, solution);
        afficherTableauCarateres(comparaison);

        if (Gagne(comparaison) == true) {
            return true;
        } else {
            return false;
        }
    }

}