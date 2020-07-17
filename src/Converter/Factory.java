/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

/**
 *
 * @author Sajana
 */
public class Factory {
    public Converter getInstance(String type){
    if("mp4Tomp3".equals(type)) return new mp4Tomp3();
    if("mp4Toflv".equals(type)) return new mp4Toflv();
    if("mp4Tomkv".equals(type)) return new mp4Tomkv();
    
    return null;
    }
}
