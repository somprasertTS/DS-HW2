/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patiwet
 */
public class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size; // Last element can be indexed at size-1
    
    public DynamicArray(int cap){ // Class Constructor
        arr = new int[cap];
        capacity = cap;
    }
    
    public void pushBack(int data){
        // FIXED THIS
    }
    public int popBack(){
        // FIXED THIS
        return 0;
    }

    public int get(int i){
        // FIXED THIS
        return 0;
    }
    public void set(int i, int value){
        // FIXED THIS
    }
    
    public void remove(int i){

    }
    
    public boolean isEmpty(){
        if(arr[0]=null){
            return true;
        }
        return false;
    }
    
    public int getSize(){
        for(int n=0;arr[n]=null;n++){
            
        }
    }
    
    public void printStructure(){
        // FIXED THIS
        System.out.print("Size = " + size + ", Cap = " + capacity + ", arr = [ ] ");
    }
}
