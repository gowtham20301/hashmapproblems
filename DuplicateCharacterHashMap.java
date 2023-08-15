package com.Collections.sample.java;
import java.util.HashMap;
import java.util.*;
public class DuplicateCharacterHashMap {
    public static void main(String[] args) {
        String s="vishal Subburam";
        char[] ch= s.toCharArray();
        HashMap<Character,Integer> hm= new HashMap<>();
        for(char c:ch)
        {
            if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)+1);
            }
            else
            {
                hm.put(c,1);
            }
        }
        System.out.println(hm);
        Set<Map.Entry<Character,Integer>> se=hm.entrySet();
        System.out.println("duplicates are");
        for(Map.Entry<Character,Integer> entry: se)
        {
            if(entry.getValue()>1)
                System.out.println(entry.getKey());
        }
    }
}


