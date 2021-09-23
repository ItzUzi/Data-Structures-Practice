public interface BagInterface<T>{

    /**
     * Gets current number of entries in bag
     * @return int number of entries currently in bag
     */
    public int getCurrentSize();

    /**
     * Sees whether bag is empty
     * @return true if bag is empty or false if not
     */
    public boolean isEmpty();
    
    /**
     * Adds new entry to this bag
     * @param newEntry The object to be added into the bag
     * @return True if addition was successful
     */
    public boolean add(T newEntry);

    /**
     * Removes one unspecified entry from bag if possible
     * @return Either removed entry or null if removal was unsuccessful
     */
    public T remove();

    /**
     * Removes a specified entry within the bag
     * @param anEntry Entry to be removed from the bag
     * @return true if entry removal was success, or false if removal was unsuccessful
     */
    public boolean remove(T anEntry);

    /**
     * Removes all entries from this bag
     */
    public void clear();

    /**
     * counts number of items a given entry appears in this bag
     * @param anEntry
     * @return
     */
    public int getFrequencyOf(T anEntry);

    /**
     * Tests whether bag contains given entry
     * @param anEntry The entry to find
     * @return True if the bag contains anEntry, false if not
     */
    public boolean contains(T anEntry);

    /**
     * Retrieves all items in this bag
     * @return A newly allocated array of all the entries in the bag.
     * Note: if bag is empty the returned array is empty
     */
    public T[] toArray();

    /**
     * Combines 2 bags into one bag
     * @param bag the bag that will be checked and 
     * combine with the first one
     * @return bag with combined assets from both bags
     */
    public T[] union(BagInterface<T> bag);

    /**
     * Checks similarites between entries in bags and composes
     * new bag that only has those similar entries
     * @param bag the bag the initial bag will compare itself with
     * @return Collection of entries that both bags have in commone
     */
    public T[] intersection(BagInterface<T> bag);

    /**
     * Adds differences from bag onto new bag
     * @param bag is compared to original bag
     * @return Collection of entries that one bag has different than the other. 
     */
    public T[] difference(BagInterface<T> bag);
}