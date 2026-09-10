package com.cryptic.concepts.template;

public class SVMModel extends ModelTrainer {
    @Override
    public void prepareData() {
        System.out.println("Preparing SVM Model...");
    }

    @Override
    public void trainModel() {
        System.out.println("Training SVM Model...");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating SVM Model...");
    }

    @Override
    public void save() {
        System.out.println("Saving SVM Model...");
    }
}
