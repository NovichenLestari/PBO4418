/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori;

/**
 *
 * @author Novichen
 */
class  param_data {
    int [] param_data =  new  int [ 5 ];
}
class ArrayList extends param_data{
    
    public void append(int data){
        for (int x = 0; x < param_data.length; x++){
            if (param_data[x] == 0){
                param_data[x] = data;
                break;
            }
        }
    }
    
    public void append(int index, int data){
        param_data[index] = data;
    }
    
    public void pop(){
        for (int x = param_data.length-1; x > 0; x--){
            if (param_data[x] != 0){
                param_data[x] = 0;
                break;
            }
        }
    }
    
    public void pop(int index){
        param_data[index] = 0;
    }
    
    public void UbahData(int index, int data){
        param_data[index] = data;
    }
    
    public void ShowData(){
        for (int x = 0; x < param_data.length; x++){
            System.out.println(param_data[x]);
    }
    }
}
class Queue extends param_data {
    public void append(int data){
        try{
            for (int x = 0; x < param_data.length+1; x++){
                if (param_data[x] == 0){
                    param_data[x] = data;
                    break;
                }
                
                if (x == param_data.length+1){
                    throw new Exception("");
                }
            }
        } catch(Exception e){
            int len = param_data.length;
            int[] temp_node = new int[len+1];
            for (int x = 0; x < len; x++){
                temp_node[x] = param_data[x];
            }
            temp_node[len] = data;
            param_data = temp_node.clone();
        }
    }
    
    public void pop(){
        int len = param_data.length;
        int[] temp_node = new int[len-1];
        for (int i = 0; i < temp_node.length; i++){
            temp_node[i] = param_data[i+1];
        }
        param_data = temp_node.clone();
    }
    
    public void UbahData(int index, int data){
        param_data[index] = data;
    }
    
    public void ShowData(){
        for (int x = 0; x < param_data.length; x++){
            System.out.println(param_data[x]);
        }
    }
}
class Stack extends param_data{
    
    public void append(int data){
        try{
            for (int x = 0; x < param_data.length+1; x++){
                if (param_data[x] == 0){
                    param_data[x] = data;
                    break;
                }
                
                if (x == param_data.length+1){
                    throw new Exception("");
                }
            }
        } 
        catch(Exception e){
            int len = param_data.length;
            int[] temp_node = new int[len+1];
            for (int x = 0; x < len; x++){
                temp_node[x] = param_data[x];
            }
            temp_node[len] = data;
            param_data = temp_node.clone();
        }
    }
    
    public void pop(){
        int len = param_data.length;
        int[] temp_node = new int[len-1];
        for (int x = 0; x < temp_node.length; x++){
            temp_node[x] = param_data[x];
        }
        param_data = temp_node.clone();
    }
    
    public void UbahData(int index, int data){
        param_data[index] = data;
    }
    
    public void ShowData(){
        for (int x = 0; x < param_data.length; x++){
            System.out.println(param_data[x]);
        }
    }
}
public class Inheritance_Ar_St_Que {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println ("[Output Array List]");
        ArrayList array = new ArrayList();
        array.append(2);
        array.append(4);
        array.append(6);
        array.append(8);
        array.ShowData();
        System.out.println("=====");
        array.append(5);
        array.ShowData();
        System.out.println("=====");
        array.pop();
        array.ShowData();
        System.out.println("=====");
        array.UbahData(0,7);
        array.ShowData();
        System.out.println("\n");
        
        System.out.println("[Output Stack]");
        Stack stack = new Stack();
        stack.append(2);
        stack.append(4);
        stack.append(6);
        stack.append(8);
        stack.append(10);
        stack.ShowData();
        System.out.println("=====");
        stack.append(6);
        stack.ShowData();
        System.out.println("=====");
        stack.pop();
        stack.ShowData();
        System.out.println("=====");
        stack.UbahData(0,0);
        stack.ShowData();
        System.out.println("\n");
        
        System.out.println("[Output Queue]");
        Queue queue = new  Queue();
        queue.append(2);
        queue.append(4);
        queue.append(6);
        queue.append(8);
        queue.append(10);
        queue.ShowData();
        System.out.println("=====");
        queue.pop();
        queue.ShowData();
        System.out.println("=====");
        queue.UbahData(2,0);
        queue.ShowData();
        System.out.println("SELESAI");
    }
    
}
