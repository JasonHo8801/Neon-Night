/*
author : Jason
date   : 8/8/2021
 */
package client;

import adt.GroupSet;
import adt.SetInterface;


public class GroupSetDriver {
    
    public static void main(String[] args) {
        SetInterface<Integer> groupSet = new GroupSet<>(2);
        
        System.out.println(groupSet.add(10));
        System.out.println(groupSet.add(5));
        System.out.println(groupSet.add(12));
        System.out.println(groupSet.add(5));
    }
    
}
