package Structural.Decorator;

public class Resolution extends VideoDecorator {
    private String resolution;

    public Resolution(Video video, String resolution) {
        super(video);
        this.resolution = resolution;
    }

    @Override
    public String getDescription() {
        return video.getDescription() + ", " + resolution + " resolution";
    }
}
