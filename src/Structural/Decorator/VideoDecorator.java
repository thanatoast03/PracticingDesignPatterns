package Structural.Decorator;

abstract public class VideoDecorator implements Video {
    protected Video video;
    public VideoDecorator(Video video) {
        this.video = video;
    }

    @Override
    public String getDescription() {
        return "Generic Video";
    }
}
