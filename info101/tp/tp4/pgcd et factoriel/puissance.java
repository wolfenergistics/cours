import java.util.Scanner;

 class puissance {
    public static void main (String[] arg){
        int x;
        int n;
        Scanner clavier = new Scanner(System.in);
        System.out.println("entrer x:");
        x = clavier.nextInt();
        System.out.println("entrer la puissance");
        n = clavier.nextInt();
        puiss(x,n);
        System.out.println(puiss(x,n));
    }


    public static int puiss(int x,int n){
        int resultat;
        resultat = x;
        for(int i =1; i<n ; i++ ){
        resultat = resultat * x;
        }
        
        return resultat;
    }
}