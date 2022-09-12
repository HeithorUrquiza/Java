package poo.formas;

public class FormasBidimensionais extends Formas {
    private double area = 0;
    private double perimeter = 0;

    public FormasBidimensionais(String name, double axisX, double axisY){
    super(name, axisX, axisY);
    }

    public double calcArea(String name){
        if(name.equals("Quadrado")){
            area = getAxisX() * getAxisY();
        } else if(name.equals("Triângulo")){
            area = (getAxisX() * getAxisY()) / 2;
        } else if(name.equals("Círculo")) {
            area = Math.PI*getAxisX()*getAxisX();
        }
        return area;
    }

    public double calcPerim(String name){
        if(name.equals("Quadrado")){
            perimeter = getAxisX()*4;
        } else if (name.equals("Triângulo")) {
            perimeter = getAxisX()*3;
        } else if(name.equals("Círculo")) {
            perimeter = 2*Math.PI*getAxisX();
        }
        return perimeter;
    }

    public String toString(){
        return "\nNome da figura: "+getName()+ "\nEixo X: " +getAxisX()+ "\nEixo Y: " +getAxisY() + 
        "\nÁrea: " +area+ " m^2" + "\nPerímetro: " +perimeter+ " m";
    }
}
