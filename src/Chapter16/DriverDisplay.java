package Chapter16;

import java.util.*;


public class DriverDisplay {
    public static void main(String[] args) {

        // Set text in a string
        String text = "HELLO THERE";

        // create HashMap to store string keys and integer values
        Map<String, Integer> myMap = new HashMap<>();

     createMap(myMap);  //     create map base on user input
        displayMap(myMap);   //     display map content
    }

//    create map from user input
    private static void createMap(Map<String, Integer> myMap) {
        Scanner sc = new Scanner(System.in);   //      create scanner object
        Scanner scanner = null;
        int input = scanner.nextInt();
        System.out.println("Enter a string:");   //        prompt for user input

//        tokenize the input
//        String[] tokens = input.myMap(" ");


//        processing input text
        String[] tokens = new String[0];
        for (String token : tokens) {
            String word = token.toLowerCase();   //      get lowercase word

//            if the map contains the word
            if (myMap.containsKey(word)) {    //          is word in map?
                int count = myMap.get(word);   //           get current count
                myMap.put(word, count + 1);    //           increment count
            }else{
                myMap.put(word, 1);    //       add new word with a count of 1 to map
            }
        }
    }
//    display map content
    private static void displayMap(Map<String, Integer> myMap) {
        Set<String> Keys = myMap.keySet();    //        get keys

//   sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(Keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

//        generate output for each key in map
        for (String Key : sortedKeys) {
            Object key = new Object();
            System.out.printf("%_10s%10s%n", key, myMap.get(Key));
        }

        System.out.printf("%nSize: %d%nisEmpty:  %b%n", myMap.size(), myMap.isEmpty());
       }
    }





