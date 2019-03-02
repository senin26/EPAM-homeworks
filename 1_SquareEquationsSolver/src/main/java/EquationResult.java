public class EquationResult {

    private double root1;
    private double root2;

    public EquationResult(double root1, double root2) {
        this.root1 = root1;
        this.root2 = root2;
    }

   /* public void setRoot1(double root1) {
        this.root1 = root1;
    }

    public void setRoot2(double root2) {
        this.root2 = root2;
    }*/

    public double getRoot1() {
        return root1;
    }

    public double getRoot2() {
        return root2;
    }

    public void print(){
        System.out.println("Roots are " + getRoot1() + " and " + getRoot2());
    }


}
