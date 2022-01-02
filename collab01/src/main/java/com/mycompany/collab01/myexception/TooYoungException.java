/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collab01.myexception;



/**
 *
 * @author Nathan
 */
public class TooYoungException extends Exception{
    public TooYoungException(){
        super();
    }
    public TooYoungException(String message){
        super(message);
    }
    public TooYoungException(String message, Throwable cause){
        super(message, cause);
    }
    public TooYoungException(Throwable cause){
        super(cause);
    }
    
    
}
