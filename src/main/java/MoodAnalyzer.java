enum MoodError{
    Null_Mood("Mood cannot be null"),
    Empty_Mood("Mood cannot be empty"),
    Invalid_Mood("Invalid mood input");

    private final String message;

    MoodError(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}

class MoodAnalyzerException extends Exception{
    public MoodAnalyzerException(MoodError error){
        super(error.getMessage());
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
            throw new MoodAnalyzerException(MoodError.Null_Mood);

        if(mood.isEmpty())
            throw new MoodAnalyzerException(MoodError.Empty_Mood);

        if (mood.toLowerCase().contains("happy")) {
            return "SAD";
        } else if (mood.toLowerCase().contains("sad")) {
            return "SAD";
        } else if (mood.toLowerCase().contains("any")) {
            return "HAPPY";
    } else {
            throw new MoodAnalyzerException(MoodError.Invalid_Mood);
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

        MoodAnalyzer moodAnalyzer5 = new MoodAnalyzer("Angry Mood");
        try{
            System.out.println("Mood: "+ moodAnalyzer5.analyseMood());
        }catch (MoodAnalyzerException e){
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}