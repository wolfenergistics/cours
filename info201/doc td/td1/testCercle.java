import java.util.*;

class testCercle {
    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args){
        double distance,abscisse1,abscisse2;


        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle(1,3.5,-1.6);
        
        distance = Math.sqrt((Math.pow(c2.getCentre(0),2)+Math.pow(c2.getCentre(1),2)));
        System.out.println("la distance du cercle de l'origine est : "+distance);

        abscisse1 = c1.getA();
        abscisse2 = c2.getA();

        if(abscisse1>0){
            System.out.println(c1.toString());
        }
        else{
            if(abscisse2>0){
                System.out.println(c2.toString());
            }
        }

    }
    
}
