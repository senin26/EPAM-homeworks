public class Solver {
/**
 * Consider that this class serves for solving the equations in the
 * form a*x^2 + b*x + c = 0
 * */
    private float[] r = new float[2];

    public float[] getRoots(float a, float b, float c) {
        float D = b*b - 4*a*c;
        if (D>=0) {
            r[0] = (-b + (float) Math.sqrt(D)/a)/2;
            r[1] = (-b - (float) Math.sqrt(D)/a)/2;
        }
        else throw new RuntimeException();
        return r;
    }

    public float[] getR() {
        return r;
    }
}
