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

        return myLst;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
}
