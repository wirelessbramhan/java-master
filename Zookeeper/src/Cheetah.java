public class Cheetah extends Animal implements INoiseHandler, IAttackHandler
{
    public void Attack(String animalName)
    {
        animalName = animalName + " starts running at " + 30 + " km/h";
        System.out.println(animalName);
    }
}
