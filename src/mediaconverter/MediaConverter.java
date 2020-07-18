/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaconverter;

import Converter.Converter;
import Converter.Factory;
import Converter.Subscriber;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 *
 * @author Sajana
 */
public class MediaConverter {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        
        Factory factory = new Factory();
        
       
        String dirName = "D:/Malmi/UOK/IPT/Media";
        try {
            
//            
            //Listing files to list array
            List<File> filesInFolder = Files.walk(Paths.get(dirName))
                                .filter(Files::isRegularFile)
                                .map(Path::toFile)
                                .collect(Collectors.toList());
            for(File file:filesInFolder){
                String[] name = file.toString().split("\\\\");
               
            System.out.println(name[name.length-2]);
            Converter converter = factory.getInstance(name[name.length-2]);
            //converter.convert();
            
            Runnable c = new Subscriber(converter); 
            new Thread(c).start();
        }
        } 
        catch (Exception e) {
            e.printStackTrace(); 
              
            // Prints what exception has been thrown 
            System.out.println(e); 
        }
    }
    
}
