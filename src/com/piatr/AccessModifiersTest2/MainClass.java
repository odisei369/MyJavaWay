package com.piatr.AccessModifiersTest2;
import com.piatr.AccessModifiersTest1.*;

public class MainClass {
    public static void main(String[] args) {
        /* We can only create public class from other package
        * We can use only public variables and methods in object of class from other package
         */
        System.out.println("We can use next variables:");
        PublicAccessClass pac = new PublicAccessClass();

        System.out.println(pac.abc1);

        ClassWithoutAccessModifierSamePackage cwamsp = new ClassWithoutAccessModifierSamePackage();

        System.out.println(cwamsp.abc1);
        System.out.println(cwamsp.abc3);
        System.out.println(cwamsp.abc4);

    }
}
