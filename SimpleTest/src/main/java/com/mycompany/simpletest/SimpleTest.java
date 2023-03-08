/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simpletest;

/**
 *
 * @author lolbo
 */
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
