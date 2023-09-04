/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author duh_b
 */
public class Program {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        String path = "C:\\in.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String name = br.readLine();
            while (name != null) {
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }
        
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
