public class TriangleCheck {

    public boolean triangle(int a, int b, int c) {

        return (a + b) > c && (a + c) > b && (b + c) > a;
    }
}
