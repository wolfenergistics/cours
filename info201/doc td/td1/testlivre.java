import java.util.*;

class testLivre{
    private static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args){
        String titre;int ISBN;double prix;

        System.out.println("entrer le titre du livre");
            titre = clavier.next();
        System.out.println("entrer l'ISBN");
            ISBN = clavier.nextint();
        System.out.printl("entrer prix");

        Livre l1 = new Livre();
        Livre l2 = new Livre(titre, ISBN, prix);

        System.out.println(l1.toString());
        System.out.println(l2.toString());

    }
}