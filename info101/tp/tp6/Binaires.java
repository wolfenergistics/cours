import java.util.Scanner;

public class Binaires {
    private static  java.util.Scanner clavier = new Scanner(System.in);
public static void main(String[] arg){
    int nbOctets, entier, cpt=1;int somme;

    System.out.print("Entrez un entier de Octets (pour la suite, tout les binaires seront en ce nombre d'Octets) : ");
    nbOctets=clavier.nextInt();

    int [] nbBinaire01 = new int [nbOctets*8];
    int [] nbBinaire0 = new int [nbOctets*8];
    int [] nbBinaire1 = new int [nbOctets*8];
    int [] nbBinaire2 = new int [nbOctets*8];
    int [] resSomme = new int [nbOctets*8];

    System.out.println("Conversion d'un entier en binaire :");
    System.out.print("Entrez un entier : ");
    entier=clavier.nextInt();
    System.out.print(" en binaire : ");
    nbBinaire01=complementA2(entier2binaire(entier,nbOctets));
    for (int p=nbBinaire01.length-1; p>=0; p--) {
     System.out.print(nbBinaire01[p]);
 }
 System.out.println();

    System.out.println("Conversion d'un nombre binaire en entier : ");
   System.out.println("Entrez un nombre binaire : ");
    for (int i=nbBinaire0.length-1; i>=0; i--) {
        System.out.print("case "+(cpt)+" : ");
        nbBinaire0[i]=clavier.nextInt();
        cpt++;
    }
    System.out.println(" en entier : " + binaire2entier(nbBinaire0));

    cpt=1;
    System.out.println("Somme de 2 nombres binaires :");
    System.out.println("Entrez le premier :");
    for (int j=nbBinaire1.length-1; j>=0; j--) {
        System.out.print("case "+(cpt)+" : ");
        nbBinaire1[j]=clavier.nextInt();
        cpt++;
    }
    cpt=1;
    System.out.println("Entrez le deuxieme :");
    for (int k=nbBinaire2.length-1; k>=0; k--) {
        System.out.print("case "+(cpt)+" : ");
        nbBinaire2[k]=clavier.nextInt();
        cpt++;
    }
    somme=somme(nbBinaire1, nbBinaire2);
    System.out.println("Voici le resultat de la somme: "+somme);
    

    resSomme=complementA2(entier2binaire(somme, nbOctets));
    System.out.print("Soit : ");
    for (int l=resSomme.length-1; l>=0; l--) {
        System.out.print(resSomme[l]);
    }
}

public static int[] entier2binaire(int valeur,int octets){

    int[] t= new int[(octets*8)];
    int[] tempo=new int[(octets*8)];
    int bin;

    for(int i=0;i<t.length;i++){

        bin=valeur%2;
        valeur=valeur/2;
        t[i]=bin;
    }
    for(int i=0;i<t.length;i++){
        tempo[i]=t[(t.length-1)-i];


    }

 return tempo;
}


public static int binaire2entier(int[] binaire){

    int decimal = 0;

    for(int i =0;i<binaire.length;i++){
        decimal = binaire[i]+decimal*2;

    }

    return decimal;
}


public static int somme(int[] binaire1,int[] binaire2){

    int binaire01,binaire02,addition;
    
    binaire01 = binaire2entier(binaire1);
    binaire02 = binaire2entier(binaire2);

    addition = binaire01+binaire02;
    
   return addition; 
}


public static int [] complementA2 (int [] binaire){
    if (binaire2entier(binaire)<0) {
        binaire=entier2binaire(-binaire2entier(binaire),1);
        binaire[binaire.length-1]=1;
    }
    else{
        binaire[binaire.length-1]=0;
    }
       return binaire;
}

    
}
