import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleCheckTest {

    @Parameterized.Parameter(0)
    public int a;
    @Parameterized.Parameter(1)
    public int b;
    @Parameterized.Parameter(2)
    public int c;
    @Parameterized.Parameter(3)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[]{3, 4, 5, true},
                new Object[]{15, 20, 18, true},
                new Object[]{1, 1, 3, false}
        );
    }

    @Test
    public void checkSidesCouldBeATriangle() {
        TriangleCheck triangle = new TriangleCheck();
        boolean actual = triangle.triangle(a, b, c);
        assertEquals(expected, actual);
    }
}
