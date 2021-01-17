import java.util.Arrays;
import java.util.Scanner;

import java.util.Date;

class recherchetableau1 {

    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] arg) {
        int[] tab, rechercher;
        int a, b, n, recherchenbr, valrecherche;
        long temps;

        System.out.println("combien de case pour le tableau");
        n = clavier.nextInt();
        System.out.println("intervalle de valeur?");
        a = clavier.nextInt();
        b = clavier.nextInt();
        System.out.println("cbn de recherche");
        recherchenbr = clavier.nextInt();
        rechercher = GenererTableau(recherchenbr, a, b);
        tab = GenererTableau(n, a, b);
        afficher(tab);
        afficher(rechercher);
        temps = getTemps();
        for (int i = 0; i < rechercher.length; i++) {
            valrecherche = RechercheSequentielle(tab, rechercher[i]);
            System.out.println(valrecherche);
        }

        System.out.println("temps ecouler " + (getTemps() - temps));
        Arrays.sort(tab);
        afficher(tab);

        temps = getTemps();
        for (int i = 0; i < rechercher.length; i++) {
            valrecherche = RechercheSequentielleTriee(tab, rechercher[i]);
            System.out.println(valrecherche);
        }

        System.out.println("temps ecouler " + (getTemps() - temps));
    }

    public static int Aleatoire(int a, int b) {
        int temp = (int) (Math.random() * (b - a) + a);

        return temp;
    }

    public static int[] GenererTableau(int n, int a, int b) {
        int[] tab = new int[n];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Aleatoire(a, b);
        }
        return tab;
    }

    public static void afficher(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static int RechercheSequentielle(int[] tab, int recherche) {
        int trouver = -1;
        int i;
        i = -1;
        do {
            i++;
            if (recherche == tab[i]) {
                trouver = i;
            }

        } while ((tab[i] != recherche) && (i < (tab.length - 1)));

        if (trouver == i) {
            return trouver;
        } else {

            return trouver;
        }
    }

    public static int RechercheSequentielleTriee(int[] tab, int recherche) {
        int temp;
        temp = Arrays.binarySearch(tab, recherche);
        if (temp < -1) {
            temp = -1;
        }
        return temp;
    }

    public static long getTemps() {
        Date d = new Date();
        return d.getTime();
    }
}
