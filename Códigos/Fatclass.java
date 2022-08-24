public class Fatclass {
    private int num = 0;
    private int fat = 1;
    private String formula = "";

    public void setValor(int n){
        num = n;
        int f = 1;
        String s = "";
        for (int c = n; c > 1; c--){
            f *= c;
            s += c + " x ";
        }
        s += "1 = " + f;
        fat = f;
        formula = s;
    }

    public String getFormula(){
        return formula;
    }

    public int getFatorial(){
        return fat;
    }
}
