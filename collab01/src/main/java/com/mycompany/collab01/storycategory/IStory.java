/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.collab01.storycategory;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Timothy
 */
public interface IStory {

    public void readStory(String name) throws IOException;

    public String findStory() throws IOException;

    public File getStoryRoot();

    //default boolean ageCheck() throws TooYoungException{}
}
