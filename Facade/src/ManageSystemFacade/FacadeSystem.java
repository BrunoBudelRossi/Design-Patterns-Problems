package ManageSystemFacade;

public class FacadeSystem {
    protected AudioSystem audio;
    protected VideoSystem video;

    public void initSubsystem() {
        video = new VideoSystem();
        video.colorConfig();
        video.resolutionConfig();

        audio = new AudioSystem();
        audio.channelsConfig();
        audio.frequencyConfig();
        audio.volumeConfig();
    }

    public void playAudio(String file) {
        audio.playAudio(file);
    }

    public void renderImg(String img) {
        video.renderImg(img);
    }

}
