import junitparams.Parameters;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by katherine_celeste on 8/24/16.
 */
public class Map1Test {

    @Test
    @Parameters
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that value and set the key "a" to have the value ""
     */
    public void mapBullyTest1() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("b", "dirt");
        values.put("a", "candy");

        Map<String, String> returnValues = Map1.mapBully(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("candy")));
        assertThat(returnValues.get("a"), is(equalTo("")));
    }

    @Test
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that value and set the key "a" to have the value ""
     */
    public void mapBullyTest2() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("a", "candy");
        Map<String, String> returnValues = Map1.mapBully(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("candy")));
        assertThat(returnValues.get("a"), is(equalTo("")));
    }

    @Test
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that value and set the key "a" to have the value ""
     */
    public void mapBullyTest3() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("b", "carrot");
        values.put("c", "meh");
        values.put("a", "candy");

        Map<String, String> returnValues = Map1.mapBully(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("candy")));
        assertThat(returnValues.get("c"), is(equalTo("meh")));
        assertThat(returnValues.get("a"), is(equalTo("")));
    }

    @Test
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that value and set the key "a" to have the value ""
     */
    public void mapBullyTest4() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("b", "carrot");

        Map<String, String> returnValues = Map1.mapBully(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("carrot")));
    }

    @Test
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that value and set the key "a" to have the value ""
     */
    public void mapBullyTest5() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("c", "meh");

        Map<String, String> returnValues = Map1.mapBully(values);

        // Assert
        assertThat(returnValues.get("c"), is(equalTo("meh")));
    }

    @Test
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that value and set the key "a" to have the value ""
     */
    public void mapBullyTest6() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("c", "meh");
        values.put("a", "sparkle");

        Map<String, String> returnValues = Map1.mapBully(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("sparkle")));
        assertThat(returnValues.get("c"), is(equalTo("meh")));
        assertThat(returnValues.get("a"), is(equalTo("")));
    }

    @Test
    /**
     * Given a map of food keys and topping values
     * When key "ice cream" is present
     * Then set its value to "cherry". Set the key "bread" to have the value "butter" in all cases
     */
    public void topping1Test1() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("ice cream", "peanuts");

        Map<String, String> returnValues = Map1.topping1(values);

        // Assert
        assertThat(returnValues.get("ice cream"), is(equalTo("cherry")));
        assertThat(returnValues.get("bread"), is(equalTo("butter")));
    }

    @Test
    /**
     * Given a map of food keys and topping values
     * When key "ice cream" is present
     * Then set its value to "cherry". Set the key "bread" to have the value "butter" in all cases
     */
    public void topping1Test2() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        Map<String, String> returnValues = Map1.topping1(values);

        // Assert
        assertThat(returnValues.get("bread"), is(equalTo("butter")));
    }

    @Test
    /**
     * Given a map of food keys and topping values
     * When key "ice cream" is present
     * Then set its value to "cherry". Set the key "bread" to have the value "butter" in all cases
     */
    public void topping1Test3() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("pancake", "syrup");
        Map<String, String> returnValues = Map1.topping1(values);

        // Assert
        assertThat(returnValues.get("bread"), is(equalTo("butter")));
        assertThat(returnValues.get("pancake"), is(equalTo("syrup")));
    }

    @Test
    /**
     * Given a map of food keys and topping values
     * When key "ice cream" is present
     * Then set its value to "cherry". Set the key "bread" to have the value "butter" in all cases
     */
    public void topping1Test4() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("bread", "dirt");
        values.put("ice cream", "strawberries");
        Map<String, String> returnValues = Map1.topping1(values);

        // Assert
        assertThat(returnValues.get("bread"), is(equalTo("butter")));
        assertThat(returnValues.get("ice cream"), is(equalTo("cherry")));
    }

    @Test
    /**
     * Given a map of food keys and topping values
     * When key "ice cream" is present
     * Then set its value to "cherry". Set the key "bread" to have the value "butter" in all cases
     */
    public void topping1Test5() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("salad", "oil");
        values.put("bread", "jam");
        values.put("ice cream", "strawberries");
        Map<String, String> returnValues = Map1.topping1(values);

        // Assert
        assertThat(returnValues.get("salad"), is(equalTo("oil")));
        assertThat(returnValues.get("bread"), is(equalTo("butter")));
        assertThat(returnValues.get("ice cream"), is(equalTo("cherry")));
    }

    @Test
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that same value. In all cases, remove the key "c",
     * leaving the rest of the map unchanged.
     */
    public void mapShareTest1() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("b", "bbb");
        values.put("c", "ccc");
        values.put("a", "aaa");
        Map<String, String> returnValues = Map1.mapShare(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("aaa")));
        assertThat(returnValues.get("a"), is(equalTo("aaa")));
    }

    @Test
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that same value. In all cases, remove the key "c",
     * leaving the rest of the map unchanged.
     */
    public void mapShareTest2() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("b", "xyz");
        values.put("c", "ccc");
        Map<String, String> returnValues = Map1.mapShare(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("xyz")));
    }

    @Test
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that same value. In all cases, remove the key "c",
     * leaving the rest of the map unchanged.
     */
    public void mapShareTest3() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("d", "hi");
        values.put("c", "meh");
        values.put("a", "aaa");
        Map<String, String> returnValues = Map1.mapShare(values);

        // Assert
        assertThat(returnValues.get("d"), is(equalTo("hi")));
        assertThat(returnValues.get("b"), is(equalTo("aaa")));
        assertThat(returnValues.get("a"), is(equalTo("aaa")));
    }

    @Test
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that same value. In all cases, remove the key "c",
     * leaving the rest of the map unchanged.
     */
    public void mapShareTest4() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("b", "1234");
        values.put("c", "yo");
        values.put("a", "xyz");
        values.put("z", "zzz");
        Map<String, String> returnValues = Map1.mapShare(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("xyz")));
        assertThat(returnValues.get("a"), is(equalTo("xyz")));
        assertThat(returnValues.get("z"), is(equalTo("zzz")));
    }

    @Test
    /**
     * Given a map
     * When key "a" has a value
     * Then set the key "b" to have that same value. In all cases, remove the key "c",
     * leaving the rest of the map unchanged.
     */
    public void mapShareTest5() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("d", "ddd");
        values.put("e", "everything");
        values.put("b", "1234");
        values.put("c", "yo");
        values.put("a", "xyz");
        Map<String, String> returnValues = Map1.mapShare(values);

        // Assert
        assertThat(returnValues.get("d"), is(equalTo("ddd")));
        assertThat(returnValues.get("e"), is(equalTo("everything")));
        assertThat(returnValues.get("b"), is(equalTo("xyz")));
        assertThat(returnValues.get("a"), is(equalTo("xyz")));
    }

    @Test
    /**
     * Given a map of food keys and their topping values
     * When key "ice cream" has a value and another key has a value of "spinach"
     * Then set the value for "ice cream" as the value for "yogurt". If "spinach" has
     * a value, then set its value to "nuts"
     */
    public void topping2Test1() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("ice cream", "cherry");
        values.put("yogurt", "cherry");
        values.put("ice cream", "cherry");
        Map<String, String> returnValues = Map1.topping2(values);

        // Assert
        assertThat(returnValues.get("yogurt"), is(equalTo("cherry")));
        assertThat(returnValues.get("ice cream"), is(equalTo("cherry")));
    }

    @Test
    /**
     * Given a map of food keys and their topping values
     * When key "ice cream" has a value and another key has a value of "spinach"
     * Then set the value for "ice cream" as the value for "yogurt". If "spinach" has
     * a value, then set its value to "nuts"
     */
    public void topping2Test2() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("spinach", "dirt");
        values.put("ice cream", "cherry");
        Map<String, String> returnValues = Map1.topping2(values);

        // Assert
        assertThat(returnValues.get("yogurt"), is(equalTo("cherry")));
        assertThat(returnValues.get("spinach"), is(equalTo("nuts")));
        assertThat(returnValues.get("ice cream"), is(equalTo("cherry")));
    }
        @Test
        /**
         * Given a map of food keys and their topping values
         * When key "ice cream" has a value and another key has a value of "spinach"
         * Then set the value for "ice cream" as the value for "yogurt". If "spinach" has
         * a value, then set its value to "nuts"
         */
        public void topping2Test3() {
            // Arrange
            Map<String, String> values = new HashMap();

            // Act
            values.put("yogurt", "salt");
            Map<String, String> returnValues = Map1.topping2(values);

            // Assert
            assertThat(returnValues.get("yogurt"), is(equalTo("salt")));
        }

    @Test
    /**
     * Given a map of food keys and their topping values
     * When key "ice cream" has a value and another key has a value of "spinach"
     * Then set the value for "ice cream" as the value for "yogurt". If "spinach" has
     * a value, then set its value to "nuts"
     */
    public void topping2Test4() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("yogurt", "salt");
        values.put("bread", "butter");
        Map<String, String> returnValues = Map1.topping2(values);

        // Assert
        assertThat(returnValues.get("yogurt"), is(equalTo("salt")));
        assertThat(returnValues.get("bread"), is(equalTo("butter")));
    }

    @Test
    /**
     * Given a map of food keys and their topping values
     * When key "ice cream" has a value and another key has a value of "spinach"
     * Then set the value for "ice cream" as the value for "yogurt". If "spinach" has
     * a value, then set its value to "nuts"
     */
    public void topping2Test5() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        Map<String, String> returnValues = Map1.topping2(values);

        // Assert
        assertThat(returnValues, is(equalTo(new HashMap())));
    }

    @Test
    /**
     * Given a map of food keys and their topping values
     * When key "ice cream" has a value and another key has a value of "spinach"
     * Then set the value for "ice cream" as the value for "yogurt". If "spinach" has
     * a value, then set its value to "nuts"
     */
    public void topping2Test6() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("salad", "oil");
        values.put("ice cream", "air");
        Map<String, String> returnValues = Map1.topping2(values);

        // Assert
        assertThat(returnValues.get("salad"), is(equalTo("oil")));
        assertThat(returnValues.get("yogurt"), is(equalTo("air")));
        assertThat(returnValues.get("ice cream"), is(equalTo("air")));
    }

    @Test
    /**
     * Given a map
     * When keys "a" and "b" are both present
     * Then append their 2 string values together and store the result under
     * the key "ab"
     */
    public void mapABTest1() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("b", "There");
        values.put("a", "Hi");
        Map<String, String> returnValues = Map1.mapAB(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("There")));
        assertThat(returnValues.get("a"), is(equalTo("Hi")));
        assertThat(returnValues.get("ab"), is(equalTo("HiThere")));
    }

    @Test
    /**
     * Given a map
     * When keys "a" and "b" are both present
     * Then append their 2 string values together and store the result under
     * the key "ab"
     */
    public void mapABTest2() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("a", "Hi");
        Map<String, String> returnValues = Map1.mapAB(values);

        // Assert
        assertThat(returnValues.get("a"), is(equalTo("Hi")));
    }

    @Test
    /**
     * Given a map
     * When keys "a" and "b" are both present
     * Then append their 2 string values together and store the result under
     * the key "ab"
     */
    public void mapABTest3() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("b", "There");
        Map<String, String> returnValues = Map1.mapAB(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("There")));
    }

    @Test
    /**
     * Given a map
     * When keys "a" and "b" are both present
     * Then append their 2 string values together and store the result under
     * the key "ab"
     */
    public void mapABTest4() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("c", "meh");
        Map<String, String> returnValues = Map1.mapAB(values);

        // Assert
        assertThat(returnValues.get("c"), is(equalTo("meh")));
    }

    @Test
    /**
     * Given a map
     * When keys "a" and "b" are both present
     * Then append their 2 string values together and store the result under
     * the key "ab"
     */
    public void mapABTest5() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("b", "bbb");
        values.put("c", "ccc");
        values.put("a", "aaa");
        values.put("ab", "nope");
        Map<String, String> returnValues = Map1.mapAB(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("bbb")));
        assertThat(returnValues.get("c"), is(equalTo("ccc")));
        assertThat(returnValues.get("a"), is(equalTo("aaa")));
        assertThat(returnValues.get("ab"), is(equalTo("aaabbb")));
    }

    @Test
    /**
     * Given a map
     * When keys "a" and "b" are both present
     * Then append their 2 string values together and store the result under
     * the key "ab"
     */
    public void mapABTest6() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("b", "bbb");
        values.put("c", "ccc");
        values.put("ab", "nope");
        Map<String, String> returnValues = Map1.mapAB(values);

        // Assert
        assertThat(returnValues.get("b"), is(equalTo("bbb")));
        assertThat(returnValues.get("c"), is(equalTo("ccc")));
        assertThat(returnValues.get("ab"), is(equalTo("nope")));
    }

    @Test
    /**
     * Given a map of food keys and topping values
     * When key "potato" has a value and key "salad" has a value
     * Then set the value for "potato" as the value for the key "fries"
     * and set the value for "salad" as the value for the key "spinach"
     */
    public void topping3Test1() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("potato", "ketchup");
        values.put("fried", "ketchup");
        values.put("potato", "ketchup");
        Map<String, String> returnValues = Map1.topping3(values);

        // Assert
        assertThat(returnValues.get("fries"), is(equalTo("ketchup")));
        assertThat(returnValues.get("potato"), is(equalTo("ketchup")));
    }

    @Test
    /**
     * Given a map of food keys and topping values
     * When key "potato" has a value and key "salad" has a value
     * Then set the value for "potato" as the value for the key "fries"
     * and set the value for "salad" as the value for the key "spinach"
     */
    public void topping3Test2() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("potato", "butter");
        values.put("fries", "butter");
        values.put("potato", "butter");
        Map<String, String> returnValues = Map1.topping3(values);

        // Assert
        assertThat(returnValues.get("fries"), is(equalTo("butter")));
        assertThat(returnValues.get("potato"), is(equalTo("butter")));
    }

    @Test
    /**
     * Given a map of food keys and topping values
     * When key "potato" has a value and key "salad" has a value
     * Then set the value for "potato" as the value for the key "fries"
     * and set the value for "salad" as the value for the key "spinach"
     */
    public void topping3Test3() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("salad", "oil");
        values.put("potato", "ketchup");
        Map<String, String> returnValues = Map1.topping3(values);

        // Assert
        assertThat(returnValues.get("salad"), is(equalTo("oil")));
        assertThat(returnValues.get("fries"), is(equalTo("ketchup")));
        assertThat(returnValues.get("spinach"), is(equalTo("oil")));
        assertThat(returnValues.get("potato"), is(equalTo("ketchup")));
    }

    @Test
    /**
     * Given a map of food keys and topping values
     * When key "potato" has a value and key "salad" has a value
     * Then set the value for "potato" as the value for the key "fries"
     * and set the value for "salad" as the value for the key "spinach"
     */
    public void topping3Test4() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("salad", "oil");
        values.put("potato", "ketchup");
        values.put("toast", "butter");
        Map<String, String> returnValues = Map1.topping3(values);

        // Assert
        assertThat(returnValues.get("salad"), is(equalTo("oil")));
        assertThat(returnValues.get("fries"), is(equalTo("ketchup")));
        assertThat(returnValues.get("spinach"), is(equalTo("oil")));
        assertThat(returnValues.get("potato"), is(equalTo("ketchup")));
        assertThat(returnValues.get("toast"), is(equalTo("butter")));
    }

    @Test
    /**
     * Given a map of food keys and topping values
     * When key "potato" has a value and key "salad" has a value
     * Then set the value for "potato" as the value for the key "fries"
     * and set the value for "salad" as the value for the key "spinach"
     */
    public void topping3Test5() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        // empty map
        Map<String, String> returnValues = Map1.topping3(values);

        // Assert
        assertThat(returnValues, is(equalTo(new HashMap())));
    }
    @Test
    /**
     * Given a map of food keys and topping values
     * When key "potato" has a value and key "salad" has a value
     * Then set the value for "potato" as the value for the key "fries"
     * and set the value for "salad" as the value for the key "spinach"
     */
    public void topping3Test6() {
        // Arrange
        Map<String, String> values = new HashMap();

        // Act
        values.put("salad", "pepper");
        values.put("fries", "salt");
        Map<String, String> returnValues = Map1.topping3(values);

        // Assert
        assertThat(returnValues.get("salad"), is(equalTo("pepper")));
        assertThat(returnValues.get("fries"), is(equalTo("salt")));
        assertThat(returnValues.get("spinach"), is(equalTo("pepper")));
    }
}
