import java.util.Scanner;

class signe {
  public static void main (String[] arg) {
    int test;
    Scanner clavier = new Scanner(System.in);
    System.out.print("entrer une valeur");
    test = clavier.nextInt();
    if ( test < 0){
    System.out.print("le nombre est négatif");
    }
    else{
      if (test == 0){
        System.out.print("le nombre est égale a zéro");
        
      }
      else{
        System.out.print("le nombre est positif");
      }
    }
  }
}