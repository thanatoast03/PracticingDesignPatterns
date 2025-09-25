package Structural.Decorator;

public class Language extends VideoDecorator {
    private String language;
    public Language(Video video, String language) {
        super(video);
        this.language = language;
    }

    @Override
    public String getDescription() {
        return video.getDescription() + ", " + language;
    }
}
