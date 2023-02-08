package devices.models;

import devices.interfaces.Cellphone;
import devices.interfaces.InternetBrowser;
import devices.interfaces.MusicPlayer;

public class Iphone implements Cellphone, InternetBrowser, MusicPlayer {

  public void playMusic() {
    System.out.println("Playing music");
  }

  public void pauseMusic() {
    System.out.println("Music paused");
  }

  public void selectSong(String song) {
    System.out.printf("Now playing %s%n", song);
  }

  public void showPage() {
    System.out.println("Showing page");
  }

  public void addNewPage() {
    System.out.println("New page added");
  }

  public void reloadPage() {
    System.out.println("Page reloaded");
  }

  public void call() {
    System.out.println("Calling");
  }

  public void answerCall() {
    System.out.println("Answering call");
  }

  public void playVoiceMail() {
    System.out.println("Playing voice mail");
  }
}
