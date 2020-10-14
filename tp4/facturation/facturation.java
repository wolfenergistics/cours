import java.util.Scanner;

public class facturation {
    private static Scanner clavier = new Scanner(System.in);
    public static void main(String[] arg){
     int siropera; int siropbleu;  
     
     siropera = saisirNbSiropErable();
     System.out.println("nombre commander: "+siropera);
     
     siropbleu = saisirNbSiropBleuets();
     System.out.println("nombre commander: "+siropbleu); 
       
    }
    




















    public static  int saisirNbSiropErable(){
        int siroperable;
        boolean verifsirop = false;
        
        System.out.println("saisir nombre de sirop erable");
        
        siroperable = clavier.nextInt();
       
        while (verifsirop == false){
            if (siroperable%3 != 0){
              verifsirop = false;
              System.out.println("vendu par lot de 3 merci de corriger");
              siroperable = clavier.nextInt();
            }
            else{
                verifsirop = true;
            }              
        }
        return siroperable;
    }

    public static int saisirNbSiropBleuets(){
        int siropbleuets;
        
        System.out.println("saisir nombre de sirop de bleuets");
        siropbleuets = clavier.nextInt();

        while(siropbleuets <0){
            System.out.println("minimum 1 bouteille");
            siropbleuets = clavier.nextInt();
        }
        return siropbleuets;
    }

    public static double calculerFraisTransport(int siropera,int siropbleu){
        double fraisdetransporterable;double fraisdetransportbleu;

        switch (siropera) {
            case (siropera < 11 ): 
             fraisdetransporterable = siropera*1.5;
            break;

            case (siropera<24)):
             

        }
    }
}

