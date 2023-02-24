package com.example.tg4grupo1.Modelo;

public class Plataformas {
    private boolean Windows;
    private boolean Mac;
    private boolean Linux;

    public Plataformas(boolean windows, boolean mac, boolean linux) {
        Windows = windows;
        Mac = mac;
        Linux = linux;
    }

    public boolean isWindows() {
        return Windows;
    }

    public void setWindows(boolean windows) {
        Windows = windows;
    }

    public boolean isMac() {
        return Mac;
    }

    public void setMac(boolean mac) {
        Mac = mac;
    }

    public boolean isLinux() {
        return Linux;
    }

    public void setLinux(boolean linux) {
        Linux = linux;
    }
}
