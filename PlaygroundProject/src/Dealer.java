import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dealer
{
    public static boolean isPlaying;
    public static ArrayList<Card> allCards = new ArrayList<>();
    public static void main(String[] args)
    {
        int typeCount = 0;
        int cardNumber = 0;
        //making the deck / stack of cards
        for (int i = 0; i < 52; i++)
        {
            if ((i + 1) % 13 == 0)
            {
                typeCount++;
                cardNumber = 0;
            }

            cardNumber++;
            Card newCard = new Card(cardNumber, typeCount);
            allCards.addFirst(newCard);
        }

        //Shuffle the deck
        Collections.shuffle(allCards);

        //Take user input for turns
        Scanner scn = new Scanner(System.in);
        int numberOfTurns = 0;

        //numberOfTurns = Integer.parseInt(System.console().readLine("Provide number of turns : "));
        System.out.println("Provide number of turns : ");
        numberOfTurns = scn.nextInt();

//        try
//        {
////
//
//        }
//
//        finally
//        {
//            //Deal the top card from the deck
//            for (int i = 0; i < numberOfTurns; i++)
//            {
//                DealCards(true, allCards);
//            }
//        }

        //Deal the top card from the deck
        for (int i = 0; i < numberOfTurns; i++)
        {
            DealCards(true, allCards);
        }
    }

    static void PrintDeckSize()
    {
        System.out.println(allCards.size() + " Cards in stack.");
    }

    static Card DealCards(boolean shouldDeal, ArrayList<Card> deck)
    {
        Card top = null;

        if(shouldDeal)
        {
            top = allCards.removeFirst();
            top .PrintData();
            PrintDeckSize();
        }

        return top;
    }

    static long RandomNumber()
    {
        double random = Math.random();
        long randomInt = Math.clamp(Math.round(random * 52), 0, 52);

        return randomInt;
    }

    static int RandomNumber(int upper, int lower)
    {
        double random = Math.random();
        long randomInt = Math.clamp(Math.round(random * upper), lower, upper);

        return (int)randomInt;
    }
}
