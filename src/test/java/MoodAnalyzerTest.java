import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {
    @Test
    void HappyOrSad() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String result = moodAnalyzer.analyseMood();
        assertEquals("SAD",result);
    }

    @Test
    void Mood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        assertEquals("HAPPY",moodAnalyzer.analyseMood());
    }

    @Test
    void HappyMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        assertEquals("SAD",moodAnalyzer.analyseMood());
    }

    @Test
    void NullScenario() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            assertEquals("Happy",moodAnalyzer.analyseMood());
        } catch (MoodAnalyzerException e) {
            System.out.println("Mood: "+ e.getMessage());
        }
    }

    @Test
            void InvalidMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Angry Mood");
        try {
            assertEquals("Invalid Mood", moodAnalyzer.analyseMood());
        } catch(MoodAnalyzerException e){
            System.out.println("Mood: "+e.getMessage());
        }
    }
}

