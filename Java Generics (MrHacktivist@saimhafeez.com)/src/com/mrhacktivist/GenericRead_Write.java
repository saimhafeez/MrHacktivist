package com.mrhacktivist;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class GenericRead_Write<T>{

    T object;
    int state  = 0;

    public GenericRead_Write(T object){
        this.object = object;
    }


    public void write(){
        state = 1;
        String fileName = object.getClass().getName() + ".txt";
        ArrayList<T> list = new ArrayList<>();
        list = read();
        list.add(object);
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            for (T obj:
                 list) {
                outputFile.writeObject(obj);
            }


        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public ArrayList<T> read() {
        String fileName = object.getClass().getName() + ".txt";
        ArrayList<T> list = new ArrayList<>();
        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream inputFile = new ObjectInputStream(file);
            boolean END_OF_FILE = false;
            while (!END_OF_FILE){
                try {
                    list.add((T) inputFile.readObject());
                }catch (EOFException e){
                    // When reaches END OF FILE we set the Boolean END_OF_FILE to TRUE
                    END_OF_FILE = true;
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

        }catch (FileNotFoundException j){
            if(state == 1){
                // Do Nothing... When state is 1 it means the write method is called
                // Since, the wite method will automatcally create new file is not found
                // So we don't require our program to show exception if read() is called from write()
            }else {
                // When state is 0 means the write() is not called so if file does not exits
                // in this case we show Error Message that file is not found
                JOptionPane.showMessageDialog(null, j.getMessage());
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return list;
    }

}