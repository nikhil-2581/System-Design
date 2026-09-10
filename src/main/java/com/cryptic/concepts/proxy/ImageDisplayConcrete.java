package com.cryptic.concepts.proxy;

public class ImageDisplayConcrete implements ImageDisplay {

    String path;

    public ImageDisplayConcrete(String path) {
        //loading the properties
        this.path = path;
        System.out.println("ImageDisplayConcrete constructor called");
        System.out.println("Loading the properties");
    }

    @Override
    public void display() {
        System.out.println("Image is displayed @" + path);
    }
}
