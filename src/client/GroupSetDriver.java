/*
author : Jason
date   : 8/8/2021
 */
package client;

import adt.*;


public class GroupSetDriver {
    
    public static void main(String[] args) {
        SetInterface<Integer> groupSet = new GroupSet<>(2);
        
        System.out.println(groupSet.add(10));
        System.out.println(groupSet.add(5));
        System.out.println(groupSet.add(12));
        System.out.println(groupSet.add(5));
        
        ListInterface<String> namelist = new ArrayList<>();
              
        System.out.println(namelist.retrieve(2));
        namelist.addEntry("John");
        namelist.addEntry("Mike");
        namelist.addEntry("Gon");
        namelist.addEntry("Ben");    
        namelist.addEntry("Norn");
        namelist.addEntry(6, "Tom");
        
        namelist.printList();
        namelist.removeEntry(1);
        namelist.printList();
        namelist.switchEntry(5, 1);
        namelist.printList();
    }
    
}
