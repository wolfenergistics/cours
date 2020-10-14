import java.util.Scanner;

public class TrianglePascal {
    private static Scanner clavier = new Scanner(System.in);
    public static void main(String[] arg){
        double facto;

        facto = factorielle();
        System.out.println(facto);



    }
    









    public static double factorielle(){
        double tempo;
        int x;
        tempo = 1;
        x = clavier.nextInt();
        for(int i =1; i<=x ; i++ ){
        tempo = tempo * i;
        }
        
        return tempo;
    }
}
