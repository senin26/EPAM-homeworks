/*
import org.junit.Assert;
import org.junit.Test;

public class SolverTest {

    Solver solver = new Solver();
    float tolerance = 0.001f;

    @Test
    public void checkRoots1(){
        //given
        float[] expected = {3f, 2f};

        //run
        float[] roots = solver.getRoots(1f,-5f,6f);

        //assert
        Assert.assertTrue((Math.abs(expected[0]-roots[0])<tolerance && Math.abs(expected[1]-roots[1])<tolerance)
        || (Math.abs(expected[0]-roots[1])<tolerance && Math.abs(expected[1]-roots[0])<tolerance));
    }

    @Test
    public void checkRoots2(){
        //given
        float[] expected = {3.5f, 2f};

        //run
        float[] roots = solver.getRoots(1f,-5f,6f);

        //assert
        Assert.assertFalse((Math.abs(expected[0]-roots[0])<tolerance && Math.abs(expected[1]-roots[1])<tolerance)
                || (Math.abs(expected[0]-roots[1])<tolerance && Math.abs(expected[1]-roots[0])<tolerance));
    }

    @Test(expected = RuntimeException.class)
    public void checkRoots3(){
        //given
        float[] expected = {3f, 2f};

        //run
        float[] roots = solver.getRoots(100f,1f,3f);

    }

    @Test
    public void checkRoots4(){
        //given
        float[] expected = {3.197f, -2.238f};

        //run
        float[] roots = solver.getRoots(1f,-0.959f,-7.154886f);

        //assert
        Assert.assertTrue((Math.abs(expected[0]-roots[0])<tolerance && Math.abs(expected[1]-roots[1])<tolerance)
                || (Math.abs(expected[0]-roots[1])<tolerance && Math.abs(expected[1]-roots[0])<tolerance));
    }

    @Test
    public void checkRoots5(){
        //given
        float[] expected = {3.197f+tolerance*1.005f, -2.238f};

        //run
        float[] roots = solver.getRoots(1f,-0.959f,-7.154886f);

        //assert
        Assert.assertFalse((Math.abs(expected[0]-roots[0])<tolerance && Math.abs(expected[1]-roots[1])<tolerance)
                || (Math.abs(expected[0]-roots[1])<tolerance && Math.abs(expected[1]-roots[0])<tolerance));
    }

}
*/
