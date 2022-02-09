package com.company;

import java.util.HashSet;

public class Set {

    public static java.util.Set<Integer> union(java.util.Set<Integer> set1, java.util.Set<Integer> set2){
        java.util.Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        return set3;
    }

    public static java.util.Set<Integer> intersect(java.util.Set<Integer> set1, java.util.Set<Integer> set2){
        java.util.Set<Integer> set3 = new HashSet<>(set1);
        set3.retainAll(set2);
        return set3;
        }
    }

