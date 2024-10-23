public class Quiz2
{
    private int a;
    public double b;

    public Quiz2(int first, double second)
    {
        this.a = first;
        this.b = second;
    }

    public static void incrementBoth(Quiz2 c1) {
        c1.a = c1.a + 1;
        c1.b = c1.b + 1.0;
    }

    // new method
    public static void incrementA(int first)
    {
        first = first + 1;
    }

    // new method
    public static void incrementB(double second)
    {
        second = second + 1.0;
    }

    public static void main(String[] args)
    {
        Quiz2 c1 = new Quiz2(10, 20.5);
        Quiz2 c2 = new Quiz2(10, 31.5);
        incrementBoth(c2);
        // different code below
        incrementA(c2.a);
        incrementB(c2.b);
        System.out.println(c2.a + ", "+ c2.b);
    }
}