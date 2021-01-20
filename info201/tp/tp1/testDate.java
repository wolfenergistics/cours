import java.util.*;

class testDate {

    private static final Scanner clavier = new Scanner(System.in);
    
    public static void main(String [] args){

        Date date1 = new Date();
        Date date2 = new Date(23, 13, 2020);

        System.out.println(date1.toString());
        System.out.println(date2.toString());

        

        date2.afficher();

        System.out.println(date2.nbJours(2));

        boolean test = date2.estValide();
        System.out.println(test);
        
    }
}
