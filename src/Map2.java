import java.util.HashMap;
import java.util.Map;

/**
 * Created by katherine_celeste on 8/24/16.
 */
public class Map2 {

    // Given an array of strings, return a Map<String, Integer> containing a key for every
    // different string in the array, always with the value 0. For example the string "hello"
    // makes the pair "hello":0. We'll do more complicated counting later, but for this problem
    // the value is simply 0.
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> values = new HashMap();
        for (String word : strings) {
            values.put(word, 0);
        }
        return values;
    }

    // The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
    // with a key for each different string, with the value the number of times that string appears in the array.
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> values = new HashMap();

        // set default counts to 0
        for (String word : strings) {
            values.put(word, 0);
        }

        //count instances of word
        for (String word : strings) {
            values.put(word, values.get(word) + 1);
        }

        return values;
    }

    // Given an array of strings, return a Map<String, Boolean> where each different string is a
    // key and value is true only if that string appears 2 or more times in the array.
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> values = new HashMap();
        Map<String, Boolean> inst = new HashMap();

        // set default counts to 0
        for (String word : strings) {
            values.put(word, 0);
        }

        //count instances of word
        for (String word : strings) {
            values.put(word, values.get(word) + 1);
            inst.put(word, false);
        }

        // set value to true for words that appear >=2 times
        for (String word : strings) {
            if (values.get(word) >= 2) {
                inst.put(word, true);
            }
        }

        return inst;
    }

    // Given an array of strings, return a Map<String, Integer> containing a key for every different
    // string in the array, and the value is that string's length.
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> values = new HashMap();

        // set default counts to 0
        for (String word : strings) {
            if (!values.containsKey(word))
                values.put(word, word.length());
        }

        return values;
    }

    // Given an array of non-empty strings, return a Map<String, String> with a key for every different
    // first character seen, with the value of all the strings starting with that character appended
    // together in the order they appear in the array.
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> values = new HashMap();

        // set default counts to 0
        for (String word : strings) {
            if (!values.containsKey(word.charAt(0)))
                values.put(word.charAt(0) + "", "");
        }

        // set default counts to 0
        for (String word : strings) {
            values.put(word.charAt(0) + "", values.get(word.charAt(0) + "") + word);
        }

        return values;
    }

    // We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
    // Loop over and then return the given array of non-empty strings as follows: if a string matches
    // an earlier string in the array, swap the 2 strings in the array. When a position in the arrays
    // has been swapped, it no longer matches anything. Using a map, this can be solved making just
    // one pass over the array. More difficult than it looks.
    //THIS WORKS!!!!!
    public static String[] allSwap(String[] strings) {
        Map<String, Integer> values = new HashMap();

        for (String word : strings) {
            values.put(word, 0);
        }

        //count instances of word
        for (String word : strings) {
            values.put(word, values.get(word) + 1);
        }

        int counter = strings.length - 1;

        for (int i = 0; i <= counter; i++) {
            for (int index = i + 1; index <= counter; index++) {
                if (strings[i].charAt(0) == strings[index].charAt(0) && strings[i] != "" && values.containsKey(strings[i]) && values.containsKey(strings[index])) {

                    values.put(strings[i], values.get(strings[i]) - 1);
                    values.put(strings[index], values.get(strings[index]) - 1);

                    if (values.get(strings[i]) == 0) {
                        values.remove(strings[i]);
                    }
                    if (values.get(strings[index]) == 0) {
                        values.remove(strings[index]);
                    }

                    // switch
                    String temp = strings[index];
                    strings[index] = strings[i];
                    strings[i] = temp;
                    break;
                }
            }
        }
        return strings;
    }

    // Given an array of non-empty strings, return a Map<String, String> where for every different string in the
    // array, there is a key of its first character with the value of its last character.
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> values = new HashMap();
        Map<String, String> values1 = new HashMap();

        //Fill map with unique values
        for (String word : strings) {
            values.put(word, word);
        }

        for (String word : values.keySet()) {
            values1.put(word.charAt(0) + "", word.charAt(word.length() - 1) + "");
        }
        return values1;
    }

    // Loop over the given array of strings to build a result string like this: when a string appears the
    // 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string
    // no string appears a 2nd time.
    public static String wordAppend(String[] strings) {
        String append = "";
        Map<String, Integer> values = new HashMap();

        // set default counts to 0
        for (String word : strings) {
            values.put(word, 0);
        }

        // count
        for (String word : strings) {
            int count = values.get(word) + 1;
            if (count % 2 == 0) {
                append += word;
            }
            values.put(word, values.get(word) + 1);
        }
        return append;
    }

    // We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
    // Loop over and then return the given array of non-empty strings as follows: if a string matches
    // an earlier string in the array, swap the 2 strings in the array. A particular first char can
    // only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map,
    // this can be solved making just one pass over the array. More difficult than it looks.
    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> values = new HashMap();

        for (String word : strings) {
            values.put(word.charAt(0) + "", 0);
        }

        int counter = strings.length - 1;

        for (int i = 0; i <= counter; i++) {
            for (int index = i + 1; index <= counter; index++) {
                if (strings[i].charAt(0) == strings[index].charAt(0) && values.containsKey(strings[i].charAt(0) + "")) {

                    values.remove(strings[i].charAt(0) + "");

                    // switch
                    String temp = strings[index];
                    strings[index] = strings[i];
                    strings[i] = temp;
                    break;
                }
            }
        }
        return strings;
    }
}
