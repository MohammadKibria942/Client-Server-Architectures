package com.mycompany.simpletest2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleClient {
    
    SimpleCalculatorServer server = new SimpleCalculatorServer();
    
    public static void main(String[] args){
        
        SimpleClient simpleClient = new SimpleClient();
        simpleClient.executeTest();
    }

    private void executeTest() {
        
        System.out.println("[CLIENT] - Testing if the server is connected...");
        
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - The server is connected, the test can proceed...");
            
            // invoke the addIntegerNumbers
            int x = 2;
            int y = 3;
            
            System.out.println("[CLIENT] - Asking the server what is the sum of " + x + " and " + y);
            
            int z = server.addIntegerNumbers(x, y);
            
            System.out.println("[CLIENT] - The server has replied that the sum of " + x + " and " + y + " is " + z);
            
            if(z == x+y)
                System.out.println("[CLIENT] - The server has returned the correct answer");
            else
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            
            // invoke the divideIntegernumbers
            x = 4;
            y = 0;
            
            System.out.println("[CLIENT] - Asking the server what is the ratio of " + x + " and " + y);
            
            try {
                
                System.out.println("[CLIENT] - The server says that " + x + " / " + y + " is " + server.divideIntegerNumbers(x, y));
                z = server.divideIntegerNumbers(x, y);
                System.out.println("This line will not be seen!!!");
                
            } catch (Exception ex) {
                
                System.out.println("[CLIENT] - Exception caught!");
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
            
            /*TASK 22
            */
            x = 7;
            y = 2;
            System.out.println("[CLIENT] - Server says that " + x + " - " + y + " is " + server.subtractIntegerNumbers(x, y));

            x = 5;
            y = 2;
            System.out.println("[CLIENT] - Server says that " + x + " * " + y + " is " + server.multiplyIntegerNumbers(x, y));
            
//            if(z==x/y)
//                System.out.println("[CLIENT] - The server has returned the correct answer");
//            else
//                System.out.println("[CLIENT] - The server has returned the WRONG answer"); 

            /*TASK 24-26
            */

            ArrayList l1  =  new ArrayList();
            l1.add(1);
            l1.add(2);
            l1.add(3);            
            
            ArrayList l2  =  new ArrayList();
            l2.add(10);
            l2.add(10);
            l2.add(10);
            
            try {
                System.out.println("[CLIENT] - Server says that " + l1 + " + " + l2 + " is " + server.addArraysOfIntegerNumbers(l1, l2));
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            System.out.println("[CLIENT] - The server is NOT connected, the test has failed.");
        }
    }
    
}
