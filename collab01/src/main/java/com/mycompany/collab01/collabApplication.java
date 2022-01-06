/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.collab01;

import com.mycompany.collab01.storycategory.HappyStory;
import com.mycompany.collab01.storycategory.IStory;
import com.mycompany.collab01.storycategory.SadStory;
import com.mycompany.collab01.storycategory.ViolentStory;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Timothy
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
                        
                        break;
                    case 'S':

                        break;
                    case 'V':
                        story = new ViolentStory();
                        //這邊加入年齡的判斷                        
                        storylist = story.listStory();
                        story.displayStory(storylist);
                        break;
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }

        } while (!action.equalsIgnoreCase("Q"));

        System.out.println();
        System.out.println("Application End!");
    }

}
