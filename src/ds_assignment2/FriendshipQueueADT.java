package ds_assignment2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * An interface for a friendship queue
 * For use in ITCS 2214 Data Structures & Algorithms
 * UNC Charlotte, 2016
 * @author clatulip
 * @param <T>
 */
public interface FriendshipQueueADT<T extends Comparable>  {
    
    /**
     * Adds the specified element to the end of the queue, but...
     * If the element has friends in the queue that it can queue with
     * Note that friend groups can't be larger than 3, if an element can't 
     * join friends b/c the groups all have 3, this element has to join the 
     * end of the queue
     * @param element element to be added to the queue
     * @throws ds_assignment2.NonComparableElementException
     */
    public void enqueue(T element) throws NonComparableElementException;
    
    /**
     * Removes and returns the element that is at the front of the queue
     * If there is a friend group at the front, the first friend is dequeued
     * and then friends move up in the queue
     * @return the element removed from the queue
     * @throws EmptyCollectionException 
     */
    public T dequeue() throws EmptyCollectionException;
    
    /**
     * Returns (without removing) the element that is at the front of the queue
     * @return the element at the front of the queue
     * @throws EmptyCollectionException 
     */
    public T first()throws EmptyCollectionException;
    
    /**
     * Returns true if the collection contains no elements
     * @return true if the collection is empty
     */
    public boolean isEmpty();
    
    /**
     * Returns the length of the queue, ignoring friends
     * @return the number of elements as an int
     */
    public int size();
    
    /**
     * Returns the length of the queue, including friends
     * @return the number of elements as an int
     */
    public int totalSize();
    
    /**
     * Returns a string representation of the collection
     * @return a string representation of the collection
     */
    @Override
    public String toString();
    
}
