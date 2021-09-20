public class LinkedBag<T> implements BagInterface<T> {

    private Node firstNode;
    private int numberOfEntries;


    public LinkedBag(){
        firstNode = null;
        numberOfEntries = 0;
    }

    public int getCurrentSize() {
        return 0;
    }

    public boolean isEmpty() {

        return numberOfEntries == 0;
    }

    public boolean add(T newEntry) {

        Node newNode = new Node(newEntry);
        newNode.setNextNode(firstNode);
        firstNode = newNode;
        numberOfEntries ++;
        return true;
    }

    @Override
    public T remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
