public class InputData {

    private double coef1;
    private double coef2;
    private double coef3;

    public InputData(double coef1, double coef2, double coef3) {
        this.coef1 = coef1;
        this.coef2 = coef2;
        this.coef3 = coef3;
    }

    public double getCoef1() {
        return coef1;
    }

    public double getCoef2() {
        return coef2;
    }

    public double getCoef3() {
        return coef3;
    }

    public boolean isValid() {
        if (coef1!=0) return true;
        else return false;
    }
}
