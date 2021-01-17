class neige{
    public static void main(String[] args){
    int x=0, y=0, nb=999999, l=0, nb2=10;
    do{
        for(int i=0; i<nb2; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("o");
            for(int k=0; k<(nb2-i)/2; k++){
                System.out.print(" ");
            }
            System.out.print("o");
            for(int k=0; k<(nb2-i)/2; k++){
                System.out.print(" ");
            }
        }
        l++;
    }while(l<nb);
}
}