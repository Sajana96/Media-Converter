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
        Subscriber subscriber = new Subscriber();
        String dirName = Config.getSource();
      

           
        
        try {
            
            System.out.println(Config.getSource());
            System.out.println(Config.getDestination());
       while(true){
                //Getting files from the target folder to an object array of File type
            List<File> filesInFolder = Files.walk(Paths.get(dirName))
                                .filter(Files::isRegularFile)
                                .map(Path::toFile)
                                .collect(Collectors.toList());
            //If the array is not empty 
            if(!filesInFolder.isEmpty()){
                //for each object in object array
                for(File file:filesInFolder){
                    //get the directory name
                String[] name = file.toString().split("\\\\");
               
               //intializing converter objects based to directory names using factory method
               //passing the subsriber object and file object when initiation
                Converter converter = factory.getInstance(name[name.length-2],file,subscriber);
                  
            
            
                //    Runnable c = new Subscriber(converter); 
                //            new Thread(c).start();
                
                //each converter object is subscribed to subscriber list
                subscriber.subscribe(converter);    
        }}
                //invoke convert method for all the objects in subsriber list
                //Unsubsription happen from each object 
                //Once the subsriber list is empty it will keep listening to any object passed to it to perform converson
            subscriber.convertSubscribers();}
            
         }
//         
           
           
        catch (Exception e) {
            e.printStackTrace(); 
              
            // Prints what exception has been thrown 
            System.out.println(e); 
        }
    }
    
}
