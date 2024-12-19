import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {
    @Test
    void HappyOrSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String result = moodAnalyzer.analyseMood();
        assertEquals("SAD",result);
    }

    @Test
    void Mood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        assertEquals("HAPPY",moodAnalyzer.analyseMood());
    }

    @Test
    void HappyMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        assertEquals("SAD",moodAnalyzer.analyseMood());
    }
}
