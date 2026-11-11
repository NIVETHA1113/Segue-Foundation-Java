import java.util.*;
public class HashMap {
    public static void main(String[] args) {
    Map<Integer,Integer> price = new java.util.HashMap<>();
price.put(100, 5000);
price.put(101,250);
price.put(101,275);
for(Integer key: price.keySet()){
    System.out.println(key+" "+price.get(key));
}



    }}

