package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Video video = new YoutubeVideo();
        System.out.println(video.getDescription());

        VideoDecorator res = new Resolution(video, "360p");
        System.out.println(res.getDescription());

        VideoDecorator pbspd = new PlaybackSpeed(res, "2x");
        System.out.println(pbspd.getDescription());

        VideoDecorator language = new Language(pbspd, "English");
        System.out.println(language.getDescription());
    }
}
