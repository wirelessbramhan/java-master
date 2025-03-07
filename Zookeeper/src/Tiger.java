public class Tiger extends Cat implements  Violent
{
    public void Attack(String animalName)
    {
        animalName = animalName + " attacks for " + 10 + " DMG";
        System.out.println(animalName);
    }
}
