package behaviour_learning.state;

public class MediaPlayer {
    private PlayerState state;

    public MediaPlayer() {
        this.state = new StoppedState();
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }


}
