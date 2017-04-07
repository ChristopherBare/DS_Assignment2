/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_assignment2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Club lineup simulation for ITIS 2214 Assignment 2
 * Version 1 
 * @date Feb 20, 2017
 * @author clatulip
 */
public class ClubLineup {
    private FriendshipQueue<Friend> lineup;
    private String[] dorms;
    private String[] names;
    private int id;
    private int clubEntries;
    private final int MAX_SIM_STEPS = 40;
    private final int MAX_NAMES = 20;
    private final int MAX_DORMS = 5;

    /**
     *
     */
    public ClubLineup() {
        setupNames();
    }

    /**
     *
     */
    public void runSimulation() {
        lineup = new FriendshipQueue<Friend>();
        id = 0;
        clubEntries = 0;
        for (int i = 0; i < MAX_SIM_STEPS; i++ ) {
            // at each step, either add someone to the queue
            // or dequeue someone
            double ran = Math.random();
            if (ran < 0.7) {
                // create new friend and enqueue
                Friend f = createNewFriend();
                try {
                    lineup.enqueue(f);
                } catch (NonComparableElementException ex) {
                    Logger.getLogger(ClubLineup.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("     Adding " + f.getName() + " from " + f.getDormName() + "(ID# " + Integer.toString(f.getId()) +  ") to club lineup.");
            } else {
                // dequeue, if queue isn't empty
                if (!lineup.isEmpty()) {
                    try {
                        Friend f = (Friend)lineup.dequeue();
                        clubEntries++;
                        System.out.println("****  " + f.getName() + "(ID# " + Integer.toString(f.getId()) +  ") just got into the club!");
                    } catch (EmptyCollectionException ex) {
                        Logger.getLogger(ClubLineup.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    System.out.println("... The club lineup is empty.");
                }
            }
        }
        System.out.println(clubEntries + " people got into the club. ");
        System.out.println("There are still " + lineup.totalSize() + " people in line.");
        
    }

    private void setupNames() {
        names = new String[MAX_NAMES];
        names[0] = "Abdul";
        names[1] = "Jen";
        names[2] = "Chris";
        names[3] = "Myron";
        names[4] = "Rutuja";
        names[5] = "Harrison";
        names[6] = "Carlos";
        names[7] = "Elizabeth";
        names[8] = "Jean-Paul";
        names[9] = "Richard";
        names[10] = "Sofia";
        names[11] = "Kyle";
        names[12] = "Tyler";
        names[13] = "Mohammed";
        names[14] = "Avery";
        names[15] = "Miriam";
        names[16] = "Mariah";
        names[17] = "Tristan";
        names[18] = "Jacob";
        names[19] = "Brandon";
        
        // setup dorms
        dorms = new String[MAX_DORMS];
        dorms[0] = "Levine Hall";
        dorms[1] = "Belk Hall";
        dorms[2] = "Laurel Hall";
        dorms[3] = "Pine Hall";
        dorms[4] = "Oak Hall";
        
               
    }

    private Friend createNewFriend() {
        int dNum = (int)(Math.random()*(MAX_DORMS-1));
        int nNum = (int)(Math.random()*(MAX_NAMES-1)); 
        Friend f = new Friend(names[nNum], dorms[dNum], id);
        id++;
        return f;
    }
    
    
    
}
