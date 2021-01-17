import java.util.Scanner;


class note {

    private static Scanner clavier = new Scanner(System.in);
    public static void main(String[] arg){
        
        double[] tab;int valeurmaxnote = 0;

        
        System.out.println("combien de note?");
        tab = new double[clavier.nextInt()];

        System.out.println("valeur de la note maximal ? :");
        valeurmaxnote = clavier.nextInt();

        SaisieNote(tab,valeurmaxnote);
        AfficherNote(tab);
        









        




    }






 public static void SaisieNote(double[] tab,int note){

    for(int i =0;i<tab.length;i++){
        do{
        System.out.println("entree note numero :"+(i+1));
        tab[i] = clavier.nextDouble();
        }while((tab[i]<0)||(note<tab[i]));
        

    }
 }
 public static void AfficherNote(double[] tab){

    for(int i = 0;i<tab.length;i++){
    System.out.print(tab[i]+" ");

    }
    System.out.println("la moyenne est de : "+Moyenne(tab) );
  
 
 }

 public static double Moyenne(double[] tab){
    double resultat = 0;double division = 0;

    for(int i = 0;i<tab.length;i++){

        resultat = resultat + tab[i];
        division++;
    }

    resultat = resultat / division;

    return resultat;

 
 }

}
