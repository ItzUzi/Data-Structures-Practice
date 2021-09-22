public class LinkedBag<T> implements BagInterface<T> {

    private Node<T> firstNode;
    private int numberOfEntries;


    public LinkedBag(){
        firstNode = null;
        numberOfEntries = 0;
    }

    public int getCurrentSize() {
        return numberOfEntries;
    }

    public boolean isEmpty() {

        return numberOfEntries == 0;
    }

    public boolean add(T newEntry) {

        Node<T> newNode = new Node<T>(newEntry);
        newNode.setNextNode(firstNode);
        firstNode = newNode;
        numberOfEntries ++;
        return true;
    }

    public T remove() {
        T result = null;
        if (firstNode != null) {
            result = firstNode.getData();
            firstNode = firstNode.getNextNode();
            numberOfEntries--;
        }
        return result;
    }

    public boolean remove(T anEntry) {
        boolean result = false;
        Node<T> nodeN = getReferenceTo(anEntry);

        if (nodeN != null){
            nodeN.setData(firstNode.getData());

            firstNode = firstNode.getNextNode();

            numberOfEntries--;
            result = true;
        }
        
        return result;
    }

    private Node<T> getReferenceTo(T anEntry){
        boolean found = false;
        Node<T> currentNode = firstNode;

        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.getData())) {
                found = true;
            }else
                currentNode = currentNode.getNextNode();
        }

        return currentNode;
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
