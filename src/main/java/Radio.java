public class Radio {

    private int currentRadio;
    private int currentVolume;



    private int quantityRadio = 10;

    public Radio(int quantityRadio) {

        this.quantityRadio = quantityRadio;
    }

    public Radio() {

        this.quantityRadio = getQuantityRadio();
    }

    public void setQuantityRadio(int quantityRadio) {

        this.quantityRadio = quantityRadio;
    }

    public int getCurrentRadio() {

        return currentRadio;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getQuantityRadio() {
        return quantityRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > quantityRadio) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void nextStation() {
        if (currentRadio == quantityRadio-1) {
            currentRadio = 0;
        } else {
            currentRadio = currentRadio + 1;
        }
    }

    public void prevStation() {
        if (currentRadio == 0) {
            currentRadio = quantityRadio-1;
        } else {
            currentRadio = currentRadio - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}