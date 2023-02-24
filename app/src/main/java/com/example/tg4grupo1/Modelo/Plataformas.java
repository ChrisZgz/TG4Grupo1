package com.example.tg4grupo1.Modelo;

public class Plataformas {
    private boolean windows;
    private boolean mac;
    private boolean linux;

    public Plataformas(boolean windows, boolean mac, boolean linux) {
        this.windows = windows;
        this.mac = mac;
        this.linux = linux;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean isMac() {
        return mac;
    }

    public void setMac(boolean mac) {
        this.mac = mac;
    }

    public boolean isLinux() {
        return linux;
    }

    public void setLinux(boolean linux) {
        this.linux = linux;
    }

    @Override
    public String toString() {
        String plat = "";
        if(isWindows()){
            plat += "Windows, ";
        }if(isMac()){
            plat += "Mac, ";
        }if(isLinux()){
            plat += "Linx, ";
        }
        return plat;
    }
}
