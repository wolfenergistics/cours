class Vecteur{
    private String Nom;
    private int Abscisse;
    private int Ordonnee; 


//constructeur

public Vecteur(String Nom,int Abscisse,int Ordonnee){
    this.Nom = Nom;
    this.Abscisse = Abscisse;
    this.Ordonnee = Ordonnee;
}

//getters
public String getNom(){
    return Nom;
}
public int getAbscisse(){
    return Abscisse;
}
public int getOrdonnee(){
    return Ordonnee;
}

//setters

public void setAbscisse(int a){
    Abscisse = a;
    
}
public void setOrdonnee(int o){
    Ordonnee =o;
}

public String toString(){
    return "le vecteur "+Nom+" a pour abscisse : "+Abscisse+" et pour Ordonnée : "+Ordonnee;
    
}

}
