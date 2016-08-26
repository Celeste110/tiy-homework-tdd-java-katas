import org.junit.Test;
import java.util.Map;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by katherine_celeste on 8/24/16.
 */
public class Map2Test {

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the value 0 as the value of the key in a map
     */
    public void word0Test1() {
        // Arrange
        String[] words = {"a", "b", "a", "b"};

        // Act
        Map<String, Integer> returnValues = Map2.word0(words);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo(0)));
        assertThat(returnValues.get("a"), is(equalTo(0)));
    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the value 0 as the value of the key in a map
     */
    public void word0Test2() {
        // Arrange
        String[] words = {"a", "b", "a", "c", "b"};

        // Act
        Map<String, Integer> returnValues = Map2.word0(words);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo(0)));
        assertThat(returnValues.get("c"), is(equalTo(0)));
        assertThat(returnValues.get("a"), is(equalTo(0)));
    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the value 0 as the value of the key in a map
     */
    public void word0Test3() {
        // Arrange
        String[] words = {"c", "b", "a"};

        // Act
        Map<String, Integer> returnValues = Map2.word0(words);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo(0)));
        assertThat(returnValues.get("c"), is(equalTo(0)));
        assertThat(returnValues.get("a"), is(equalTo(0)));
    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the value 0 as the value of the key in a map
     */
    public void word0Test4() {
        // Arrange
        String[] words = {"c", "c", "c", "c"};

        // Act
        Map<String, Integer> returnValues = Map2.word0(words);

        // Assert
        assertThat(returnValues.get("c"), is(equalTo(0)));
    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the value 0 as the value of the key in a map
     */
    public void word0Test5() {
        // Arrange
        String[] words = new String[]{};

        // Act
        Map<String, Integer> returnValues = Map2.word0(words);

        // Assert
        assertThat(returnValues.size(), is(equalTo(0)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the number of times the word appears
     * as the value in a map
     */
    public void wordCountTest1() {
        // Arrange
        String[] words = new String[]{"a", "b", "a", "c", "b"};

        // Act
        Map<String, Integer> returnValues = Map2.wordCount(words);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo(2)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the number of times the word appears
     * as the value in a map
     */
    public void wordCountTest2() {
        // Arrange
        String[] words = new String[]{"c", "b", "a"};

        // Act
        Map<String, Integer> returnValues = Map2.wordCount(words);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo(1)));
        assertThat(returnValues.get("c"), is(equalTo(1)));
        assertThat(returnValues.get("a"), is(equalTo(1)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the number of times the word appears
     * as the value in a map
     */
    public void wordCountTest3() {
        // Arrange
        String[] words = new String[]{"c", "c", "c", "c"};

        // Act
        Map<String, Integer> returnValues = Map2.wordCount(words);

        // Assert
        assertThat(returnValues.get("c"), is(equalTo(4)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the number of times the word appears
     * as the value in a map
     */
    public void wordCountTest4() {
        // Arrange
        String[] words = new String[]{};

        // Act
        Map<String, Integer> returnValues = Map2.wordCount(words);

        // Assert
        assertThat(returnValues.size(), is(equalTo(0)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the number of times the word appears
     * as the value in a map
     */
    public void wordCountTest5() {
        // Arrange
        String[] words = new String[]{"this", "and", "this", ""};

        // Act
        Map<String, Integer> returnValues = Map2.wordCount(words);

        // Assert
        assertThat(returnValues.get(""), is(equalTo(1)));
        assertThat(returnValues.get("this"), is(equalTo(2)));
        assertThat(returnValues.get("and"), is(equalTo(1)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the number of times the word appears
     * as the value in a map
     */
    public void wordCountTest6() {
        // Arrange
        String[] words = new String[]{"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x",
                "two", "b", "one", "two"};

        // Act
        Map<String, Integer> returnValues = Map2.wordCount(words);

        // Assert
        assertThat(returnValues.get("f"), is(equalTo(1)));
        assertThat(returnValues.get("two"), is(equalTo(2)));
        assertThat(returnValues.get("d"), is(equalTo(3)));
        assertThat(returnValues.get("e"), is(equalTo(1)));
        assertThat(returnValues.get("b"), is(equalTo(5)));
        assertThat(returnValues.get("one"), is(equalTo(1)));
        assertThat(returnValues.get("a"), is(equalTo(4)));
        assertThat(returnValues.get("z"), is(equalTo(2)));
        assertThat(returnValues.get("x"), is(equalTo(2)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and "true" as the boolean value
     * if the string appears 2 or more times in the array
     */
    public void wordMultipleTest1() {
        // Arrange
        String[] words = new String[]{"a", "b", "a", "c", "b"};

        // Act
        Map<String, Boolean> returnValues = Map2.wordMultiple(words);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo(true)));
        assertThat(returnValues.get("c"), is(equalTo(false)));
        assertThat(returnValues.get("a"), is(equalTo(true)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and "true" as the boolean value
     * if the string appears 2 or more times in the array
     */
    public void wordMultipleTest2() {
        // Arrange
        String[] words = new String[]{"c", "b", "a"};

        // Act
        Map<String, Boolean> returnValues = Map2.wordMultiple(words);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo(false)));
        assertThat(returnValues.get("c"), is(equalTo(false)));
        assertThat(returnValues.get("a"), is(equalTo(false)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and "true" as the boolean value
     * if the string appears 2 or more times in the array
     */
    public void wordMultipleTest3() {
        // Arrange
        String[] words = new String[]{"c", "c", "c", "c"};

        // Act
        Map<String, Boolean> returnValues = Map2.wordMultiple(words);

        // Assert
        assertThat(returnValues.get("c"), is(equalTo(true)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and "true" as the boolean value
     * if the string appears 2 or more times in the array
     */
    public void wordMultipleTest4() {
        // Arrange
        String[] words = new String[]{};

        // Act
        Map<String, Boolean> returnValues = Map2.wordMultiple(words);

        // Assert
        assertThat(returnValues.size(), is(equalTo(0)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and "true" as the boolean value
     * if the string appears 2 or more times in the array
     */
    public void wordMultipleTest5() {
        // Arrange
        String[] words = new String[]{"this", "and", "this"};

        // Act
        Map<String, Boolean> returnValues = Map2.wordMultiple(words);

        // Assert
        assertThat(returnValues.get("this"), is(equalTo(true)));
        assertThat(returnValues.get("and"), is(equalTo(false)));
    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and "true" as the boolean value
     * if the string appears 2 or more times in the array
     */
    public void wordMultipleTest6() {
        // Arrange
        String[] words = new String[]{"d", "a", "e", "d", "a", "d",
                "b", "b", "z", "a", "a", "b", "z", "x"};

        // Act
        Map<String, Boolean> returnValues = Map2.wordMultiple(words);

        // Assert
        assertThat(returnValues.get("d"), is(equalTo(true)));
        assertThat(returnValues.get("e"), is(equalTo(false)));
        assertThat(returnValues.get("b"), is(equalTo(true)));
        assertThat(returnValues.get("a"), is(equalTo(true)));
        assertThat(returnValues.get("z"), is(equalTo(true)));
        assertThat(returnValues.get("x"), is(equalTo(false)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the word's length as the value
     */
    public void wordLenTest1() {
        // Arrange
        String[] words = new String[]{"a", "bb", "a", "bb"};

        // Act
        Map<String, Integer> returnValues = Map2.wordLen(words);

        // Assert
        assertThat(returnValues.get("a"), is(equalTo(1)));
        assertThat(returnValues.get("bb"), is(equalTo(2)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the word's length as the value
     */
    public void wordLenTest2() {
        // Arrange
        String[] words = new String[]{"this", "and", "that", "and"};

        // Act
        Map<String, Integer> returnValues = Map2.wordLen(words);

        // Assert
        assertThat(returnValues.get("that"), is(equalTo(4)));
        assertThat(returnValues.get("this"), is(equalTo(4)));
        assertThat(returnValues.get("and"), is(equalTo(3)));

    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the word's length as the value
     */
    public void wordLenTest3() {
        // Arrange
        String[] words = new String[]{"code", "code", "code", "bug"};

        // Act
        Map<String, Integer> returnValues = Map2.wordLen(words);

        // Assert
        assertThat(returnValues.get("bug"), is(equalTo(3)));
        assertThat(returnValues.get("code"), is(equalTo(4)));
    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the word's length as the value
     */
    public void wordLenTest4() {
        // Arrange
        String[] words = new String[]{};

        // Act
        Map<String, Integer> returnValues = Map2.wordLen(words);

        // Assert
        assertThat(returnValues.size(), is(equalTo(0)));
    }

    @Test
    /**
     * Given an array of strings
     * When you come across a unique word
     * Then store the word as the key and the word's length as the value
     */
    public void wordLenTest5() {
        // Arrange
        String[] words = new String[]{"z"};

        // Act
        Map<String, Integer> returnValues = Map2.wordLen(words);

        // Assert
        assertThat(returnValues.get("z"), is(equalTo(1)));

    }


    @Test
    /**
     * Given an array of non-empty strings
     * When you come across a unique first character
     * Then store append the value of all of the string starting with that character
     * in the order that they appear
     */
    public void firstCharTest2() {
        // Arrange
        String[] words = new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"};

        // Act
        Map<String, String> returnValues = Map2.firstChar(words);

        // Assert
        assertThat(returnValues.get("d"), is(equalTo("d")));
        assertThat(returnValues.get("b"), is(equalTo("bb")));
        assertThat(returnValues.get("c"), is(equalTo("cccCC")));
        assertThat(returnValues.get("a"), is(equalTo("aaaAA")));

    }

    @Test
    /**
     * Given an array of non-empty strings
     * When you come across a unique first character
     * Then store append the value of all of the string starting with that character
     * in the order that they appear
     */
    public void firstCharTest3() {
        // Arrange
        String[] words = new String[]{};

        // Act
        Map<String, String> returnValues = Map2.firstChar(words);

        // Assert
        assertThat(returnValues.size(), is(equalTo(0)));

    }

    @Test
    /**
     * Given an array of non-empty strings
     * When you come across a unique first character
     * Then store append the value of all of the string starting with that character
     * in the order that they appear
     */
    public void firstCharTest4() {
        // Arrange
        String[] words = new String[]{"apple", "bells", "salt", "aardvark", "bells",
                "sun", "zen", "bells"};

        // Act
        Map<String, String> returnValues = Map2.firstChar(words);

        // Assert
        assertThat(returnValues.get("s"), is(equalTo("saltsun")));
        assertThat(returnValues.get("b"), is(equalTo("bellsbellsbells")));
        assertThat(returnValues.get("a"), is(equalTo("appleaardvark")));
        assertThat(returnValues.get("z"), is(equalTo("zen")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string matches an earlier string in the array
     * Then swap the 2 strings in the array
     */
    public void allSwapTest1() {
        // Arrange
        String[] words = new String[]{"ab", "ac"};

        // Act
        String[] returnValues = Map2.allSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("ac")));
        assertThat(returnValues[1], is(equalTo("ab")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string matches an earlier string in the array
     * Then swap the 2 strings in the array
     */
    public void allSwapTest2() {
        // Arrange
        String[] words = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};

        // Act
        String[] returnValues = Map2.allSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("ay")));
        assertThat(returnValues[1], is(equalTo("by")));
        assertThat(returnValues[2], is(equalTo("cy")));
        assertThat(returnValues[3], is(equalTo("cx")));
        assertThat(returnValues[4], is(equalTo("bx")));
        assertThat(returnValues[5], is(equalTo("ax")));
        assertThat(returnValues[6], is(equalTo("azz")));
        assertThat(returnValues[7], is(equalTo("aaa")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string matches an earlier string in the array
     * Then swap the 2 strings in the array
     */
    public void allSwapTest3() {
        // Arrange
        String[] words = new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        // Act
        String[] returnValues = Map2.allSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("ay")));
        assertThat(returnValues[1], is(equalTo("by")));
        assertThat(returnValues[2], is(equalTo("ax")));
        assertThat(returnValues[3], is(equalTo("bx")));
        assertThat(returnValues[4], is(equalTo("aj")));
        assertThat(returnValues[5], is(equalTo("ai")));
        assertThat(returnValues[6], is(equalTo("by")));
        assertThat(returnValues[7], is(equalTo("bx")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string matches an earlier string in the array
     * Then swap the 2 strings in the array
     */
    public void allSwapTest4() {
        // Arrange
        String[] words = new String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "abb"};

        // Act
        String[] returnValues = Map2.allSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("ay")));
        assertThat(returnValues[1], is(equalTo("bx")));
        assertThat(returnValues[2], is(equalTo("cy")));
        assertThat(returnValues[3], is(equalTo("ax")));
        assertThat(returnValues[4], is(equalTo("cx")));
        assertThat(returnValues[5], is(equalTo("abb")));
        assertThat(returnValues[6], is(equalTo("aaa")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string matches an earlier string in the array
     * Then swap the 2 strings in the array
     */
    public void allSwapTest5() {
        // Arrange
        String[] words = new String[]{"easy", "does", "it", "every", "ice", "eaten"};

        // Act
        String[] returnValues = Map2.allSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("every")));
        assertThat(returnValues[1], is(equalTo("does")));
        assertThat(returnValues[2], is(equalTo("ice")));
        assertThat(returnValues[3], is(equalTo("easy")));
        assertThat(returnValues[4], is(equalTo("it")));
        assertThat(returnValues[5], is(equalTo("eaten")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string matches an earlier string in the array
     * Then swap the 2 strings in the array
     */
    public void allSwapTest6() {
        // Arrange
        String[] words = new String[]{"list", "of", "words", "swims", "over", "lily"
                , "water", "wait"};

        // Act
        String[] returnValues = Map2.allSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("lily")));
        assertThat(returnValues[1], is(equalTo("over")));
        assertThat(returnValues[2], is(equalTo("water")));
        assertThat(returnValues[3], is(equalTo("swims")));
        assertThat(returnValues[4], is(equalTo("of")));
        assertThat(returnValues[5], is(equalTo("list")));
        assertThat(returnValues[6], is(equalTo("words")));
        assertThat(returnValues[7], is(equalTo("wait")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string matches an earlier string in the array
     * Then swap the 2 strings in the array
     */
    public void allSwapTest7() {
        // Arrange
        String[] words = new String[]{"4", "8", "15", "16", "23", "42"};

        // Act
        String[] returnValues = Map2.allSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("42")));
        assertThat(returnValues[1], is(equalTo("8")));
        assertThat(returnValues[2], is(equalTo("16")));
        assertThat(returnValues[3], is(equalTo("15")));
        assertThat(returnValues[4], is(equalTo("23")));
        assertThat(returnValues[5], is(equalTo("4")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string matches an earlier string in the array
     * Then swap the 2 strings in the array
     */
    public void allSwapTest8() {
        // Arrange
        String[] words = new String[]{"aaa"};

        // Act
        String[] returnValues = Map2.allSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("aaa")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string matches an earlier string in the array
     * Then swap the 2 strings in the array
     */
    public void allSwapTest9() {
        // Arrange
        String[] words = new String[]{};

        // Act
        String[] returnValues = Map2.allSwap(words);

        // Assert
        assertThat(returnValues.length, is(equalTo(0)));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string matches an earlier string in the array
     * Then swap the 2 strings in the array
     */
    public void allSwapTest10() {
        // Arrange
        String[] words = new String[]{"a", "b", "c", "xx", "yy", "zz"};

        // Act
        String[] returnValues = Map2.allSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("a")));
        assertThat(returnValues[1], is(equalTo("b")));
        assertThat(returnValues[2], is(equalTo("c")));
        assertThat(returnValues[3], is(equalTo("xx")));
        assertThat(returnValues[4], is(equalTo("yy")));
        assertThat(returnValues[5], is(equalTo("zz")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When you encounter a different word in the array
     * Then add it to a map, making the first character the key and the last
     * character the value
     */
    public void pairsTest1() {
        // Arrange
        String[] words = new String[]{"code", "bug"};

        // Act
        Map<String, String> returnValues = Map2.pairs(words);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("g")));
        assertThat(returnValues.get("c"), is(equalTo("e")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When you encounter a different word in the array
     * Then add it to a map, making the first character the key and the last
     * character the value
     */
    public void pairsTest2() {
        // Arrange
        String[] words = new String[]{"man", "moon", "main"};

        // Act
        Map<String, String> returnValues = Map2.pairs(words);

        // Assert
        assertThat(returnValues.get("m"), is(equalTo("n")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When you encounter a different word in the array
     * Then add it to a map, making the first character the key and the last
     * character the value
     */
    public void pairsTest3() {
        // Arrange
        String[] words = new String[]{"man", "moon", "good", "night"};

        // Act
        Map<String, String> returnValues = Map2.pairs(words);

        // Assert
        assertThat(returnValues.get("g"), is(equalTo("d")));
        assertThat(returnValues.get("n"), is(equalTo("t")));
        assertThat(returnValues.get("m"), is(equalTo("n")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When you encounter a different word in the array
     * Then add it to a map, making the first character the key and the last
     * character the value
     */
    public void pairsTest4() {
        // Arrange
        String[] words = new String[]{};

        // Act
        Map<String, String> returnValues = Map2.pairs(words);

        // Assert
        assertThat(returnValues.size(), is(equalTo(0)));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When you encounter a different word in the array
     * Then add it to a map, making the first character the key and the last
     * character the value
     */
    public void pairsTest5() {
        // Arrange
        String[] words = new String[]{"a", "b"};

        // Act
        Map<String, String> returnValues = Map2.pairs(words);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("b")));
        assertThat(returnValues.get("a"), is(equalTo("a")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When you encounter a different word in the array
     * Then add it to a map, making the first character the key and the last
     * character the value
     */
    public void pairsTest6() {
        // Arrange
        String[] words = new String[]{"are", "codes", "and", "cods"};

        // Act
        Map<String, String> returnValues = Map2.pairs(words);

        // Assert
        assertThat(returnValues.get("c"), is(equalTo("s")));
        assertThat(returnValues.get("a"), is(equalTo("d")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string appears the 2nd, 4th, 6th, etc. time in the array
     * Then append the string to the result.
     */
    public void wordAppendTest1() {
        // Arrange
        String[] words = new String[]{"a", "b", "a"};

        // Act
        String returnValues = Map2.wordAppend(words);

        // Assert
        assertThat(returnValues, is(equalTo("a")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string appears the 2nd, 4th, 6th, etc. time in the array
     * Then append the string to the result.
     */
    public void wordAppendTest2() {
        // Arrange
        String[] words = new String[]{"a", "", "a"};

        // Act
        String returnValues = Map2.wordAppend(words);

        // Assert
        assertThat(returnValues, is(equalTo("a")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string appears the 2nd, 4th, 6th, etc. time in the array
     * Then append the string to the result.
     */
    public void wordAppendTest3() {
        // Arrange
        String[] words = new String[]{};

        // Act
        String returnValues = Map2.wordAppend(words);

        // Assert
        assertThat(returnValues.length(), is(equalTo(0)));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string appears the 2nd, 4th, 6th, etc. time in the array
     * Then append the string to the result.
     */
    public void wordAppendTest4() {
        // Arrange
        String[] words = new String[]{"a", "b", "b", "a", "a"};

        // Act
        String returnValues = Map2.wordAppend(words);

        // Assert
        assertThat(returnValues, is(equalTo("ba")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string appears the 2nd, 4th, 6th, etc. time in the array
     * Then append the string to the result.
     */
    public void wordAppendTest5() {
        // Arrange
        String[] words = new String[]{"a", "b", "b", "b", "a", "c", "a", "a"};

        // Act
        String returnValues = Map2.wordAppend(words);

        // Assert
        assertThat(returnValues, is(equalTo("baa")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string appears the 2nd, 4th, 6th, etc. time in the array
     * Then append the string to the result.
     */
    public void wordAppendTest6() {
        // Arrange
        String[] words = new String[]{"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"};

        // Act
        String returnValues = Map2.wordAppend(words);

        // Assert
        assertThat(returnValues, is(equalTo("baaba")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string appears the 2nd, 4th, 6th, etc. time in the array
     * Then append the string to the result.
     */
    public void wordAppendTest7() {
        // Arrange
        String[] words = new String[]{"not", "and", "or", "and", "this", "and", "or", "that", "not"};

        // Act
        String returnValues = Map2.wordAppend(words);

        // Assert
        assertThat(returnValues, is(equalTo("andornot")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string appears the 2nd, 4th, 6th, etc. time in the array
     * Then append the string to the result.
     */
    public void wordAppendTest8() {
        // Arrange
        String[] words = new String[]{"a", "b", "c"};

        // Act
        String returnValues = Map2.wordAppend(words);

        // Assert
        assertThat(returnValues, is(equalTo("")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string appears the 2nd, 4th, 6th, etc. time in the array
     * Then append the string to the result.
     */
    public void wordAppendTest9() {
        // Arrange
        String[] words = new String[]{"this", "or", "that", "and", "this", "and", "that"};

        // Act
        String returnValues = Map2.wordAppend(words);

        // Assert
        assertThat(returnValues, is(equalTo("thisandthat")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a string appears the 2nd, 4th, 6th, etc. time in the array
     * Then append the string to the result.
     */
    public void wordAppendTest10() {
        // Arrange
        String[] words = new String[]{"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"};

        // Act
        String returnValues = Map2.wordAppend(words);

        // Assert
        assertThat(returnValues, is(equalTo("xxyyzzxx")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a word matches an earlier word in the array
     * Then swap the two strings in the array. Once a char has caused
     * a swap, its later swaps are disabled.
     */
    public void firstSwapTest1() {
        // Arrange
        String[] words = new String[]{"ab", "ac"};

        // Act
        String[] returnValues = Map2.firstSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("ac")));
        assertThat(returnValues[1], is(equalTo("ab")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a word matches an earlier word in the array
     * Then swap the two strings in the array. Once a char has caused
     * a swap, its later swaps are disabled.
     */
    public void firstSwapTest2() {
        // Arrange
        String[] words = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};

        // Act
        String[] returnValues = Map2.firstSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("ay")));
        assertThat(returnValues[1], is(equalTo("by")));
        assertThat(returnValues[2], is(equalTo("cy")));
        assertThat(returnValues[3], is(equalTo("cx")));
        assertThat(returnValues[4], is(equalTo("bx")));
        assertThat(returnValues[5], is(equalTo("ax")));
        assertThat(returnValues[6], is(equalTo("aaa")));
        assertThat(returnValues[7], is(equalTo("azz")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a word matches an earlier word in the array
     * Then swap the two strings in the array. Once a char has caused
     * a swap, its later swaps are disabled.
     */
    public void firstSwapTest3() {
        // Arrange
        String[] words = new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        // Act
        String[] returnValues = Map2.firstSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("ay")));
        assertThat(returnValues[1], is(equalTo("by")));
        assertThat(returnValues[2], is(equalTo("ax")));
        assertThat(returnValues[3], is(equalTo("bx")));
        assertThat(returnValues[4], is(equalTo("ai")));
        assertThat(returnValues[5], is(equalTo("aj")));
        assertThat(returnValues[6], is(equalTo("bx")));
        assertThat(returnValues[7], is(equalTo("by")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a word matches an earlier word in the array
     * Then swap the two strings in the array. Once a char has caused
     * a swap, its later swaps are disabled.
     */
    public void firstSwapTest4() {
        // Arrange
        String[] words = new String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "abb"};

        // Act
        String[] returnValues = Map2.firstSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("ay")));
        assertThat(returnValues[1], is(equalTo("bx")));
        assertThat(returnValues[2], is(equalTo("cy")));
        assertThat(returnValues[3], is(equalTo("ax")));
        assertThat(returnValues[4], is(equalTo("cx")));
        assertThat(returnValues[5], is(equalTo("aaa")));
        assertThat(returnValues[6], is(equalTo("abb")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a word matches an earlier word in the array
     * Then swap the two strings in the array. Once a char has caused
     * a swap, its later swaps are disabled.
     */
    public void firstSwapTest5() {
        // Arrange
        String[] words = new String[]{"easy", "does", "it", "every", "ice", "eaten"};

        // Act
        String[] returnValues = Map2.firstSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("every")));
        assertThat(returnValues[1], is(equalTo("does")));
        assertThat(returnValues[2], is(equalTo("ice")));
        assertThat(returnValues[3], is(equalTo("easy")));
        assertThat(returnValues[4], is(equalTo("it")));
        assertThat(returnValues[5], is(equalTo("eaten")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a word matches an earlier word in the array
     * Then swap the two strings in the array. Once a char has caused
     * a swap, its later swaps are disabled.
     */
    public void firstSwapTest6() {
        // Arrange
        String[] words = new String[]{"list", "of", "words", "swims", "over", "lily", "water", "wait"};

        // Act
        String[] returnValues = Map2.firstSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("lily")));
        assertThat(returnValues[1], is(equalTo("over")));
        assertThat(returnValues[2], is(equalTo("water")));
        assertThat(returnValues[3], is(equalTo("swims")));
        assertThat(returnValues[4], is(equalTo("of")));
        assertThat(returnValues[5], is(equalTo("list")));
        assertThat(returnValues[6], is(equalTo("words")));
        assertThat(returnValues[7], is(equalTo("wait")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a word matches an earlier word in the array
     * Then swap the two strings in the array. Once a char has caused
     * a swap, its later swaps are disabled.
     */
    public void firstSwapTest7() {
        // Arrange
        String[] words = new String[]{"4", "8", "15", "16", "23", "42"};

        // Act
        String[] returnValues = Map2.firstSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("42")));
        assertThat(returnValues[1], is(equalTo("8")));
        assertThat(returnValues[2], is(equalTo("16")));
        assertThat(returnValues[3], is(equalTo("15")));
        assertThat(returnValues[4], is(equalTo("23")));
        assertThat(returnValues[5], is(equalTo("4")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a word matches an earlier word in the array
     * Then swap the two strings in the array. Once a char has caused
     * a swap, its later swaps are disabled.
     */
    public void firstSwapTest8() {
        // Arrange
        String[] words = new String[]{"aaa"};

        // Act
        String[] returnValues = Map2.firstSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("aaa")));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a word matches an earlier word in the array
     * Then swap the two strings in the array. Once a char has caused
     * a swap, its later swaps are disabled.
     */
    public void firstSwapTest9() {
        // Arrange
        String[] words = new String[]{};

        // Act
        String[] returnValues = Map2.firstSwap(words);

        // Assert
        assertThat(returnValues.length, is(equalTo(0)));
    }

    @Test
    /**
     * Given an array of non-empty strings
     * When a word matches an earlier word in the array
     * Then swap the two strings in the array. Once a char has caused
     * a swap, its later swaps are disabled.
     */
    public void firstSwapTest10() {
        // Arrange
        String[] words = new String[]{"a", "b", "c", "xx", "yy", "zz"};

        // Act
        String[] returnValues = Map2.firstSwap(words);

        // Assert
        assertThat(returnValues[0], is(equalTo("a")));
        assertThat(returnValues[1], is(equalTo("b")));
        assertThat(returnValues[2], is(equalTo("c")));
        assertThat(returnValues[3], is(equalTo("xx")));
        assertThat(returnValues[4], is(equalTo("yy")));
        assertThat(returnValues[5], is(equalTo("zz")));
    }
}
