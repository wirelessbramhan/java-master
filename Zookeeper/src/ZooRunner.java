import java.util.*;

public class ZooRunner
{
    final static String myString = null;

    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {

        }
        //Collections & Interface
        String animalName = "";
        Dictionary<Animal, IAttackHandler> animals = new Dictionary<Animal, IAttackHandler>()
        {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Enumeration<Animal> keys() {
                return null;
            }

            @Override
            public Enumeration<IAttackHandler> elements() {
                return null;
            }

            @Override
            public IAttackHandler get(Object key) {
                return null;
            }

            @Override
            public IAttackHandler put(Animal key, IAttackHandler value) {
                return null;
            }

            @Override
            public IAttackHandler remove(Object key) {
                return null;
            }
        };

        Dog newDog = new Dog();
        animals.remove(newDog);
        int[] numbers = new int[10];

        PrintMsg(myString);

    }

    static void PrintMsg(String msg)
    {
        try
        {
            System.out.println(msg);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

        finally {
            System.out.println("final value : " + myString);
        }
    }


}
