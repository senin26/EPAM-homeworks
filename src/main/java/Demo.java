public class Demo {

    public static void main(String[] args) {

        Solver solver = new Solver();
        solver.getRoots(1f,-5f,6f);
        System.out.printf("Roots are %f and %f",  solver.getR()[0], solver.getR()[1]);
    }
}
