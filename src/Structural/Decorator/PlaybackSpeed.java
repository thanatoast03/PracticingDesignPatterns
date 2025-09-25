package Structural.Decorator;

public class PlaybackSpeed extends VideoDecorator {
    private String speed;

    public PlaybackSpeed(Video video, String speed) {
        super(video);
        this.speed = speed;
    }

    @Override
    public String getDescription() {
        return video.getDescription() + ", " + speed + " speed";
    }
}
