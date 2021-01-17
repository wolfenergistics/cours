class Cercle {
    private double rayon;
    private double a;
    private double b;

    //constructeur par défaut

    public Cercle(){
        this(1,0,0);
    }

    //constructeur par initialisation

    public Cercle(double r,double a,double b){
        if(r>=0){
            rayon = r;
        }
      
        this.a = a;
        this.b = b;
        
    }

    //getters

    public double getRayon(){
        return rayon;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }

    //setters

    public void setRayon(double r){
        if(r>=0){
            rayon = r;
        }
    }
    public void setA(double a){
        if(a>=0){
            this.a = a;
        }
    }
    public void setB(double b){
        if(b>=0){
            this.b = b;
        }
    }

    //toString

    public String toString(){
        return "le cercle est de rayon : "+rayon+" et de coordonées ["+a+";"+b+"].";
    }
}
