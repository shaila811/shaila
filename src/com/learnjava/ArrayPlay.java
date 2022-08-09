package com.learnjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

import com.beust.jcommander.Strings;

public class ArrayPlay {
public static void main(String[] args) {
	
   int[] a = new int [7];
   a[0]=10;
   System.out.println(5);
   
   ArrayList<String> a1 = new ArrayList<String>();  //Dynamic /instraction order follow kore/slow
                                                    //
   a1.add("Apple");
   a1.add("Grapes");
   a1.add("Orange");
   a1.add("Apple");
   a1.add("Banana");
   
   System.out.println(a1);
   System.out.println(a1.size());
   System.out.println(a1.get(2));
   
   LinkedList<String> ll = new LinkedList<String>();   //faster /better for manipulating korat jonno valo
   ll.add("Banana");
   ll.add("Apple");
   ll.add("Grapes");
   ll.add("Orange");
   ll.add("Apple");
   
   System.out.println(ll);
   System.out.println( "******");
   HashSet<String> hs = new HashSet<String>();
   hs.add("Banana");
   hs.add("Apple");
   hs.add("Grapes");
   hs.add("Orange");
   hs.add("Apple");
   hs.add(null);
   hs.add(null);            //only one null value/ 
   System.out.println(hs);
   
   System.out.println( "******....");
   
   
   LinkedHashSet<String> ls = new LinkedHashSet<String>();
   ls.add("Banana");
   ls.add("Apple");
   ls.add("Grapes");
   ls.add(null);
   ls.add("Orange");
   ls.add("Apple");
   ls.add(null);
   
   
   
   
   System.out.println(ls);
   
   TreeSet<String> ts = new TreeSet<String>();
   ts.add("Banana");
   ts.add("Fig");
   ts.add("Apple");
   ts.add("Grapes");
// ts.add(null);
   ts.add("Orange");
   ts.add("Apple");
   
   System.out.println(ts);
   
   HashMap<String, Integer> hm = new HashMap<String, Integer>();
   
   hm.put("Banana", 2);
   hm.put("Apple", 4);
   hm.put("Grapes", 6);
   hm.put("Orange", 5);
   hm.put("Apple", 7);
   hm.put(null, null);
   hm.put("Mango", null);
   System.out.println(hm);
   
   LinkedHashMap<String,Integer>lhm = new LinkedHashMap<String,Integer>();
   lhm.put("Banana", 2);
   lhm.put("Apple", 4);
   lhm.put("Grapes", 6);
   lhm.put("Orange", 5);
   lhm.put("Apple", 7);
   lhm.put("null", 9);
   
   System.out.println(lhm);
   
   TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
   
   tm.put("Banana", 2);
   tm.put("Apple", 4);
   tm.put("Grapes", 6);
   tm.put("Orange", 5);
   tm.put("Apple", 7);
   tm.put("Fig", null);
   
   System.out.println(tm);
   
   Hashtable<String,Double> ht = new Hashtable<String, Double>();
   ht.put("Banana", 2.10);
   ht.put("Apple", 4.01);
   ht.put("Grapes", 6.20);
   ht.put("Orange", 5.11);
   ht.put("Apple", 7.14);
   //ht.put("Fig", null);
   
   System.out.println(ht);
   
   
   
   
   
	
	
 }
   }
     
