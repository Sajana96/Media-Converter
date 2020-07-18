/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author Malmi
 */
public class Subscriber implements Runnable {
    
    List<Converter> converterList = new CopyOnWriteArrayList<Converter>();
    
    Converter converter;
    
//    public Subscriber(Converter converter){
//        this.converter = converter;
//    }
    
    public void subscribe(Converter converter){
        converterList.add(converter);
    }
    
    public void unSubscribe(Converter converter){
        converterList.remove(converter);
    }
    
    @Override
    public void run(){
        boolean valid = true;
        while(valid) {
            //converterList.add(this.converter);
//            for(Converter converter : converterList){
//            converter.convert();
//        }
            //converter.convert();
        }
    }
    
    public void convertSubscribers(){
        for(Converter converter : converterList){
            converter.convert(converter);
        }
    }
}
