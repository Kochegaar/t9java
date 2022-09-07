import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void quantityRadio() {
        Radio radio = new Radio(20);
        radio.setCurrentRadio(15);
        int expected = 15;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void quantityStandardRadio() {
        Radio radio = new Radio();
        int actual = 10;
        int expected = radio.getQuantityRadio();

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetCurrentMaxRadio() {
        Radio radio = new Radio(20);
        radio.setCurrentRadio(20);
        int expected = 20;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMinRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNonExistentMaxRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(11);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNonExistentMinRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMaxStationRadio() {
        Radio radio = new Radio(20);
        radio.setCurrentRadio(9);
        radio.nextStation();
        int expected = 10;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationRadio() {
        Radio radio = new Radio(20);
        radio.setCurrentRadio(19);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinStationRadio() {
        Radio radio = new Radio(20);
        radio.setCurrentRadio(0);
        radio.prevStation();
        int expected = 19;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationRadio() {
        Radio radio = new Radio(20);
        radio.setCurrentRadio(0);
        radio.prevStation();
        int expected = 19;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNonExistentMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNonExistentMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
    }
}