package ityzostanbeethovenem;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Player {

    public String path;

    public Player() {
        path = "sounds\\piano\\";
    }

    public void play(String note) {
        InputStream iAudio;
        try {
            iAudio = new FileInputStream(new File(path + note + ".wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
