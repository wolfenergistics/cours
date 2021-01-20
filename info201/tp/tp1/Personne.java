class Personne {

    //attributs

    private String prenom;
    private String nom;
    private String civilite;
    private int age;
    private int taille;
    private double poids;


    //constructeur
        //default
        
        public Personne(){
            this("Civi","x","X",1,1,1);
        }
        
        //instruction

        public Personne(String c,String p,String n,int age,int taille,double poids){
            civilite = c;
            prenom = p;
            nom = n;
            if(age>=0){
                this.age = age;
            }
            if(taille>=0){
                this.taille = taille;
            }
            if(poids>=0.0){
                this.poids = poids;
            }
        }

    //getters

    public String getCivilite(){
        return civilite;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }
    public int getTaille(){
        return taille;
    }
    public double getPoids(){
        return poids;
    }

    //setters
    public void setCivilite(String c){
        civilite = c;
    }
    public void setPrenom(String p){
        prenom = p;
    }
    public void setNom(String n){
        nom=n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setTaille(int t){
        taille = t;
    }
    public void setPoids(double p){
        poids = p;
    }

    //methodes


    
    
}
