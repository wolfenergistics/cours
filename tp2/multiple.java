import java.util.Scanner;

class multiple {
  public static void main (String[] arg){
     
    Scanner clavier = new Scanner(System.in);
    int a;int b; //domaine d'intervalle
    int n; // valeur saisie par l'utilisateur
    int i; // variable de boucle
    System.out.println("entrer a de l'intervalle : ");
    a = clavier.nextInt();
    System.out.println("entrer b de l'intervalle : ");
    b = clavier.nextInt();        
    System.out.println("entrer n : ");
    n = clavier.nextInt();
           
    
            while (b<a){
                System.out.println("b inferieur à a merci de changer la valeur : ");
                b = clavier.nextInt();
            } // verification b>a
        
            while ((n<a)||(n>b)){
                System.out.println("n non compris dans l'intervalle recommence");
                n = clavier.nextInt();

            }

            for(i = a;i <=b;i++){
              
              if (n == 1){
                 System.out.println(i + " est multiple de " + n);
                 }
                else if ((n%2 == 0)&&(i%2 == 0)){
                 System.out.println( i + " est multiple de " + n);
                }   
                else if ((n%3 == 0)&&(i%3 == 0)){
                 System.out.println( i + " est multiple de " + n);
                }
                else if((n%4 == 0)&&(i%4 == 0)) {
                 System.out.println(i + " est multiple de " + n);
                }
                else if((n%5 == 0)&&(i%5 ==0)){
                 System.out.println(i + " est multiple de "+n);
                }
                else if ((n%6 == 0)&&(i%6 == 0)){
                 System.out.println( i + " est multiple de " + n);
                }   
                else if ((n%7 == 0)&&(i%7 == 0)){
                 System.out.println( i + " est multiple de " + n);
                }
                else if((n%8 == 0)&&(i%8 == 0)) {
                 System.out.println(i + " est multiple de " + n);
                }
                else if((n%9 == 0)&&(i%9 ==0)){
                 System.out.println(i + " est multiple de "+n);
                 }
              
            }
        }
    
}









 
    