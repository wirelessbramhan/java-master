import java.util.*;

public class DemoRunner
{
    public static User currentUser;
    //1. Default entry, Add one question and MAKE THE CONTAINERS to avoid null

    //Question list
    public static ArrayList<Question> Questions = new ArrayList<>();

    //Question Bank with All Questions
    static Dictionary<Question, String> allQuestions = new Hashtable<>();

    static void PrintScore()
    {
        if (currentUser != null && !currentUser._username.isEmpty())
        {
            System.out.println("User: " + currentUser._username + " has scored : " + currentUser._score);
        }
    }

    static void AddQuestions(String content, String[] answer, int correct)
    {
        if (!allQuestions.isEmpty())
        {
            Question newQuestion = new Question(content, answer, correct);

            allQuestions.put(newQuestion, content);

            System.out.println(Questions.size() + "Questions in the list");
        }
    }

    public static void main(String[] args)
    {
        //1. Assign one question so bank is not empty
        String question = "What is the world's best food?";
        String[] answers = {"hunger.", "biryani.", "pizza.", "fries."};

        Question defaultQuestion = new Question(question, answers, 0);

        //2. Add Questions before App starts
        //AddQuestions("What colour is the sky?", "blue");

        //3. User Container already Exists, encapsulate later using read-only modifier or method
        currentUser = InputHandler.ReadUser();
        PrintScore();

        try
        {
            //Print default
            PrintQuestion(defaultQuestion);
            Thread.sleep(1000);

            //Read Answer and record them in a Dict
            int answerInput = Integer.parseInt(System.console().readLine("Enter your answer : "));
        }

        catch (InterruptedException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("answer not recorded");
            //allQuestions.put(defaultQuestion, String.valueOf(answerInput));
        }
    }

    static void PrintQuestion(Question current)
    {
        if (!current.prompt.isEmpty())
        {
            System.out.println(current.prompt);
            System.out.println("Options are :- ");
            for (int i = 0; i < current.options.length; i++)
            {
                System.out.println(i + ". " + current.options[i]);
            }
        }
    }
}
