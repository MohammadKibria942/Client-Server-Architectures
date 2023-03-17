package com.mycompany.simpletest;

import java.util.Date;

public class DummyServer {
    
    String dummyServerName = "UoW_SERVER";
    
    String getConnection(String clientID){
        
        System.out.println("[SERVER] - Dummy Server, Connection Being Tested...");
        System.out.println("[SERVER] - Client ID is: " + clientID);
        
        Date currentDate = new Date(); // task 14
        
        return "[ " + currentDate + "] Server " + dummyServerName + " : Connection Succeded";
}
}
