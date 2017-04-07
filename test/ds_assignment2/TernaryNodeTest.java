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
public class TernaryNodeTest {
    
    public TernaryNodeTest() {
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
     * Test of getNext method, of class TernaryNode.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        TernaryNode instance = new TernaryNode();
        TernaryNode expResult = null;
        TernaryNode result = instance.getNext();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNext method, of class TernaryNode.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        TernaryNode instance = new TernaryNode();
        instance.setNext(null);
       
    }

    /**
     * Test of getPrev method, of class TernaryNode.
     */
    @Test
    public void testGetPrev() {
        System.out.println("getPrev");
        TernaryNode instance = new TernaryNode();
        TernaryNode expResult = null;
        TernaryNode result = instance.getPrev();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPrev method, of class TernaryNode.
     */
    @Test
    public void testSetPrev() {
        System.out.println("setPrev");
        TernaryNode instance = new TernaryNode();
        instance.setPrev(null);
        
    }

    /**
     * Test of getChild method, of class TernaryNode.
     */
    @Test
    public void testGetChild() {
        System.out.println("getChild");
        TernaryNode instance = new TernaryNode();
        TernaryNode expResult = null;
        TernaryNode result = instance.getChild();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setChild method, of class TernaryNode.
     */
    @Test
    public void testSetChild() {
        System.out.println("setChild");
        TernaryNode instance = new TernaryNode();
        instance.setChild(null);
       
    }

    /**
     * Test of getElement method, of class TernaryNode.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");
        TernaryNode instance = new TernaryNode();
        Object expResult = null;
        Object result = instance.getElement();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setElement method, of class TernaryNode.
     */
    @Test
    public void testSetElement() {
        System.out.println("setElement");
        Friend element = null;
        TernaryNode<Friend> instance = new TernaryNode<>();
        instance.setElement(element);
        
    }

    /**
     * Test of toString method, of class TernaryNode.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TernaryNode instance = new TernaryNode();
        String expResult = "TernaryNode{" + "next=" + instance.getNext() + ", prev=" + instance.getPrev() + ", child=" + instance.getChild() + ", element=" + instance.getElement() + "}";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
