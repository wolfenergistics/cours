import java.util.Scanner;

class tantque4 {
    public static void main(String[] arg) {
        int i = 0;
        int condition;
        int affichage;
        Scanner clavier = new Scanner(System.in);

        System.out.print("entrer valeur : ");
        condition = clavier.nextInt();
        affichage = condition;
        while (i < condition) {
            System.out.println("bonjour" + (affichage));
            i++;
            affichage = affichage - 1;
        }

    }
}