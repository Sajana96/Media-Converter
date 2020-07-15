/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaconverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        
       
        String dirName = "E:/Sajana/UOK/IPT/Media";
        try {
            
//            Files.walk(Paths.get(dirName))
//            .filter(Files::isDirectory)
//            .forEach(System.out::println);
            //Lis
            List<File> filesInFolder = Files.walk(Paths.get(dirName))
                                .filter(Files::isRegularFile)
                                .map(Path::toFile)
                                .collect(Collectors.toList());
            for(File file:filesInFolder){
            System.out.println(file);
        }
        } 
        catch (Exception e) {
            e.printStackTrace(); 
              
            // Prints what exception has been thrown 
            System.out.println(e); 
        }
    }
    
}
