import java.util.Scanner;

class factorielle {
  public static void main (String[] arg){
     
    Scanner clavier = new Scanner(System.in);
    int n;//valeur pour !n
    int i;//variable de boucle
    double resultat;//l'affichage
    
    System.out.print("entrer une valeur : ");
    n = clavier.nextInt();
    resultat = n;
     if (n == 0){
         System.out.println("la factorielle de 0 est : 1");
     }

     else{
       for(i=1;i<n;i++){
        resultat = resultat * i;
       }
       System.out.println("la factorielle de " + n + " est : " + resultat);
    }
 }
}