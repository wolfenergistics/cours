import java.util.*;

class amadrone {

  private static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        int nbrjour;int[] periode;int premierjour;int test=0;int nbcolis=250;
    
    
        System.out.print("nombre de jour a analyser : ");
        nbrjour = sc.nextInt();
        periode= recuperer(nbrjour);
        bilan(periode);
        nbrcolis(periode,nbcolis);
        premierjour = rechercherjour(periode,nbcolis);
        System.out.println("Le premier jour avec plus de 250 colis est : Jour "+premierjour);
        for(int i=0;i<periode.length;i++){
            if(nbcolis==periode[i]){
                test = i;
                break;
            }
        }
        System.out.println(test);

 
 
 
 
 
    }



    public static int[] recuperer(int periode){
           int[] tab = new int[periode];
        for(int i =0;i<tab.length;i++){
            tab[i] =(int)((Math.random()*(300-100)+100));
        }
    return tab;
    } 

    public static void bilan(int[] periode){
        for(int i=0;i<periode.length;i++){
            System.out.println("Jour "+i+" : "+ periode[i] + "colis");
        }
    }
    public static void nbrcolis(int[] periode,int nbrcolis){
        int total = 0;int nbrcamion;

        for(int i=0;i<periode.length;i++){
            total = total + periode[i];
        }
        nbrcamion = (int)(total/nbrcolis);
        System.out.println("il faut "+nbrcamion+" camion(s)");
    }

    public static int rechercherjour(int[] periode,int nbrcolis){
        int retour=-1;

        for(int i=0;i<periode.length;i++){
            if(nbrcolis==periode[i]){
                retour = i;
                break;
            }
        }
        
        return retour;
        
    }
    
}
