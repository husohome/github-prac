/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collab01.storycategory;

import com.mycompany.collab01.myexception.TooYoungException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nathan
 */
public class ViolentStory implements IStory{
    
    @Override
    public void readStory(String name) throws TooYoungException{
        try{
            File file = getStory();
            String storyLocation = file.toString().concat("/"+name+".txt");
            try(FileReader fr = new FileReader(storyLocation);
                    BufferedReader br = new BufferedReader(fr)){
                String storyLine = br.readLine();
                while(storyLine != null){
                    System.out.println(storyLine);
                    storyLine = br.readLine();
                }
            }catch(IOException e){
                throw new IOException("故事不存在");
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public String findStory() throws IOException{
        Files.list(Paths.get("storylib/violent")).forEach(System.out::println);        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
    
    @Override
    public File getStory() throws IOException{
        File file = new File("storylib/violent");
        return file;
    }
    
}
