import java.util.Scanner;



public class TrianglePascal {
    private static Scanner clavier = new Scanner(System.in);
    
    public static void main(String[] arg){
        
        long n;long digit;
        System.out.println("entrer n : ");
        n = clavier.nextLong();
        
       
        //afficherLigne(n);
        
        AfficherTriangle(n);
    }
    









    public static long factorielle(long x){
        long tempo =1;
        
        for(long i=1;i<=x;i++){
        tempo = tempo * i;
        }
        
        return tempo;
    }

    public static long coeffBinomial(long n,long p){
       long binom,facton, factodiv, nmp = n-p, factonmp;

        facton = factorielle(n);
        factonmp = factorielle(nmp);
        factodiv = factorielle(p);
        
        binom = facton/(factonmp*factodiv);
        return binom;

    }
    public static void afficherLigne(long n,long coef){
    
        for (long i=0;i<n;i++){
           
         afficherValeur(coef);
         
        } 
        
    }
    public static void AfficherTriangle(long n){
        long digits ;
        for(long i=0;i<n;i++){
            
           
                
             afficherLigne(n,coeffBinomial(n, i));
            
            

            
            System.out.print("\n");
        }
        
    }
    public static long nbreDigit(long n){
        long nbrdigit =0;long div;
         div = n;
        while(div!=0){
            div = div/10;
            nbrdigit+=1;
        }
        return nbrdigit;

    }

    public static long coeffMaximum(long n){
        long coeffmax =0 ;long temp=0;

        for(long i =0;i<n;i++){

            temp = coeffBinomial(n,i);

            if(temp>coeffmax){
                coeffmax = temp;
            }
               
        }

        return coeffmax;

    }
    public static void afficherEspace(long n){
        
        for(long i=0;i<n;i++){
            System.out.print(" ");
        }
    }
    public static void afficherValeur(long n){
        
        
        
        for(int i=0;i<n;i++){
        afficherEspace(nbreDigit(n));
        System.out.print(n);
        }
         
         
        
        
    }
}
