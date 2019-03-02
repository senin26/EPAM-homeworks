public class EquationSolver {

    private double a;
    private double b;
    private double c;
    private static double D;

    private double root1;
    private double root2;

    public EquationResult solve(InputData inputData) {
        setCoeffs(inputData);
        Discriminant.calculateDiscriminant(a,b,c);
        EquationResult result = null;
        if (inputData.isValid()){
            if (Discriminant.isValid()){
                calcRoot1();
                calcRoot2();
                result = new EquationResult(getRoot1(), getRoot2());
            } else System.out.println("Can't solve because D < 0");
        } else System.out.println("Can't solve because the equation isn't quadratic");
        return result;
    }

    private void setCoeffs(InputData inputData){
        this.a = inputData.getCoef1();
        this.b = inputData.getCoef2();
        this.c = inputData.getCoef3();
    }

    private void calcRoot1() {
        root1 = (-b + Math.sqrt(D)/a)/2;
    }

    private void calcRoot2() {
        root2 = (-b - Math.sqrt(D)/a)/2;
    }

    public double getRoot1() {
        return root1;
    }

    public double getRoot2() {
        return root2;
    }

    public static class Discriminant {

        public static double calculateDiscriminant(double a, double b, double c) {
            D = b*b - 4*a*c;
            return D;
        }

        public static boolean isValid() {
            if (D >=0) return true;
            else return false;
        }
    }

}
