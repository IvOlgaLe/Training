package longest_word;

import org.junit.*;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LongestWordTest {
    @Test
    public void getLengthTest() {
        LongestWord longestWordObject = new LongestWord();
        String sentence = "One two three  four five  six";
        HashMap<String, Object> result = longestWordObject.getResult(sentence);
        assertNotNull(result);
        assertEquals(sentence, result.get("sentence"));
        assertEquals(6, result.get("sentenceLength"));
        assertEquals("three", result.get("theLongestWord"));
        assertEquals(5, result.get("maxLength"));
    }
}
