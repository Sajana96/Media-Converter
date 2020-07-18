/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import java.io.File;

/**
 *
 * @author Sajana
 */
public class mp4Toflv implements Converter{
    File file;
    public mp4Toflv(File file){
        this.file=file;
    }
    @Override
    public void convert() {
        System.out.println("converted mp4 to flv "+file.toString());
    }
}
