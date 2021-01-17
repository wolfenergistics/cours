class ClasseA{

    private int a;
    private double b;

    public ClasseA(int a,double b){
        this.a = a;
        this.b = b;
    }

    public void setA(int a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public int getA(){
        return a;
    }
    public double getB(){
        return b;
    }

    public void afficher(){
        System.out.println(a+" + "+b);
    }
}


class ClasseB{

    private String chaine;
    private boolean a;


    public ClasseB(String c,boolean a){
        chaine = c;
        this.a = a;
    }

    public void setA(boolean a){
        this.a = a;
    }

    public String getChaine(){
        return chaine;
    }

    public boolean getA(){
        return a;
    }
    public String toString(){
        return chaine+" + "+a;
    }

    public void afficher(){
        System.out.println(chaine+" + "+a);
    }
}