import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void SetCurrent() {
        Radio Station = new Radio();


        int expected = 0;
        int actual = Station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void set1radio() {
        Radio radio = new Radio();
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void set2radio() {
        Radio radio = new Radio();
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void prevradio() {
        Radio radio = new Radio();
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void nextradio() {
        Radio radio = new Radio();
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void prev1radio() {
        Radio radio = new Radio();
        int currentRadioStation = 1;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void next1radio() {
        Radio radio = new Radio();
        int currentRadioStation = 8;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void setvol() {
        Radio radio = new Radio();
        int volume = 11;
        radio.setVolume(volume);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void setvol1() {
        Radio radio = new Radio();
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void dsetvol() {
        Radio radio = new Radio();
        int volume = 10;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 10;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void dsetvol1() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());

    }


    @Test
    void volplus() {
        Radio radio = new Radio();
        int volume = 8;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void volminus() {
        Radio radio = new Radio();
        int volume = 7;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getVolume());

    }
}