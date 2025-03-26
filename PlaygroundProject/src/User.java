public class User
{
    //username cannot be changed after creation
    final String _username;

    //password is mutable after creation so getter and setter
    private String _password;
    int _score;

    //Assignment by ctor
    public User(String name, String pass)
    {
        this._username = name;
        this._password = pass;
    }

    //Setter can edit ONLY password. Username sets once.
    public void ChangePass(String newPass)
    {
        this._password = newPass;
    }

    //Getter needs SAME TYPE as Variable, NO PARAMETERS
    public String GetPass()
    {
        return _password;
    }

    public String GetName()
    {
        return _username;
    }

    public void UpdateScore(int score)
    {
        _score += score;
        InputHandler.Print("Correct ! Score is " + DemoRunner.currentUser._score);
    }

    public int GetCurrentScore()
    {
        return _score;
    }

    public void GetCurrentScore(boolean print)
    {
        InputHandler.Print(DemoRunner.currentUser._username + " has score : " + DemoRunner.currentUser._score);
    }
}
