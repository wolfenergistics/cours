import java.util.Scanner;

import javax.xml.crypto.dsig.SignatureProperties;

public class facturation {
    private static Scanner clavier = new Scanner(System.in);
    public static void main(String[] arg){
     int[] siropera = new int[4]; int siropbleu;  double fdt;String facture;
     
     
     System.out.println("voulez-vous saisir une facture?");
     System.out.println("oui/non");
     facture = clavier.nextLine();
     
        while(facture.equals("oui")){
      
            siropera = saisirNbSiropErable();
            siropbleu = saisirNbSiropBleuets();
            fdt = calculerFraisTransport(siropera, siropbleu);
            afficherFacture(siropera, siropbleu); 
            System.out.println();
            System.out.println("voulez-vous saisir une facture?");
            System.out.println("oui/non");
            facture = clavier.nextLine();
        
        }
     
        
     System.out.println("bonne fin de journee");


    }
    




















    public static  int[] saisirNbSiropErable(){
        int[] tab;int siroperabletot;String siroptype="a definir";int siropmedium = 1;int siropclair=1;int siropnorm=1;
        boolean verifsirop;
        
        while(!siroptype.equals("fin")){
            System.out.println("saisir type de sirop: normal/clair/medium fin pour arreter la saisie :");
            siroptype = clavier.nextLine();
            verifsirop = false;
            switch (siroptype){
                
                case "normal" :
                    System.out.println("saisir nombre de cruchon");
                    siropnorm = clavier.nextInt();
  
                 while (verifsirop == false){
                    if (siropnorm%3 != 0){
                        verifsirop = false;
                        System.out.println("vendu par lot de 3 merci de corriger");
                        siropnorm = clavier.nextInt();
                    }
                    else{
                        verifsirop = true;
                    }
                 }
                break;
                    
                case "clair" :
                    System.out.println("saisir nombre de cruchon");
                    siropclair = clavier.nextInt();
   
                    while (verifsirop == false){
                        if (siropclair%3 != 0){
                            verifsirop = false;
                            System.out.println("vendu par lot de 3 merci de corriger");
                            siropclair = clavier.nextInt();
                        }
                        else{
                            verifsirop = true;
                        }
                    }
                break;
                
                case "medium" :
                    System.out.println("saisir nombre de cruchon");
                    siropmedium = clavier.nextInt();

                    while (verifsirop == false){
                        if (siropmedium%3 != 0){
                            verifsirop = false;
                            System.out.println("vendu par lot de 3 merci de corriger");
                            siropmedium = clavier.nextInt();
                        }
                        else{
                            verifsirop = true;
                        }
                    }
                break;
                
                    
                
            } 
        }  
            if (siropnorm == 1){
                siropnorm = 0;
            }
            if(siropclair == 1){
                siropclair =0;
            }
            if(siropmedium ==1){
                siropmedium =0;
            }
      
      siroperabletot = siropmedium + siropclair + siropnorm;
      tab =new int[] { siropnorm , siropclair , siropmedium , siroperabletot };
     
      return  tab;
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

    public static double calculerFraisTransport(int[] siropera,int siropbleu){
        double fraisdetransporterable;double fraisdetransportbleu;double fraistot;

        
            if (siropera[3] <= 11){
             fraisdetransporterable = siropera[3]*1.5;
            }

            else if (siropera[3]<=24){
             fraisdetransporterable = siropera[3]*1;
            }
            
            else{
            fraisdetransporterable = 0;
            }
             

        
        fraisdetransportbleu = siropbleu *0.5; 
        fraistot = fraisdetransportbleu +fraisdetransporterable;
        return fraistot;
    }

    public static void  afficherFacture(int[] siropera,int siropbleu){
        double prixnorm;double prixbleu;double prixtot;double prixclair;double prixmedium;

        prixnorm = 28*siropera[0];
        prixclair = 23.5*siropera[1];
        prixmedium = 21.4*siropera[2];
        prixbleu = 12*siropbleu;
        prixtot = prixbleu + prixnorm + prixclair + prixmedium + calculerFraisTransport(siropera, siropbleu);
        System.out.println("vous avez commandez : "+siropera[0]+" normal/aux vendu a 28e/L soit :"+prixnorm);
        System.out.println("vous avez commandez : "+siropera[1]+" clair vendu a 23.5e/L soit :"+prixclair);
        System.out.println("vous avez commandez : "+siropera[2]+" medium vendu a 21.4e/L soit :"+prixmedium);
        System.out.println("vous avez commandez : "+siropbleu+" vendu a 12e/bouteille soit : "+prixbleu);
        System.out.println("les frais de port s'elevent a : "+calculerFraisTransport(siropera, siropbleu));
        System.out.println("la facture est donc de : "+prixtot);
        
    }

}

