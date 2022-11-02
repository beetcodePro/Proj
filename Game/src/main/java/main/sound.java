package main;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sound {
    Clip clip;
    URL soundURL[]= new URL[30];

    public sound()
    {
        soundURL[0]=getClass().getResource("/sound/Minion_Ahahaha.wav");
        soundURL[1]=getClass().getResource("/sound/Minion_Apple.wav");
        soundURL[2]=getClass().getResource("/sound/Minion_Banana.wav");
        soundURL[3]=getClass().getResource("/sound/Minion_Scream.wav");

    }
    public void setFile(int x)
    {
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[x]);
            clip= AudioSystem.getClip();
            clip.open(ais);

        }catch(Exception e){

        }

    }
    public void play()
    {
        clip.start();
    }
    public void loop()
    {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop()
    {
        clip.stop();
    }
}
