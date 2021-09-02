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
    public boolean getFrequencyOf(T anEntry);

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
}