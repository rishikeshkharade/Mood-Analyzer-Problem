import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {
    @Test
    void HappyOrSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String result = moodAnalyzer.analyseMood();
        assertEquals("SAD",result);
    }
}
