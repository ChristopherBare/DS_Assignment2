/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christopher1
 */
public class FriendshipQueueTest {
    
    public FriendshipQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of enqueue method, of class FriendshipQueue.
     */
    @Test
    public void testEnqueue() throws Exception {
        System.out.println("enqueue");
        Friend stev = new Friend("string", "string", 1);
        Friend steve = new Friend("string", "string", 1);
        TernaryNode<Friend> element = new TernaryNode<>(stev);
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        for(int i = 0; i < 4000; i++){
        instance.enqueue(element.getElement()); }
        instance.enqueue(steve);
        assertTrue(!instance.isEmpty());
        assertEquals(instance.getHead().getElement(), stev);
        assertEquals(instance.getTail().getElement(), stev);
        
    }

    /**
     * Test of dequeue method, of class FriendshipQueue.
     */
    @Test
    public void testDequeue() throws Exception {
        System.out.println("dequeue");
        Friend stev = new Friend("string", "string", 1);
        TernaryNode<Friend> element = new TernaryNode<>(stev);
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        instance.enqueue(stev);
        instance.dequeue();
        assertTrue(instance.isEmpty());
        
        
    }

    /**
     * Test of first method, of class FriendshipQueue.
     */
    @Test
    public void testFirst() throws Exception {
        System.out.println("first");
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        Friend stev = new Friend("string", "string", 1);
        TernaryNode<Friend> element = new TernaryNode<>(stev);
        instance.enqueue(element.getElement());
        Friend expResult = stev;
        assertTrue(!instance.isEmpty());
        assertEquals(instance.getHead().getElement(), stev);
        assertEquals(expResult, instance.getHead().getElement());
        
        
    }

    /**
     * Test of isEmpty method, of class FriendshipQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of size method, of class FriendshipQueue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of totalSize method, of class FriendshipQueue.
     */
    @Test
    public void testTotalSize() {
        System.out.println("totalSize");
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        int expResult = 0;
        int result = instance.totalSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHead method, of class FriendshipQueue.
     */
    @Test
    public void testGetHead() throws NonComparableElementException {
        System.out.println("getHead");
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        Friend stev = new Friend("string", "string", 1);
        TernaryNode<Friend> steve = new TernaryNode<>(stev);
        instance.enqueue(steve.getElement());
        TernaryNode<Friend> expResult = instance.getTail();
        TernaryNode<Friend> result = instance.getHead();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHead method, of class FriendshipQueue.
     */
    @Test
    public void testSetHead() {
        System.out.println("setHead");
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        instance.setHead(null);
        
    }

    /**
     * Test of getTail method, of class FriendshipQueue.
     */
    @Test
    public void testGetTail() throws NonComparableElementException{
        System.out.println("getTail");
        Friend stev = new Friend("string", "string", 1);
        TernaryNode<Friend> steve = new TernaryNode<>(stev);
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        instance.enqueue(steve.getElement());
        TernaryNode<Friend> expResult = instance.getHead();
        TernaryNode<Friend> result = instance.getTail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTail method, of class FriendshipQueue.
     */
    @Test
    public void testSetTail() {
        System.out.println("setTail");
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        instance.setTail(null);
        
    }

    /**
     * Test of getSize method, of class FriendshipQueue.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSize method, of class FriendshipQueue.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        FriendshipQueue<Friend> instance = new FriendshipQueue<>();
        instance.setSize(size);
        
    }
    
}
