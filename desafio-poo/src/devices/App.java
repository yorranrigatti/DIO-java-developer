package devices;

import devices.models.Iphone;

public class App {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    iphone.playMusic();
    iphone.pauseMusic();
    iphone.selectSong("Major RD - Corporação capsula");

    iphone.showPage();
    iphone.addNewPage();
    iphone.reloadPage();

    iphone.call();
    iphone.answerCall();
    iphone.playVoiceMail();
  }
}
