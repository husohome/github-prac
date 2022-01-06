/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collab01.storycategory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Timothy
 */
public class ViolentStory implements IStory {

    @Override
    public void readStory(String name) throws IOException {

        File file = getStoryRoot();
        String storyLocation = file.toString().concat("/" + name + ".txt");
        try ( FileReader fr = new FileReader(storyLocation);
                BufferedReader br = new BufferedReader(fr)) {
            String storyLine = br.readLine();
            while (storyLine != null) {
                System.out.println(storyLine);
                storyLine = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
            throw new IOException("故事不存在");
        }
    }

    @Override
    public String findStory() throws IOException {
        Files.list(Paths.get("storylib/violent")).forEach(System.out::println);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    @Override
    public File getStoryRoot() {
        File file = new File("storylib/violent");
        return file;
    }

}
