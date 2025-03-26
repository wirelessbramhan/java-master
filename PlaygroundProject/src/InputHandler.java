import java.io.*;
import java.util.*;

public class InputHandler
{
    public static User ReadUser()
    {
        //1. Make containers to write data into

        //Make Reader
        Scanner sc = new Scanner(System.in);

        //Make variables to hold data
        Print("Welcome! Please Provide Username....");
        String un  = sc.next();

        Print("Hi there, " + un + "! Please Provide a Password....");
        String pw = sc.next();

        //Make User
        User newUser = new User(un, pw);

        sc.close();
        return newUser;
    }

    public static void Print(String msg)
    {
        if (!msg.isEmpty())
        {
            System.out.println(msg);
        }
    }

    public static void SaveData()
    {
        // Writing Text File also Exception Handling
        try {

            FileWriter Writer = new FileWriter("PD_saveFile.txt");

            // Writing File
            Writer.write("Files in Java are seriously good!!");
            Writer.close();

            System.out.println("Successfully written.");
        }

        // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
        }

        finally {
            System.out.println("Program end.");
        }
    }

    public static void LoadData()
    {
        // Reading File also Handling Exception
        try {
            File Obj = new File("PD_saveFile.txt");
            Scanner Reader = new Scanner(Obj);

            // Traversing File Data
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }

            Reader.close();
        }

        // Exception Cases
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
        }
    }
}
