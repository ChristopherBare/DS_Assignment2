/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_assignment2;

/**
 *
 * @author cbare3
 * @version 1.0
 * @param <T> extends Comparable
 *
 */
class FriendshipQueue<T extends Comparable> implements FriendshipQueueADT<T> {

    /**
     * head is the head of the queue.
     */
    public TernaryNode<T> head;
    /**
     * tail is the tail of the queue.
     */
    public TernaryNode<T> tail;
    /**
     * size is the size of the main line of the queue.
     */
    private int size;
    /**
     * totalSize includes all of the friends.
     */
    private int totalSize;

    /**
     *
     * @param size size is the size of the queue.
     * 
     */
    FriendshipQueue(int size) {
        this.size = size;
        
    }

    /**
     * Friends.
     */
    FriendshipQueue() {
        this.size = 0;
        this.totalSize = 0;
    }

    
    @Override
    public void enqueue(T element) throws NonComparableElementException {
        /*
        search though the queue to see
        if the element has any friends (compareTo method
        will return 0 if it has friends.)
        foruitloop(loop through the whole queue){
        if(friends found) {
        if(!that friend has two other friends){
        add it to its friends node thing
        totalSize++
        }else{keep on searching}
        } else if(no friends found in the queue){
        enqueue as normal to the tail of the queue
        size++
        totalSize++}}}*/
        boolean foundFriend = false;
        if (!(element instanceof Comparable)) {
            throw new NonComparableElementException("Item is not comparable!");
        }
        TernaryNode<T> temp = new TernaryNode<>(element);
        if (isEmpty()) {
            // list is empty add to first node
            
            head = temp;
            tail = temp;
            size++;
            totalSize++;
            return;
        }

        // loop the list
        int count = 0;
        TernaryNode<T> current = head;
        while (count < size) { // && curElement.compareTo(element) != 0) {
            
            
            if (current.getElement().compareTo(element) == 0) {
                //found friend
                if (current.getChild() != null) {
                    System.out.println("add as second frind");
                    //friend already has one friend
                    if (current.getChild().getChild() == null) {
                        //friend only has one friend so add to friend group
                        current.getChild().setChild(temp);
                        totalSize++;
                        foundFriend = true;
                        break;
                    }
                }
                else { //friend doesn't have any children
                    current.setChild(temp);
                    System.out.println("add as first frined");
                    totalSize++;
                    foundFriend = true;
                    break;
                }
                
            }
            //current node isn't a friend so go next node
//            if (count == size) {
//                break;
//            }
            current = current.getNext();
            count++;
        }
        if (!foundFriend) {
            tail.setNext(temp);
            temp.setPrev(tail);
            tail = temp;
            size++;
            totalSize++;
            System.out.println("add as main");
        }



    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        /* dequeue{
        if(you gots some friends in line with ya){
        remove ya from the queue
        move your friends up towards the queue
        totalSize--;}
        if(no friends in line with ya){
        remove you from the queue
        move everything that is towards the tail end up one in the queue
        size--
        totalSize--;}}*/
        if (isEmpty()) {
            throw new EmptyCollectionException("queue no has things in it.");
        }
        T result = getHead().getElement();
        //no friend
        if (getHead().getChild() == null) {
            setHead(getHead().getNext());
            size--;
            totalSize--;
        
        }
        else { //friend 
            getHead().getChild().setNext(getHead().getNext());
            setHead(getHead().getChild());
            totalSize--;
            
            
        }
        
        if (isEmpty()) {
            tail = null;
        }
        return result;

    }

    @Override
    public T first() throws EmptyCollectionException {
        T element;
        if (size == 0) {
            throw new EmptyCollectionException("Empty Queue");
        }
        element = head.getElement();
        return element;

    }

    @Override
    public boolean isEmpty() {
        if (getSize() == 0) {
            return true;
        } 
        else {
            return false;
        }
    }

    @Override
    public int size() {
        return this.getSize();

    }

    @Override
    public int totalSize() {
        return this.getTotalSize();

    }

    /**
     *
     * @return head
     */
    public TernaryNode<T> getHead() {
        return head;
    }

    /**
     *
     * @param head sets head
     */
    public void setHead(TernaryNode<T> head) {
        this.head = head;
    }

    /**
     *
     * @return tail
     */
    public TernaryNode<T> getTail() {
        return tail;
    }

    /**
     *
     * @param tail returns tail
     */
    public void setTail(TernaryNode<T> tail) {
        this.tail = tail;
    }

    /**
     *
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @param size returns size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the totalSize
     */
    public int getTotalSize() {
        return totalSize;
    }

}
