public class Quiz {
    private int a;
    public double b;
    public Quiz(int first, double second){
        this.a = first;
        this.b = second;
    }
    public static void incrementBoth(Quiz c1) {
        c1.a = c1.a + 1;
        c1.b = c1.b + 1.0;
    }
    public static void main(String[] args)
    {
        Quiz c1 = new Quiz(10, 20.5);
        Quiz c2 = new Quiz(10, 31.5);
        // different code below
        incrementBoth(c2);
        System.out.println(c1.a + ", "+ c2.a);
    }
}
