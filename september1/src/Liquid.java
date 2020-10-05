public class Liquid
{
    private double boilingPoint;
    private double freezingPoint;
    private double currentTemp;

    public Liquid(double b, double f)
    {
        boilingPoint = b;
        freezingPoint = f;
    }

    void lowerTemp()
    {
        currentTemp -= 10;
    }

    void raiseTemp()
    {
        currentTemp += 10;
    }

    void freeze(int a)
    {
        System.out.println(currentTemp);
        currentTemp = freezingPoint;
        System.out.println(a + 1);
        System.out.println(currentTemp);

    }
    public int oneThing(int i, int j)
    {
        return i * j;
    }

    public int anotherThing(int i, int j)
    {
        return i / j;
    }
}