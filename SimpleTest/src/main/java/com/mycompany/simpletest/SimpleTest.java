package com.mycompany.simpletest;

public class SimpleTest {
    
    DummyServer server = new DummyServer();
    String clientID = "w1824056";
    
    public static void main(String[] args) {
        SimpleTest test = new SimpleTest();
        
        test.execute();
    }
    
    private void execute(){
        String connectionStatus = server.getConnection(clientID);
        System.out.println(connectionStatus);
    }
}
