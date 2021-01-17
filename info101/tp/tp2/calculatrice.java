import java.util.Scanner;

class calculatrice {
    public static void main(String[] arg) {
        final Scanner clavier = new Scanner(System.in);
        final char plus = '+';
        final char moins = '-';
        final char mult = '*';
        final char dehors ='f';
        String attente;
        int valun;
        int valdeux;
        int res;
        String operation;


        for(int i = 0;i<5;i++){
         System.out.println("enter first number : ");
         valun = clavier.nextInt();
         System.out.println("enter second number : ");
         valdeux = clavier.nextInt();

         System.out.println("choisir entre +;-;*;/; f pour quitter"); // choix de l'opération a faire

         /* cette partie sert a la lecture dede l'opérationl'opération */
         attente = clavier.next();
         operation = attente.substring(0);
         char rsop = operation.charAt(0);
        
         
         if (rsop == dehors){
            System.out.println("voulez-vous quitter ?");
            System.out.println("O pour oui / N pour non");
            attente = clavier.next();
            operation = attente.substring(0);
            rsop = operation.charAt(0);
             if (rsop == 'o'){
                System.exit(0);
             }
             else{}
        }
            else{

        
            while ((rsop != mult) && (rsop != plus) && (rsop != moins) && (rsop != '/')) {
            System.out.print("erreur chractère non connu");
            attente = clavier.next();
            operation = attente.substring(0);
            rsop = operation.charAt(0);

            }
     
            switch (rsop) {
                case plus:
                    res = valun + valdeux;
                    System.out.println("l'addition de " + valun + " et " + valdeux + " est : " + res);
                break;
                case moins:
                    res = valun - valdeux;
                    System.out.println("la soustraction de " + valun + " et " + valdeux + " est : " + res);
                break;
                case mult:
                    res = valun * valdeux;
                    System.out.println("la multiplication de " + valun + " et " + valdeux + " est : " + res);
                break;
                case '/':
                    if (valdeux == 0) {
                    System.out.println("division  par zero");
                    }
                    else {
                        res = valun / valdeux;
                        System.out.println("la division de " + valun + " et " + valdeux + " est : " + res);
                    }
                break;
                }
        
            }
        }
        System.out.print("5 opérations effectuées fin du programme");
     }
    
}
