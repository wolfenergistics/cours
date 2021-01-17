import java.util.Scanner;

 class pgcd {
    public static void main (String[] arg){
        int a;
        int b;
        Scanner clavier = new Scanner(System.in);
        System.out.println("entrer a:");
        a = clavier.nextInt();
        System.out.println("entrer b:");
        b = clavier.nextInt();
        estValide(a, b);
        DCGP(a,b);
        System.out.println("le PGCD de "+a+" et de "+b+" est "+DCGP(a,b));
    }


    public static int DCGP(int a,int b){
        int reste =1;
        int resultat =1;
       
      for(int i=0;reste!=0;i++){
            if (a>b){
                reste = a%b;
                a = b;
                b = reste;
                resultat = a;
            }
            else{
                reste = b%a;
                a=b;
                b=reste;
                resultat = a;
            }
        }

         
        return resultat;
    }


    public static boolean estValide(int a,int b){
        boolean valide;

        switch valide {
            case (a<0 et b<0):
            valide = false;
            break;

        }
    }
}
