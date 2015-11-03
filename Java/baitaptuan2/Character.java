/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nguye_000
 */
public class Character {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        String [] arr=s.split("");
        
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(String x: arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
