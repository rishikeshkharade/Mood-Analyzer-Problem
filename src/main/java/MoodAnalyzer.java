public class MoodAnalyzer {
        private String mood;

        public MoodAnalyzer(){
            mood = "Happy";
        }

        public MoodAnalyzer(String mood){
            this.mood=mood;
        }

        public String analyseMood(){
            if (mood==null|| mood.isEmpty())
                return "Neutral";

            if (mood.toLowerCase().contains("happy")){
                return "Happy";
            } else if (mood.toLowerCase().contains("sad")) {
                return "SAD";
            }else {
                return "HAPPY";
            }
        }

        public static void main(String[] args) {
            System.out.println("Welcome to Mood Analyser Problem");

            MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("Happy Mood");
            System.out.println("Mood: "+moodAnalyzer1.analyseMood());

            MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("Sad Mood");
            System.out.println("Mood: "+moodAnalyzer2.analyseMood());

            MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer("");
            System.out.println("Mood: "+moodAnalyzer3.analyseMood());
        }
    }