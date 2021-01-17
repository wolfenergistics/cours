import java.util.*;


class TestVecteur{
    private static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args){
        String n;int a,o;

        // saisie utilisateur

        System.out.println("entrer nom du vecteur");
        n = clavier.next();
        System.out.println("entrer l'abscisse");
        a = clavier.nextInt();
        System.out.println("entrer l'ordonnée");
        o = clavier.nextInt();
       
        //construction du vecteur

        Vecteur v1 = new Vecteur(n,a,o);

        //affichage vecteur
        System.out.println("vecteur :"+v1.getNom()+" abscisse :"+v1.getAbscisse()+" ordonnee :"+v1.getOrdonnee());

        System.out.println();

        System.out.println(v1.toString());
    }
}