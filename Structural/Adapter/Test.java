public class Test {
    public static void main(String[] args) {
        VietnameseSpeaker vietnameseSpeaker = new VietnameseSpeaker();
        EnglishSpeaker englishSpeaker = new EnglishSpeaker();
        Translator translator = new Translator(englishSpeaker);

        vietnameseSpeaker.say();
        englishSpeaker.say();
        translator.say();
    }
}
