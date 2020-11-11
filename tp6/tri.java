import java.util.Scanner;






public class tri {

    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
     double[] tab;

        System.out.println("entrer la taille du tableau");

        int taille = clavier.nextInt();

        tab = Allocation(taille);

        RemplirAleatoire(tab);

        System.out.println("tableau avant tri : ");

        afficher(tab);
        
        System.out.println("");

        tab = TriSelection(tab);

        System.out.println("tableau apres tri : ");
        
        afficher(tab);
       


    }
    


   
    public static double[] Allocation(int alloc){
       
        while(alloc<=0){
            System.out.println("entrer taille tableau superieur a 0");
            alloc = clavier.nextInt();
        }
    
         double[] t = new double[alloc];

        return t;
    }
   
    public static double[] Aleatoire(int a,int b,double [] t){
        double [] alea = t;
        
        
        System.out.println("entrer la precision (10 pour 1 decimale/100 pour 2/...");
        final double cst = clavier.nextInt();
        
        for(int i = 0; i < alea.length; i++){
        alea[i] = (double)((int)((Math.random() * (b-a) * cst)) / cst);
        }
        return alea;
    }
    
    public static void RemplirAleatoire(double[] t){

        int a,b;

        System.out.println("entrer l'intervalle d'aleatoire:");
        System.out.println("a: ");
        a = clavier.nextInt();
        System.out.println("b: ");
        b = clavier.nextInt();

        t = Aleatoire(a, b,t);



    }

    public static void afficher(double[] t){

        for(int i = 0;i<t.length;i++){

         System.out.print(t[i]+" ");

        } 
    }


    public static int IndiceMini(double[] t){

        int temp = 0;  double min = t[0];

        for(int i=0;i<t.length;i++){
            
            if(min>t[i]){

                min = t[i];
                temp = i;
            }
            
        }

        return temp;
    }

    public static double Maximum(double[] t){
            
        double max = t[(t.length-1)];

        for(int i=0;i<t.length;i++){

            if (max<t[i]){

                max = t[i];
            }
        }
        return max;
    }

    public static double[] TriSelection(double[] t){
        double[] tempo = new double[t.length];
        int min = 0;
        double max = Maximum(t);
        
        for(int i=0;i<tempo.length;i++){
            min = IndiceMini(t);
            tempo[i] = t[min];
            t[min] = max;
        }
        
        return tempo;
    }

}
