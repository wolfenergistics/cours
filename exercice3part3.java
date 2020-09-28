import java.util.Scanner;

class calculatricepart3{
  public static void main (String[] arg) {
    final Scanner clavier = new Scanner(System.in);
    final char plus = '+';
    final char moins = '-';
    final char mult = '*';
    String attente;
    int  valun; int valdeux;
    int res;
    String operation;
    
    
    System.out.print("enter first number : ");
    valun = clavier.nextInt();
    System.out.print("enter second number : ");
    valdeux = clavier.nextInt();
  
    System.out.println("choisir entre +;-;*;/"); //choix de l'opération a faire
    
   /*cette partie sert a la lecture dede l'opérationl'opération*/
    attente = clavier.next();
    operation = attente.substring(0);
    System.out.print(operation);
    char rsop = operation.charAt(0);
    
    while((rsop != mult)&&(rsop !=plus)&&(rsop !=moins)&&(rsop !='/')){
      System.out.print("erreur chractère non connu");
      attente = clavier.next();
      operation = attente.substring(0);
      System.out.print(operation);
      rsop = operation.charAt(0);
     
    }
   /*partie calcul
     
      if (rsop == plus){
      res = valun + valdeux;
      System.out.print("l'addition de "+ valun + " et " + valdeux + " est : " + res);
      }
      
      else{
        if (rsop == moins){
          res = valun - valdeux;
          System.out.print("la soustraction de "+ valun + " et " + valdeux + " est : " + res);
        }
        else {
          if (rsop == mult){
          res = valun * valdeux;
          System.out.print("la multiplication de "+ valun + " et " + valdeux + " est : " + res);
          }
          else {
            if (valdeux == 0){
            System.out.println("division impossible par zero");
            }
            else {
            res = valun / valdeux;
            System.out.print("la division de "+ valun + " et " + valdeux + " est : " + res);
            }
          }
        }
      }*/
    switch (rsop) {
      case plus :
        res = valun + valdeux;
        System.out.print("l'addition de "+ valun + " et " + valdeux + " est : " + res);
        break;
      case moins :
        res = valun - valdeux;
        System.out.print("la soustraction de "+ valun + " et " + valdeux + " est : " + res);
        break;
      case mult :
        res = valun * valdeux;
        System.out.print("la multiplication de "+ valun + " et " + valdeux + " est : " + res);
        break;
      case '/' :
        if (valdeux == 0){
          System.out.print("division  par zero");
         
        }
        else{
          res = valun / valdeux;
           System.out.print("la division de "+ valun + " et " + valdeux + " est : " + res);
        }
        break;
        
      
      
    }
    
    
    
    
    
   
   
   
   
   
    
  }
 }
