class MoodAnalyzerException extends Exception{
    public MoodAnalyzerException(String message){
        super(message);
    }
}
public class MoodAnalyzer {
    private String mood;

    public MoodAnalyzer() {
        mood = null;
    }

    public MoodAnalyzer(String mood) {
        this.mood = mood;
    }

    public String analyseMood() throws MoodAnalyzerException {
        if (mood == null)
            return "Happy";

        if(mood.isEmpty())
            throw new MoodAnalyzerException("Mood cannot be empty");

        if (mood.toLowerCase().contains("happy")) {
            return "SAD";
        } else if (mood.toLowerCase().contains("sad")) {
            return "SAD";
        } else if (mood.toLowerCase().contains("any")) {
            return "HAPPY";
    } else {
            throw new MoodAnalyzerException("Invalid Mood");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");

        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("Happy Mood");
        try {
            System.out.println("Mood: " + moodAnalyzer1.analyseMood());
        } catch (MoodAnalyzerException e) {
            System.out.println("Exception: "+e.getMessage());
        }

        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("Sad Mood");
        try {
            System.out.println("Mood: " + moodAnalyzer2.analyseMood());
        } catch (MoodAnalyzerException e) {
            System.out.println("Exception: "+ e.getMessage());
        }

        MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer("");
        try {
            System.out.println("Mood: " + moodAnalyzer3.analyseMood());
        } catch (MoodAnalyzerException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        MoodAnalyzer moodAnalyzer4 = new MoodAnalyzer();
        try {
            System.out.println("Mood: "+ moodAnalyzer4.analyseMood());
        }catch (MoodAnalyzerException e){
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}