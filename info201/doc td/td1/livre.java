class Livre{

    private String Titre;
    private int ISBN;
    private double Prix;

    //constructeur par défaut

    public Livre(){
        this("X",0,0.0);
    }

    //constructeur par initialisation

    public Livre(String t,int i,double p){

        Titre = t;
        if(i>=0){
            ISBN = i;
        }
        else{
            ISBN = 0;
        }
        if(p>=0){Prix = p;}
        else{Prix =0;}
    }

    //getters
    public string getTitre(){
        return Titre;
    }

    public Double getPrix(){
        return Prix;
    }

    public int getISBN(){
        return ISBN;
    }

    public void setPrix(double p){

        if(p>=0){
            Prix = p;
        }
    }

    public String toString(){
        return Titre +" est au prix de : "+Prix;

       
    }
}