package behaviour_learning.state;

public interface PlayerState {
    void play(MediaPlayer context);
    void pause(MediaPlayer context);
    void stop(MediaPlayer context);
}

class PlayingState implements PlayerState {

    @Override
    public void play(MediaPlayer context) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(MediaPlayer context) {
        System.out.println("Pausing the player.");
        context.setState(new PausedState());
    }

    @Override
    public void stop(MediaPlayer context) {
        System.out.println("Stopping the player.");
        context.setState(new StoppedState());
    }
}

class PausedState implements PlayerState {
    @Override
    public void play(MediaPlayer context) {
        System.out.println("Resuming the player.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer context) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(MediaPlayer context) {
        System.out.println("Stopping the player.");
        context.setState(new StoppedState());
    }
}


class StoppedState implements PlayerState {
    @Override
    public void play(MediaPlayer context) {
        System.out.println("Starting the player.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer context) {
        System.out.println("Player is stopped. Cannot pause.");
    }

    @Override
    public void stop(MediaPlayer context) {
        System.out.println("Already stopped.");
    }
}
