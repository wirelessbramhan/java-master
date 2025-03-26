import java.util.*;

public class Canteen
{
    Stack<Idli> idlis = new Stack<>();

    //Features of a stack
    //1. FIFO
    List<Idli> idliList = new List<Idli>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Idli> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Idli idli) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Idli> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Idli> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Idli get(int index) {
            return null;
        }

        @Override
        public Idli set(int index, Idli element) {
            return null;
        }

        @Override
        public void add(int index, Idli element) {

        }

        @Override
        public Idli remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Idli> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Idli> listIterator(int index) {
            return null;
        }

        @Override
        public List<Idli> subList(int fromIndex, int toIndex) {
            return List.of();
        }
    };

    public void Insert(Idli newIdli)
    {
        idliList.addFirst(newIdli);
    }

    public Idli Remove()
    {
        Idli top = null;

        if (!idliList.isEmpty())
        {
            top = idliList.removeFirst();
        }

        return top;
    }

    public Idli Read()
    {
        return idliList.getFirst();
    }
}
