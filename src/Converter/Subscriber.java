/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Malmi
 */
public class Subscriber {
    
    List<Converter> converterList = new ArrayList<>();
    
    public void subscribe(Converter converter){
        converterList.add(converter);
    }
    
    public void unSubscribe(Converter converter){
        converterList.remove(converter);
    }
}
