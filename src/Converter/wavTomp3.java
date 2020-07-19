/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import mediaconverter.Config;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Malmi
 */
public class wavTomp3 implements Converter{
    File file;
    Subscriber subscriber;
    public wavTomp3(File file, Subscriber subscriber){
        this.file=file;
        this.subscriber = subscriber;
    }
    @Override
    public void convert(Converter converter) {
        try {
            File source = this.file;
            String fileName = source.getName();
            String name = FilenameUtils.removeExtension(fileName);
            File target = new File(Config.getDestination()+"/Media-converted/wavTomp3-converted/" + name + ".mp3");
            
            //Audio Attributes
            AudioAttributes audio = new AudioAttributes();
            audio.setCodec("libmp3lame");
            audio.setBitRate(128000);
            audio.setChannels(2);
            audio.setSamplingRate(44100);
            
            //Encoding attributes
            EncodingAttributes attrs = new EncodingAttributes();
            attrs.setFormat("mp3");
            attrs.setAudioAttributes(audio);
            
            //Encode
            Encoder encoder = new Encoder();
            encoder.encode(source, target, attrs);
            
            System.out.println("Conversion Type:- wav to mp3");
            System.out.println("converted wav to mp3 "+file.toString());
            System.out.println("Converted file moved to "+target.toPath().toString());
            file.delete();
            System.out.println("File Deleted from source directory");
            subscriber.unSubscribe(converter);
            System.out.println("Unsubsribed\n");
        } catch (Exception ex) {                                      
 ex.printStackTrace();                                                                                 
}
    }
    
}
