import java.util.*;

class testCercle {
    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args){

        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle(1,3.5,-1.6);

        System.out.println(c1.toString());
        System.out.print(c2.toString());

    }
    
}
