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
public class Factory {
    public Converter getInstance(String type, File file, Subscriber subscriber){
        //sorting
    if("mp4Tomp3".equals(type)) return new mp4Tomp3(file,subscriber);
    if("mp4Toflv".equals(type)) return new mp4Toflv(file,subscriber);
    if("mp4Tomkv".equals(type)) return new mp4Tomkv(file,subscriber);
    if("wavTomp3".equals(type)) return new wavTomp3(file, subscriber);
    
    return null;
    }
}
