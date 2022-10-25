package com.example;
    
import java.util.*;


/**
 * Hello world!
 *
 */
public class ListManipulator 
{
    public ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending)
    {
        if (ascending)
        {
            Collections.sort(myLst);
            return myLst;
        }
        else
        {
            Collections.sort(myLst, Collections.reverseOrder());
            return myLst;
        }
    }
    public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst)
    {
        Integer largest;
        largest = myLst.get(0);
        int i = 0;
        int largestIndex = 0;
        for(Integer num: myLst)
        {
            if (largest < num)
            {
                largest = num;
                largestIndex = i;
            }
            i++;
        }
        i = 0;
        Integer smallest = myLst.get(0);
        int smallestIndex = 0;
        for(Integer num: myLst)
        {
            if (smallest > num)
            {
                smallest = num;
                smallestIndex = i;
            }
            i++;
            
        }
        myLst.set(largestIndex, smallest);
        myLst.set(smallestIndex, largest);
        return myLst;
    }
    public void table(ArrayList<Integer> myLst)
    {
            myLst = sort(myLst, true);
            Integer frequency = 0, previous = 0;
            Boolean first = true;
            if (myLst.size() == 0)  {
                return;
            }
            for(Integer val: myLst)
            {
                if (first){
                    first = false;
                    previous = val;
                }
                if (val == previous) {
                    frequency +=1;
                } else {
                    System.out.printf(" %d : %d\n", previous, frequency);
                    previous = val;
                    frequency = 1;
                }

            }
            System.out.printf(" %d : %d\n", previous, frequency);
            

    }
    
}
