import java.util.Scanner;
class mastermindtableau {

    public static void main(String[] arg){

        Scanner clavier = new Scanner(System.in);
        int i;int[] joueur1 = new int[4];int[] joueur2 = new int[4];
        int[] choix1 = new int[4];int[] choix2 = new int[4];
        int tab1;int tab2;int alea;
        String nbrjoueur;
        int player1 = 0;int player2 = 0;
        String jeu;

        System.out.println("le choix est fait pret a jouer ?");
        System.out.println("oui / non ");
        jeu = clavier.next();
        
            if (jeu.equals("non")) {
                System.out.println("au revoir");
                System.exit(0);

            }
            else {
                System.out.println("combien de joueurs ?");
                System.out.println("1j pour 1 joueur /2j pour 2 joueurs");
                nbrjoueur = clavier.next();


                if (nbrjoueur.equals("1j")){
                    for (tab1=0;tab1<(joueur1.length);tab1++){
                        alea = (int) (Math.random() * 10);
                        joueur1[tab1] = alea;
                    }
                    
                }
            }

    } 

    
}
