import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RadioTest {

    @Test
    void SetCurrentRadioStation () {
        Radio radio = new Radio(10, 10,40,100);
        int expected = 10;
        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void SetCurrentRadioStationMin () {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 10;
        assertEquals(expected, radio.getCurrentRadioStation());

    }
    @Test
    void SetCurrentRadioStationMax () {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = 11;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 10;
        assertEquals(expected, radio.getCurrentRadioStation());

    }
    @Test
    void ChangeOnPreviousRadioStationMin() {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        int expected = 10;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void ChangeOnNextRadioStationMax() {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void ChangePreviouStation() {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = 1;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void ChangeNextStation() {
        Radio radio = new Radio(10,10,40,100);
        int currentRadioStation = 8;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void VolumeMax() {
        Radio radio = new Radio(10,10,100,100);
        int volume = 101;
        radio.setVolume(volume);
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void VolumeMin() {
        Radio radio = new Radio(10,10,0,100);
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void VolumeMax1() {
        Radio radio = new Radio(10,10,40,100);
        int volume = 100;
        radio.setVolume(volume);
        radio.volumePlus();
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void VolumeMin1() {
        Radio radio = new Radio(10,10,40,100);
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeMinus();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeUpForOne() {
        Radio radio = new Radio(10,10,40,100);
        int volume = 8;
        radio.setVolume(volume);
        radio.volumePlus();
        int expected = 9;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio(10,10,40,100);
        int volume = 7;
        radio.setVolume(volume);
        radio.volumeMinus();
        int expected = 6;
        assertEquals(expected, radio.getVolume());
    }
}