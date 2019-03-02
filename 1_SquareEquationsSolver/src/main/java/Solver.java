public class Solver {
/**
 * Consider that this class serves for solving the equations in the
 * form a*x^2 + b*x + c = 0
 * */



    public static void main(String[] args) {
        EquationSolver equationSolver = new EquationSolver();
        EquationResult result = equationSolver.solve(new InputData(1, -5, 6));
        if (result!= null) {
            result.print();
        }
    }
}
