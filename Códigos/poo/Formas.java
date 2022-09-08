package poo;

public class Formas {
    
    private String name;
    private double axisX;
    private double axisY;
    
    
    public Formas(String name, double axisX, double axisY){
        this.name = name;
        this.axisX = axisX;
        this.axisY = axisY;    
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getAxisX(){
        return axisX;
    }
    
    public void setAxisX(double axisX){
        this.axisX = axisX;
    }
    
    public double getAxisY(){
        return axisY;
    }
    
    public void setAxisY(double axisY){
        this.axisY = axisY;
    }
    
    public String toString(){
        return "\nNome da figura: " +name+ "\nEixo X: " +axisX+ "\nEixo Y: " +axisY;
    }
    
}
