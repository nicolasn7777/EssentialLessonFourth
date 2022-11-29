package task_playable_recordable;

public class Main {
    public static void main(String[] args) {

        IPlayable player = new Player();
        IPlayable recorder = new Player();

        System.out.println("Recorder can:");
        recorder.play();
        recorder.pause();
        recorder.stop();
        System.out.println();

        System.out.println("Player can:");
        player.play();
        player.pause();
        player.stop();

    }
}
