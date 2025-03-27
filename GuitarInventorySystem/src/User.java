import java.io.File;

public class User
{
    int score;
    public User()
    {
        score = 0;
    }

    static void WriteFile()
    {
        try
        {
            Thread.sleep(10000);
            File file = new File("C:\\Java_Files\\test.txt");
            if (file.createNewFile())
            {

            } else {
                System.out.println("File already exists");
            }
        }

        catch (Exception e) {

            //throw new RuntimeException(e);
            //System.out.println(e.);
        }
    }

    public static void main(String[] args)
    {

        try {


        }

        catch (Exception e)
        {
            System.out.println(e.getMessage() + " Exception has occured.");
        }

        System.out.println("File creation success!");

//    finally {
//
//        System.out.println("File creation success!");
//
//    }
    }
}
