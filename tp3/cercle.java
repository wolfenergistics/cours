import java.util.Scanner;

class cercle {
    public static void main(String[] arg) {
        final Scanner clavier = new Scanner(System.in);
        double r;double p;double perim
        final double PI = Math.PI;

         System.out.println("entrer le rayon du cercle");
         r = clavier.nextDouble();

         while(r<0){
             System.out.println("valeur impossible recommence");
             r = clavier.nextDouble();
         }
         
         p = 2*PI*r;
         System.out.println("le perimetre est : "+p);
        
    }
}