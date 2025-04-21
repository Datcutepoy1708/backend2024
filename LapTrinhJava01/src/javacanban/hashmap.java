package javacanban;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
public class hashmap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Integer>map=new HashMap<>();
	  map.put(3,5);
      map.put(1, 3);
      map.put(2, 4);
      System.out.print(map.size());
      System.out.print(map.get(1));
      Set<Entry<Integer,Integer>> set=map.entrySet();
      for(Map.Entry<Integer,Integer>entry : set){
    	  System.out.println(entry.getKey()+" "+entry.getValue());
      }
}
}
