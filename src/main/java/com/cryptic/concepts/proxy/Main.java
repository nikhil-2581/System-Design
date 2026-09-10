package com.cryptic.concepts.proxy;

//Client code
public class Main {
    public static void main(String[] args) {

        String path = "images/img";

        ProxyImageDisplay proxy = new ProxyImageDisplay(path);
        proxy.display();
    }
}
