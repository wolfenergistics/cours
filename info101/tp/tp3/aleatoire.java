import java.util.Scanner;

class alea4 {
    public static void main(String[] arg) {
        final Scanner clavier = new Scanner(System.in);
        double yolo,min,max;//int entre;int i;double min;double max;
        double[] tab;
        int entre,i;
     System.out.println("entrer une valeur");
     entre = clavier.nextInt();
     tab = new double[entre];
    
        for(i=0;i<(tab.length);i++){
            yolo = Math.random()*10-5;
            System.out.println(yolo);
            tab[i] = yolo;

        }
     min = tab[0];
     max = tab[entre-1];
        for (i=0;i<(tab.length);i++){
            if(min>tab[i]){
                min = tab[i];
            }
            if(max<tab[i]){
                max = tab[i];
            }   

        }

        System.out.println("le minimum est "+min+" et le maximum est "+max);
    }
}
