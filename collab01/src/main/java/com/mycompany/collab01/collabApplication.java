/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.collab01;

import com.mycompany.collab01.myexception.TooYoungException;
import com.mycompany.collab01.storycategory.HappyStory;
import com.mycompany.collab01.storycategory.IStory;
import com.mycompany.collab01.storycategory.SadStory;
import com.mycompany.collab01.storycategory.ViolentStory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class collabApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Application Start!");
        Scanner sc = new Scanner(System.in);
        String action = null;        
        String storylist = null;
        IStory story;       
        do {
            System.out.println("Enter [H]appy | [S]ad | [V]iolent | [Q]uit");
            action = sc.nextLine();
            try {
                switch (action.toUpperCase().charAt(0)) {
                    case 'H':
                        story = new HappyStory();                        
                        storylist = story.findStory();
                        story.readStory(storylist);
                        break;
                    case 'S':
                        story = new SadStory();
                        storylist = story.findStory();
                        story.readStory(storylist);                        
                        break;
                    case 'V':
                        story = new ViolentStory();
                        //這邊加入有無18歲的判斷式                        
                        storylist = story.findStory();
                        story.readStory(storylist);
                        break;
                }
            } catch (TooYoungException se) {
                System.err.println(se.getMessage());
            } catch (IOException ie){
                
            }

        } while (!action.equalsIgnoreCase("Q"));

        System.out.println();
        System.out.println("Application End!");
    }

}
