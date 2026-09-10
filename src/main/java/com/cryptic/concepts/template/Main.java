package com.cryptic.concepts.template;

//client code
public class Main {
    public static void main(String[] args) {
        ModelTrainer nnm = new NeuralNetworkModel();
        nnm.template("Netural Network Model Path");

        System.out.println("------------");

        ModelTrainer svm = new SVMModel();
        svm.template("SVM Network Model Path");

    }
}
