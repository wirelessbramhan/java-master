public class Guitar
{
    String name;
    int price;

    String GetName()
    {
        return name;
    }

    void SetName(String name)
    {
        this.name = name;
    }

    void Divide()
    {
        //int x = 10 / 0;
        throw new ArithmeticException();
    }

    void Divide(int number) throws ArithmeticException
    {
        int x = number / 0;
    }
}
