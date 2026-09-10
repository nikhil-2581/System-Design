package com.cryptic.concepts.proxy;

public class ProxyImageDisplay implements ImageDisplay {

    String path;

    public ProxyImageDisplay(String path) {
        this.path = path;
        System.out.println("ProxyImageDisplay constructor called");
    }

    private ImageDisplayConcrete imageDisplayConcrete = null;

    @Override
    public void display() {
        if (imageDisplayConcrete == null) {
            ImageDisplayConcrete idc = new ImageDisplayConcrete(this.path);
            idc.display();
        }
    }
}
