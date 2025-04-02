public class Card
{
    final int number, type;

    public Card(int number, int typeCount)
    {
        this.number = number;
        this.type  = typeCount;
    }

    public void PrintData()
    {
        String typeText = null;

        switch (type)
        {
            case 0:
                typeText = "Diamonds";
                break;
            case 1:
                typeText = "Hearts";
                break;
            case 2:
                typeText = "Spades";
                break;
            case 3:
                typeText = "Clubs";
        }

        System.out.println(number + " of " + typeText);
    }
}
