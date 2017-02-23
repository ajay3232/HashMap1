package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Avi Hacker on 2/23/2017.
 */

// Set has no order...we are printhing hashmap with the help of set..so result can be in any order

public class HashMap1 {

    public static void main(String args[]) {

        // its like creating a game score program...everybody gets score out of 100 so string,Integer pair..
        // to create two values that depend on each other...we use map ( child...hashmap here )

        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

        hashMap.put("Ajay",80);
        hashMap.put("Jame",60);
        hashMap.put("Rita",55);
        hashMap.put("Chris",88);


        // now loop it n print these value...
// 1 way to loop through hashMap is to put it in Set and loop the ( Set using Iterator )

       Set set = hashMap.entrySet();    // entering mappings in set

        // attach set to Iterator and put that in Iterator Object for looping

        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {             // hasNext return true till next method that is inside it will return an element n tab tak loop chalegi

            Map.Entry keyValuePair = (Map.Entry) iterator.next() ; // next method will return next element in list starting from 1st element ( here key-value par ) ..to store key value par we use (Map.Entry) interface

            System.out.println(keyValuePair.getKey() + " : " + keyValuePair.getValue());

        }




    }
}
