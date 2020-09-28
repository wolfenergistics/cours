import java.util.Scanner;
class somme {
  public static void main (String[] args){
    Scanner clavier = new Scanner(System.in);
    int valun;
    int valdeux;
    int somme;
    System.out.print("valeur1 :");
    valun = clavier.nextInt();
    System.out.print("valeur2 :");
    valdeux = clavier.nextInt();
    somme = valun + valdeux;
    System.out.print("la somme  de ");
    System.out.print(valun);
    System.out.print("  + ");
    System.out.print(valdeux);
    System.out.print(" est ");
    System.out.print( valun + valdeux);
  }
}