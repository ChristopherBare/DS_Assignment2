/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_assignment2;

/**
 *
 * @author cbare3
 * @param <T> 
 * @version 1.0
 */
public class TernaryNode<T extends Comparable> {
    /**
     * next is the next element.
     */
    private TernaryNode<T> next;
    /**
     * prev is the prev element.
     */
    private TernaryNode<T> prev;
    /**
     * child is the child element.
     */
    private TernaryNode<T> child;
    /**
     * element is element.
     */
    private T element;
    /**
     * 
     * @param next is next element
     * @param prev is prev element
     * @param child is child element
     * @param element is element
     */
    TernaryNode(TernaryNode<T> next, TernaryNode<T> prev, 
            TernaryNode<T> child, T element) {
        this.next = next;
        this.prev = prev;
        this.child = child;
        this.element = element;
    }

    /**
     * Constructor.
     */
    TernaryNode() {
    }

    /**
     *
     * @param element is element
     */
    TernaryNode(T element) {
        this.element = element;
        this.next = null;
        this.prev = null;
        this.child = null;
    }

    /**
     *
     * @return next
     */
    public TernaryNode<T> getNext() {
        return next;
    }

    /**
     *
     * @param next sets next 
     */
    public void setNext(TernaryNode<T> next) {
        this.next = next;
    }

    /**
     *
     * @return prev
     */
    public TernaryNode<T> getPrev() {
        return prev;
    }

    /**
     *
     * @param prev sets prev
     */
    public void setPrev(TernaryNode<T> prev) {
        this.prev = prev;
    }

    /**
     *
     * @return child
     */
    public TernaryNode<T> getChild() {
        return child;
    }

    /**
     *
     * @param child sets child
     */
    public void setChild(TernaryNode<T> child) {
        this.child = child;
    }

    /**
     *
     * @return element
     */
    public T getElement() {
        return element;
    }

    /**
     *
     * @param element sets element.
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     *
     * @return string of the selected TernaryNode.
     */
    @Override
    public String toString() {
        return "TernaryNode{" + "next=" + getNext() 
                + ", prev=" + getPrev() + ", child=" 
                + getChild() + ", element=" + getElement() + '}';
    }

}
