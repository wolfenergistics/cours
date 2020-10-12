import java.util.Scanner;

class mastermindtableau {
    public static void main(String[] arg) {
        final Scanner clavier = new Scanner(System.in);
        int i;
        int test1p1 = 0; int nbr1p1 = 'X';
        int test2p1 = 0; int nbr2p1 = 'X';
        int test3p1 = 0; int nbr3p1 = 'X';
        int test4p1 = 0; int nbr4p1 = 'X';
        int test1p2 = 0; int nbr1p2 = 'X';
        int test2p2 = 0; int nbr2p2 = 'X';
        int test3p2 = 0; int nbr3p2 = 'X';
        int test4p2 = 0; int nbr4p2 = 'X';
        final int val1p1 = (int) (Math.random() * 10);
        final int val2p1 = (int) (Math.random() * 10);
        final int val3p1 = (int) (Math.random() * 10);
        final int val4p1 = (int) (Math.random() * 10);
        final int val1p2 = (int) (Math.random() * 10);
        final int val2p2 = (int) (Math.random() * 10);
        final int val3p2 = (int) (Math.random() * 10);
        final int val4p2 = (int) (Math.random() * 10);
        String jeux;
        char jeu;
        String nbrjoueur;
        int player1 = 0;int player2 = 0; // vérification des bons

        /*System.out.println("valeurs pour p1 :");
        System.out.println(val1p1);
        System.out.println(val2p1);
        System.out.println(val3p1);
        System.out.println(val4p1);*/

        /*System.out.println("valeurs pour p2 :");
        System.out.println(val1p2);
        System.out.println(val2p2);
        System.out.println(val3p2);
        System.out.println(val4p2);*/

        System.out.println("le choix est fait pret a jouer ?");
        System.out.println("o pour oui /n pour non ");
        jeux = clavier.next();
        jeu = jeux.charAt(0);

        if (jeu == 'n') {
            System.out.println("au revoir");
            System.exit(0);
        } else {
            System.out.println("c'est parti!!!!!");
            System.out.println("combien de joueur ?");
            System.out.println("p1 pour 1 joueurs /p2 pour deux joueurs");
            nbrjoueur = clavier.next();

            if (nbrjoueur.equals("p1")) {

                for (i = 0; i < 10; i++) {
                    System.out.println(nbr1p1+" "+nbr2p1+" "+ nbr3p1 +" " +nbr4p1);
                    System.out.println("entrer valeur 1 : ");
                    test1p1 = clavier.nextInt();
                    System.out.println("entrer valeur 2 : ");
                    test2p1 = clavier.nextInt();
                    System.out.println("entrer valeur 3 : ");
                    test3p1 = clavier.nextInt();
                    System.out.println("entrer valeur 4 : ");
                    test4p1 = clavier.nextInt();

                    // verification de la première valeur saisie

                    if (test1p1 == val1p1) {
                        System.out.println("est bien place");
                        player1 = player1 + 1;
                        nbr1p1 = val1p1;
                    } else if (test1p1 == val2p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test1p1 == val3p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test1p1 == val4p1) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    // verification de la deuxième valeur saisie

                    if (test2p1 == val2p1) {
                        System.out.println("est bien place");
                        player1 = player1 + 1;
                        nbr2p1 =  val2p1;
                    } else if (test2p1 == val1p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test2p1 == val3p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test2p1 == val4p1) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    // verification de la troisième valeur saisie

                    if (test3p1 == val3p1) {
                        System.out.println("est bien place");
                        player1 = player1 + 1;
                        nbr3p1 =  val3p1;
                    } else if (test3p1 == val2p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test3p1 == val1p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test3p1 == val4p1) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    // verification de la quatrième valeur saisie

                    if (test4p1 == val4p1) {
                        System.out.println("est bien place");
                        player1 = player1 + 1;
                        nbr4p1 =  val4p1;
                    } else if (test4p1 == val2p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test4p1 == val3p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test4p1 == val1p1) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    //vérification si gagné
                    
                    if (player1 == 4) {
                        System.out.println("vous avez gagnee");
                        System.out.println("felicitation!");
                        System.exit(0);
                    } else {
                        player1 = 0;
                    }

                }
                System.out.println("perdu  vous n'avez pas vaincu l'ordinateur");
                System.out.println("fin du jeu");

            } else if (nbrjoueur.equals("p2")) {

                for (i = 0; i < 10; i++) {

                    System.out.println(nbr1p1+" "+nbr2p1+" "+ nbr3p1 +" " +nbr4p1);
                    System.out.println("au joueur 1 :");
                    System.out.println("entrer valeur 1 : ");
                    test1p1 = clavier.nextInt();
                    System.out.println("entrer valeur 2 : ");
                    test2p1 = clavier.nextInt();
                    System.out.println("entrer valeur 3 : ");
                    test3p1 = clavier.nextInt();
                    System.out.println("entrer valeur 4 : ");
                    test4p1 = clavier.nextInt();

                    //verification de la première valeur saisie

                    if (test1p1 == val1p1) {
                        System.out.println("est bien place");
                        player1 = player1 + 1;
                        nbr1p1 = val1p1;
                    } else if (test1p1 == val2p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test1p1 == val3p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test1p1 == val4p1) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    // verification de la deuxième valeur saisie

                    if (test2p1 == val2p1) {
                        System.out.println("est bien place");
                        player1 = player1 + 1;
                        nbr2p1 =  val2p1;
                    } else if (test2p1 == val1p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test2p1 == val3p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test2p1 == val4p1) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    // verification de la troisième valeur saisie

                    if (test3p1 == val3p1) {
                        System.out.println("est bien place");
                        player1 = player1 + 1;
                        nbr3p1 =  val3p1;
                    } else if (test3p1 == val2p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test3p1 == val1p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test3p1 == val4p1) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    //verification de la quatrième valeur saisie

                    if (test4p1 == val4p1) {
                        System.out.println("est bien place");
                        player1 = player1 +1;
                        nbr4p1 = val4p1;
                    } else if (test4p1 == val2p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test4p1 == val3p1) {
                        System.out.println("est bon mais mal place");
                    } else if (test4p1 == val1p1) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    
                    System.out.println(nbr1p2+" "+nbr2p2+" "+ nbr3p2 +" " +nbr4p2);
                    System.out.println("au joueur 2 :");
                    System.out.println("entrer valeur 1 : ");
                    test1p2 = clavier.nextInt();
                    System.out.println("entrer valeur 2 : ");
                    test2p2 = clavier.nextInt();
                    System.out.println("entrer valeur 3 : ");
                    test3p2 = clavier.nextInt();
                    System.out.println("entrer valeur 4 : ");
                    test4p2 = clavier.nextInt();

                    //verification de la première valeur saisie

                    if (test1p2 == val1p2) {
                        System.out.println("est bien place");
                        player2 = player2 + 1;
                        nbr1p2 =  val1p2;
                    } else if (test1p2 == val2p2) {
                        System.out.println("est bon mais mal place");
                    } else if (test1p2 == val3p2) {
                        System.out.println("est bon mais mal place");
                    } else if (test1p2 == val4p2) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    // verification de la deuxième valeur saisie

                    if (test2p2 == val2p2) {
                        System.out.println("est bien place");
                        player2 = player2 + 1;
                        nbr2p2 =  val2p2;
                    } else if (test2p2 == val1p2) {
                        System.out.println("est bon mais mal place");
                    } else if (test2p2 == val3p2) {
                        System.out.println("est bon mais mal place");
                    } else if (test2p2 == val4p2) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    // verification de la troisième valeur saisie

                    if (test3p2 == val3p2) {
                        System.out.println("est bien place");
                        player2 = player2 + 1;
                        nbr3p2 = val3p2;
                    } else if (test3p2 == val2p2) {
                        System.out.println("est bon mais mal place");
                    } else if (test3p2 == val1p2) {
                        System.out.println("est bon mais mal place");
                    } else if (test3p2 == val4p2) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    //verification de la quatrième valeur saisie

                    if (test4p2 == val4p2) {
                        System.out.println("est bien place");
                        player2 = player2 +1;
                        nbr4p2 = val4p2;
                    } else if (test4p2 == val2p2) {
                        System.out.println("est bon mais mal place");
                    } else if (test4p2 == val3p2) {
                        System.out.println("est bon mais mal place");
                    } else if (test4p2 == val1p2) {
                        System.out.println("est bon mais mal place");
                    } else {
                        System.out.println("n'est pas bon");
                    }
                    
                    if ((player1 == 4)&&(player2 != 4)){
                        System.out.println("player 1 won");
                    }
                    else if((player1 !=4)&&(player2 == 4)){
                        System.out.println("player 2 won");
                    }
                    else if((player1 == player2)&&(i !=10)){
                        System.out.println("les deux joueurs ont gagnees");
                    }
                    else {
                        player1 =0;
                        player2 =0;
                    }
                }
                System.out.println("les joueurs n'ont pas vaincu l'ordinateur");
                System.out.println("fin du jeu");
            }
        }
    }
}