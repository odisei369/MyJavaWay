package com.piatr.NonAccessModifiers;


public class StaticVariable {

    private static int numInstances = 0;

    private static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    private StaticVariable() {
        StaticVariable.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " +
                StaticVariable.getCount() + " instances");
        for (int i = 0; i < 500; ++i){
            new StaticVariable();
        }
        System.out.println("Created " +
                StaticVariable.getCount() + " instances");
    }
}
