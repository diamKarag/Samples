/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.validationannotation;

/**
 *
 * @author kdiam
 */
public class Main {

    @NullCheck
    public static String pojo;

    @NullCheck
    public static String ll;

    @NullCheck
    public static Integer la;

    public static void main(String[] args) {
        get();
    }

    public static boolean get() {
        pojo = "a";
        ll = null;
        la = 1;
        NullCheckParser.getInstance(Main.class);
        NullCheckParser.getInstance(Pojo.class);
        return false;
    }

}
