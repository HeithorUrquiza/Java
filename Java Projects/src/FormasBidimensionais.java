public class FormasBidimensionais extends Formas {
    
    private double pi;
    private double area;
    private double perimeter;

    public FormasBidimensionais(String name, double axisX, double axisY, double pi){
    super(name, axisX, axisY);
    this.pi = pi;
    }

    public double getPi(){
        return pi;
    }

    public void setPi(double pi){
        this.pi = pi;
    }

    public double calcArea(int lado){
        if(lado == 4){
            area = getAxisX() * getAxisY();
        } else if(lado == 3){
            area = (getAxisX() * getAxisY()) / 2;
        } else {
            area = pi*getAxisX()*getAxisX();
        }
        return area;
    }

    public double calcPerim(String name){
        if(name.equals("Quadrado")){
            perimeter = getAxisX()*4;
        } else if (name.equals("Triângulo")) {
            perimeter = getAxisX()*3;
        } else {
            perimeter = 2*pi*getAxisX();
        }
        return perimeter;
    }
}
