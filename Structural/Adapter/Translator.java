public class Translator extends VietnameseSpeaker {
    private EnglishSpeaker englishSpeaker;

    public Translator(EnglishSpeaker englishSpeaker) {
        this.englishSpeaker = englishSpeaker;
    }

    @Override
    public void say() {
        englishSpeaker.say();
    }
}
