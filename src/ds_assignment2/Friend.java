/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_assignment2;

/**
 * Friend class for use in Data Structures Assignment 2
 * @author clatulip
 */
public class Friend implements Comparable {
    private String name;
    private String dormName;
    private int id;

    /**
     *
     * @param name
     * @param dormName
     * @param id
     */
    public Friend(String name, String dormName, int id) {
        this.name = name;
        this.dormName = dormName;
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getDormName() {
        return dormName;
    }

    /**
     *
     * @param dormName
     */
    public void setDormName(String dormName) {
        this.dormName = dormName;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    
    
    @Override
    public int compareTo(Object o) {
        // string comparison based on dormName field
        Friend f = (Friend)o;
        return f.getDormName().compareTo(this.getDormName());
        
    }

    @Override
    public String toString() {
        return "Friend{" + "name=" + name + ", dormName=" + dormName +  ", id=" + id + '}';
    }
    
    
    
    
}
