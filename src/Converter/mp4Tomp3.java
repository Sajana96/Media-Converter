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
public class mp4Tomp3 implements Converter{
    File file;
    Subscriber subscriber;
    public mp4Tomp3(File file, Subscriber subscriber){
        this.file=file;
        this.subscriber = subscriber;
    }
    @Override
    public void convert(Converter converter) {
        System.out.println("converted mp4 to mp3 "+file.toString());
        file.delete();
        System.out.println("File Deleted");
         subscriber.unSubscribe(converter);
        System.out.println("Unsubsribed");
    }
    
}
