/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simpletest;

import java.util.Date;

/**
 *
 * @author lolbo
 */
public class DummyServer {
    
    String dummyServerName = "UoW_SERVER";
    
    String getConnection(String clientID){
        
        System.out.println("[SERVER] - Dummy Server, Connection Being Tested...");
        System.out.println("[SERVER] - Client ID is: " + clientID);
        
        Date currentDate = new Date(); // task 14
        
        return "[ " + currentDate + "] Server " + dummyServerName + " : Connection Succeded";
}
}
