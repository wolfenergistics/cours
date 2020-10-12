import java.util.Scanner;

class quizz {
    public static void main(String[] arg) {
        final Scanner clavier = new Scanner(System.in);
        int i = 1;
        final int  inconnu;
        int reponse = 0;
        int recherche = 0;
        int borne1;
        int borne2;
        int nbressaie;

        
        //System.out.println("le but du jeu est de trouver une valeurs entre 1 et 1024");
        System.out.println("a chaque fois il y aura une indication");
        System.out.println("entrer la première borne de l'intervalle:");
        borne1 = clavier.nextInt();
        System.out.println("entrer la deuxième borne de l'intervalle:");
        borne2 = clavier.nextInt();
        inconnu =  (int)(Math.random()*(borne2-borne1)+borne1);
    
        nbressaie = (int)(Math.log(borne2)/Math.log(2));
        
        
        while(reponse!= inconnu){
               
                System.out.println("entrer votre "+ i + " choix sur "+ nbressaie +"restants");
                reponse = clavier.nextInt();
                if((reponse < inconnu)&&(reponse<=recherche)){
                    System.out.println("trop petit deja dit");
                }
                else if((reponse < inconnu)&&(reponse>recherche)){
                    System.out.println("trop petit");
                    recherche = reponse;
                }
                else if((reponse > recherche)&&(reponse > inconnu)){
                    System.out.println("trop grand");
                    recherche = reponse;
                }
                else if((reponse >=recherche)&&(reponse> inconnu)){
                    System.out.println("trop grand deja dit");
                    
                }
                
                i++;
                nbressaie--;

                if(nbressaie == 0){
                    System.out.println("vous avez utilisee tous vous essaies");
                    System.out.println("le nombre etait : "+inconnu);
                    System.out.println("fin de partie");
                    System.exit(0);
                }

            }
        
         System.out.println("vous avez trouvez gg!!");       
        
    }
}







    
  
