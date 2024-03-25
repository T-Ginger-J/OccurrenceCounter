import java.util.HashMap;
import java.util.Dictionary;
import java.util.Hashtable;

public class OccurrenceCounter {
    // dictionary uses a char for key and holds the counter as its value
    public Dictionary<Character, Integer> dic;
    public char[] arr;
    public int[] countArr;

    //constructor
    public OccurrenceCounter (char[] array) {
        dic = new Hashtable<>();
        arr = array;
        this.count();
        this.returnCount();
    }

    //function to count number of occurrences of a char in an array
    private void count () {
        for (int i = 0; i < arr.length ; i++){
            if (dic.get(arr[i]) == null){
                dic.put(arr[i], 1);
            } else {
                increment(arr[i]);
            }
        }
    }

    // equivalent to a ++ but for dictionaries
    private void increment(char key){
        dic.put(key, dic.get(key)+1);
    }

    // converts dictionaries back into an array
    // the index of the char in the original array will hold its corresponding count
    public int[] returnCount () {
        countArr = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            countArr[i] = dic.get(arr[i]);
        }
        return countArr;
    }

    //counts a character in an array
    public int singleCharCounter (char c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == c)
                count++;
        }
        return count;
    }

}

