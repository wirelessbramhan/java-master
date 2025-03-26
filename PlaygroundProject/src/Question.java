public class Question
{
    String prompt;
    String[] options;
    int correctIndex;

    public Question(String content, String[] options, int correct)
    {
        this.prompt = content;
        this.options = options;
        this.correctIndex = correct;
    }

    public void CheckAnswer(int input)
    {
        //Input validation, Null and empty string values will jam up mmy control flow
        if (input == correctIndex)
        {
            DemoRunner.currentUser.UpdateScore(1);
        }

        else
        {
            InputHandler.Print("incorrect answer!!");
        }
    }
}
