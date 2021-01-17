import java.util.Scanner;

class pourpart4 {
    public static void main(String[] arg) {
        Scanner clavier = new Scanner(System.in);
        int i;
        int boucle;

        System.out.println("entrer une valeur :");
        i = clavier.nextInt();

        for (boucle = 0; boucle < i; i--) {
            System.out.println("Bonjour " + (i));
        }

    }
}