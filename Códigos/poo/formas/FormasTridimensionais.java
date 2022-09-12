package poo.formas;

public class FormasTridimensionais extends Formas {
    
    private double axisZ;
    private double area = 0, perimeter = 0, volume = 0;

    public FormasTridimensionais(String name, double axisX, double axisY, double axisZ){
        super(name, axisX, axisY);
        this.axisZ = axisZ;
    }

    public double getAxixZ(){
        return axisZ;
    }

    public void setAxisZ(double axisZ){
        this.axisZ = axisZ;
    }

    public double calcArea(String name){
        if(name.equals("Cubo")){
            area = 6*(Math.pow(getAxisX(), 2));
        } else if(name.equals("Esfera")){
            area = 4*Math.PI*Math.pow(getAxisX(), 2);
        } else if(name.equals("Tetraedro")){
            area = Math.pow(getAxisX(), 2)*Math.sqrt(3);
        }
        return area;
    }

    public double calcPerim(String name){
        if(name.equals("Cubo")){
            perimeter = 12*getAxisX();
        } else if(name.equals("Esfera")){
            perimeter = 2*Math.PI*getAxisX();
        } else if(name.equals("Tetraedro")){
            perimeter = 6*getAxisX();
        }
        return perimeter;
    }

    public double calcVolm(String name){
        if(name.equals("Cubo")){
            volume = Math.pow(getAxisX(), 3);
        } else if(name.equals("Esfera")){
            volume = (4*Math.PI*Math.pow(getAxisX(), 3)) / 3;
        } else if(name.equals("Tetraedro")){
            volume = (Math.pow(getAxisX(), 3)*Math.sqrt(2))/12;
        }
        return volume;
    }

    public String toString(){
        return "\nNome da figura: "+getName()+ "\nEixo X: " +getAxisX()+ "\nEixo Y: " +getAxisY() + "\nEixo Z: " +axisZ+ 
        "\nÁrea: " +area+ " m^2" + "\nPerímetro: " +perimeter+ " m" + "\nVolume: " +volume+ " m^3";
    }
}
    
