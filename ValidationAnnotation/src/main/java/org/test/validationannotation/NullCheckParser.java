/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.validationannotation;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kdiam
 */
public class NullCheckParser {

    private static NullCheckParser VALIDATE_PARSER;

    public static NullCheckParser getInstance(Class tclazz) {
        if (VALIDATE_PARSER == null || clazz == null || !tclazz.getName().equals(clazz.getName())) {
            VALIDATE_PARSER = new NullCheckParser(clazz);
        }
        return VALIDATE_PARSER;
    }
    private static Class clazz;

    private NullCheckParser(Class aClass) {
        clazz = aClass;
        checkType();
    }

    private boolean checkType() {
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NullCheck.class)) {
                try {
                    if (field.get(field.getType()) != null) {
                        log(field.get(field.getType()));
                    } else {
                        System.out.println("LLLLL");
                    }
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(NullCheckParser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }

    private void log(Object a) {
        System.out.println("LA " + a);
    }
}
