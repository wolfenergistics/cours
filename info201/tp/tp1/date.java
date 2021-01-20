class Date{

    //attributs

    private int jour;
    private int mois;
    private int annee;
    private int[] jourmois = {31,28,31,30,31,30,31,31,30,31,30,31};
   
    //constructeurs

    public Date(){

        this(1,1,0000);
    }

    public Date(int j,int m,int a){

        if((j>0)&&(j<32)){
            jour = j;
        }
        else{
            jour = 1;
        }
        if((m>0)&&(m<12)){
            mois = m;
        }
        else{
            mois =1;
        }
        if(a>0){
            annee = a;
        }
        else{annee = 0;}
    }

    //getters

    public int getJour(){
        return jour;
    }
    public int getMois(){
        return mois;
    }
    public int getAnnee(){
        return annee;
    }

    //setters

    public void setJour(int j){
        if((j>0)&&(j<32)){
            jour = j;
        }
    }
    public void setMois(int m){
        if((m>0)&&(m<=12)){
            mois = m;
        }
    }
    public void setAnnee(int a){
        if(a>0){
            annee = a;
        }
    }

    //méthodes
    public String toString(){
        return jour+"/"+mois+"/"+annee;
    }
    public void afficher(){
        System.out.println(toString());
    }

    public boolean estBissextile(){
        if((getAnnee()%4==0)&&(getAnnee()%100!=0)||(getAnnee()%400==0)){
            return true;
        }
        else{return false;}
    }
    public int nbJours(int m){
        int sortie;
        boolean bissex = estBissextile();
        m=m-1;
        sortie = jourmois[m];
        if((m==1)&&(bissex == true)){
            sortie = jourmois[m]+1;
        }
    
        return sortie;
    }
    public boolean estValide(){
        return ((jour>0)&&(jour<=nbJours(getMois()))&&(mois>0)&&(mois<=12));
    }
}