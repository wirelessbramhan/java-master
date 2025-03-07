public class Card
{
    protected boolean IsFacingUp;
    protected int CardNumber;
    protected String Type;

    //Animal[] allAnimals = new Animal[];
    //Extend Animal into classes
    //Abstract the Animal class;
    //Use Interface to make noise;

    //Encapsulate boolean
    public boolean GetFacing()
    {
        return IsFacingUp;
    }

    public void SetFacing(boolean up)
    {
        IsFacingUp = up;
    }

    public void PrintNumber()
    {
        System.out.println(CardNumber + " of " + Type);
    }

    public String GetCardData()
    {
        return CardNumber + " of " + Type;
    }

    public Card (int cardNumber)
    {
        this.CardNumber = cardNumber;
        IsFacingUp = false;
    }

    public Card (int cardNumber, String type)
    {
        this.CardNumber = cardNumber;
        IsFacingUp = false;

        Type = type;
    }

    public Card()
    {
        IsFacingUp = false;
    }
}
