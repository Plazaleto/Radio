package ru.netology.domain;

public class Radio {
    private  int maxVolume = 100;
    private  int minRadioStation = 0;
    private int currentVolume;
    private int currentRadioStation;
    private int radioStationAmount ;
    private  int maxRadioStation ;

    public Radio(int radioStationAmount) {
        this.radioStationAmount = radioStationAmount;
        maxRadioStation = radioStationAmount - 1;
    }

    public Radio() {
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int getRadioStationAmount() {
        return radioStationAmount;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseRadioStationNumber() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void decreaseRadioStationNumber() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

}
