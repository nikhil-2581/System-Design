package com.cryptic.concepts.template;

import java.io.Serializable;

public class NeuralNetworkModel extends ModelTrainer {


    @Override
    public void prepareData() {
        System.out.println("Preparing data for NeuralNetworkModel");
    }

    @Override
    public void trainModel() {
        System.out.println("Training data for NeuralNetworkModel");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating data for NeuralNetworkModel");
    }
}
