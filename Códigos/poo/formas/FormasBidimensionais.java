package poo.formas;

public class FormasBidimensionais extends Formas {
    private double area;
    private double perimeter;

    public FormasBidimensionais(String name, double axisX, double axisY){
        super(name, axisX, axisY);
        this.area = 0.0;
        this.perimeter = 0.0;
    }

    public double getArea() {
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    private double getPerimeter() {
        return perimeter;
    }

    private void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void calcArea(){
        if(getName().equals("Quadrado")){
            setArea(getAxisX() * getAxisY());
        } else if(getName().equals("Triângulo")){
            this.area = (this.getAxisX() * this.getAxisY()) / 2;
        } else if(getName().equals("Círculo")) {
            this.area = Math.PI*this.getAxisX()*this.getAxisX();
        }
    }

    public double calcPerim(String name){
        if(name.equals("Quadrado")){
            this.perimeter = getAxisX()*4;
        } else if (name.equals("Triângulo")) {
            this.perimeter = getAxisX()*3;
        } else if(name.equals("Círculo")) {
            this.perimeter = 2*Math.PI*getAxisX();
        }
        return this.perimeter;
    }

    @Override
    public String toString() {
        return "FormasBidimensionais [area=" + this.getArea() + ", perimeter=" + perimeter + "]";
    }



   

    //public String toString(){
        //return "\nNome da figura: "+getName()+ "\nEixo X: " +getAxisX()+ "\nEixo Y: " +getAxisY() + 
        //"\nÁrea: " +area+ " m^2" + "\nPerímetro: " +perimeter+ " m";
    //}
        

}
