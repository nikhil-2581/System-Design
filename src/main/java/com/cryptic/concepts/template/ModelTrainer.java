package com.cryptic.concepts.template;

public abstract class ModelTrainer {

    public void load(String path){
        System.out.println("[Common] Loading "+path);
    }

    public abstract void prepareData();
    public abstract void trainModel();
    public abstract void evaluate();

    public void save(){
        System.out.println("[Common] Saving done");
    }

    public final void template(String path){
        // provides template for child classes, which cannot be changed by child class
        // child class must follow the template
        load(path);
        prepareData();
        trainModel();
        evaluate();
        save();
    }

}
