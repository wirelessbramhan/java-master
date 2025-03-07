public abstract class Animal
{
    String[] input = new String[2];
    public void DoSomething()
    {

        ZooRunner.main(input);


        Cage newCage = new Cage();
        newCage.LockCage(true);
    }
}
