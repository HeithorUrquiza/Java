package poo;

public class VclMain {
    public static void main(String[] args) {
        Veiculo carro;
        carro = new Veiculo("Carro", "Civic", "Honda", "CBL9087", "Flex", 25.7, 
            44.0, "Preto", 180.0, "Terra e asfalto");


        
        System.out.println(carro.toString());
    }
}
