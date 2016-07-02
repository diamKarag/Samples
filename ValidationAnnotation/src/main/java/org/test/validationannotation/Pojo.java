/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.validationannotation;

import java.io.Serializable;

/**
 *
 * @author kdiam
 */
public class Pojo implements Serializable {

    @NullCheck
    public String tt;

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

}
