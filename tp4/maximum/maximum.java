import java.util.Scanner;

class maximum{
    public static void main(String[] arg) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("saisir premiere valeur : ");
        double val1 = clavier.nextDouble();
        System.out.println("saisir deuxieme valeur : ");
        double val2 = clavier.nextDouble();
        maxou(val1, val2);
     System.out.println(val1);

    }








    public static double maxou (double val1, double val2){
       
        if (val1>val2){
           ;
           return val1;
        }
        else {
            val1 = val2;
            return val1;
        }
    }
}
