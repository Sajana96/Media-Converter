/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaconverter;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Sajana
 */
public class Config {
    public static String getSource(){
        try {
            InputStream input = new FileInputStream("config.properties") ;
              Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty("source");
        } catch (Exception e) {
        }
        return null;
    }
    public static String getDestination(){
        try {
            InputStream input = new FileInputStream("config.properties") ;
              Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty("destination");
        } catch (Exception e) {
            return null;
        }
        
    }
}
