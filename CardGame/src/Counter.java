public class Counter
{
    public int Index = 0;

    public void CountCards(int counter)
    {
        //Instantiation = MAKING AN INSTANCE OF A CLASS, WHICH MEANS AN OBJECT. CREATION PROCESS.
        Card newCard = new Card();

        switch (counter)
        {
            case 1 :
                int number = 0;
                newCard = new HeartCard(0);
                break;
            case 2 :
                newCard = new SpadeCard(0);
            case 3 :
                newCard = new DiamondCard(0);
            case 4 :
                number = 1;//Valid scope
                newCard = new ClubCard(0);
        }

        //Out of scope
        num
    }

    public void CountCards()
    {
        int dayNumber = 0;
        String dayName = "";

        //KISS = Keep It Simple, Stupid!
        //DRY = Donot Repeat Yourself

        switch (dayNumber)
        {
            case 0:
                dayName = "Monday";
                break;
            case 1:
                dayName = "Tuesday";
                break;
            case 2:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Sunday";

        }

        System.out.println(dayName);
    }
}
