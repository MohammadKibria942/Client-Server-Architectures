
package com.mycompany.simpletest2;

import java.util.ArrayList;

public class SimpleCalculatorServer {
    
    public boolean isServerConnected(){
        System.out.println("[SERVER] - Connection is being tested...");
        
        return true;
        
    }
    
    public int addIntegerNumbers(int a, int b){
        System.out.println("[SERVER] - Adding " + a + " and " + b);
        return a+b;
    }
    
    public int divideIntegerNumbers(int a, int b) throws Exception{
        
        if (b==0)
            throw new Exception();
        
        if (b==0 && a==0)
            throw new Exception();
        
        System.out.println("[SERVER] - Dividing " + a + " and " + b);
        return a/b;
        
        /*
        //TASK 23
         
        return (double) a / (double) b;
        */
    }
    
    /*
    TASK 21
     */
    
    public int subtractIntegerNumbers(int a, int b) {
        System.out.println("[SERVER] - Subtracting + " + a + " - " + b);
        return a - b;
    }

    
    public int multiplyIntegerNumbers(int a, int b) {
        System.out.println("[SERVER] - Multiplying + " + a + " * " + b);
        return a * b;
    }
    
    /*
    TASK 25-26
     */
    public ArrayList<Integer> divideArrayofIntegerNumbers(ArrayList<Integer> a, ArrayList<Integer> b) throws Exception {
        if (a.size() != b.size()) {
            throw new Exception();
        }

        if (b.contains(0)) {
            throw new Exception();
        }

        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < a.size(); i++) {
            res.add(a.get(i) / b.get(i));
        }

        return res;
    }


    public ArrayList<Integer> addArraysOfIntegerNumbers(ArrayList<Integer> a, ArrayList<Integer> b) throws Exception {
        if (a.size() != b.size()) {
            throw new Exception();
        } else {

            ArrayList<Integer> res = new ArrayList<Integer>();

            for (int i = 0; i < a.size(); i++) {
                res.add(a.get(i) + b.get(i));
            }

            return res;
        }
    }
}
