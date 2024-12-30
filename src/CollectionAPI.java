
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Collection API --> We talk about the concept
 * Collection --> We talk about the Interfaces
 * Collections --> We talk about the Classes
 */

public class CollectionAPI {

    public void show() {
        Collection<Integer> nums = new ArrayList<>(); // We can't use index here
        nums.add(5);
        nums.add(1);
        nums.add(3);
        nums.add(8);
        
        for(int num : nums) {
            System.out.println(num);
        }
        List<Integer> nums1 = new ArrayList<>(); // We can use index here with get() method

        nums1.add(5);
        nums1.add(1);
        nums1.add(3);
        nums1.add(8);
        
        System.out.println(nums1.get(0)); // output: 5
        System.out.println(nums1.indexOf(3)); // output: 2

        // Set

        Set<Integer> st = new HashSet<>(); // Same as ArrayList but the elements are unique and not sequence and 
        Map<String,Integer> students = new HashMap<>(); // Same as object in js or dic in python
        students.put("Ayoub", 20);
        
        
    }
    
}
