import java.util.Scanner;

 class factorielle {
    public static void main (String[] arg){
        int x;
        
        Scanner clavier = new Scanner(System.in);
        System.out.println("entrer x:");
        x = clavier.nextInt();
        facto(x);
        System.out.println(facto(x));
    }


    public static double facto(int x){
        double tempo;
        tempo = 1;
        for(int i =1; i<=x ; i++ ){
        tempo = tempo * i;
        }
        
        return tempo;
    }
}