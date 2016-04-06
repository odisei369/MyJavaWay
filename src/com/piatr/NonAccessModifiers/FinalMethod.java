package com.piatr.NonAccessModifiers;


public class FinalMethod {
    private static String name;
    protected final void changeName(String name){
        FinalMethod.name = name;
    }

    public static void main(String[] args) {
        FinalMethodExtension fme = new FinalMethodExtension();
        fme.changeName("abc");
        System.out.println(FinalMethod.name);
    }
}

class FinalMethodExtension extends FinalMethod{
    // You can't override method changeName because it's private
}