interface SimpleList {
    boolean isEmpty();
    void addFirst(int data);
    void addLast(int data);
    int removeFirst();
    int removeLast();
    boolean contains(int data);
    boolean remove(int data);
    int  size(); 
    SimpleListIterator iterator();
}