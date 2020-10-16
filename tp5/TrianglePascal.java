import java.util.Scanner;

public class TrianglePascal {
    private static Scanner clavier = new Scanner(System.in);
    
    public static void main(String[] arg){
        
        int n;
        System.out.println("entrer n : ");
        n = clavier.nextInt();
        

  

      
        
        afficherTriangle(n);
    }
    









    public static int factorielle(int x){
        int tempo;
        
        tempo = 1;
        
       
        for(int i=1;i<=x;i++){
        tempo = tempo * i;
        }
        
        return tempo;
    }

    public static int coeffBinomial(int n,int p){
       int binom;int facton;int factodiv;int nmp = n-p;int factonmp;

        facton = factorielle(n);
        factonmp = factorielle(nmp);
        factodiv = factorielle(p);
        
        binom = facton/(factonmp*factodiv);
        return binom;

    }
    public static int afficherLigne(int n){
        int ligne = 0;
        for (int i=0;i<=n;i++){
            ligne = coeffBinomial(n,i);
         System.out.print(ligne + " ");  
        }
        return ligne;
    }
    public static int afficherTriangle(int n){
        int triangle = 0;
        for(int i=0;i<=n;i++){
            triangle = afficherLigne(i);
            System.out.println(triangle+" ");
        }
        return triangle;
    }
}
