/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StringBuilder nme =new StringBuilder();
        guis obj = new guis();
        
        
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        int n =0;
        while (n!=3) {
            
             int a = Integer.parseInt(JOptionPane.showInputDialog(null, "choose below\n"
                     + "1. Add a task\n"
                     + "2. coming soon\n"
                     + "3. Exit\n"));
             
             if (a ==1){
                 int tasknum = Integer.parseInt(JOptionPane.showInputDialog(null, "Amount of tasks"));
                 
                 
                 for (int e = 0; e < tasknum; e++) {
                     
                     String fnAndln =JOptionPane.showInputDialog(null, "Developer's Details");
                     String tasknme = JOptionPane.showInputDialog(null, "name of the task");
                     String tskdescrip = JOptionPane.showInputDialog(null, "Please enter the description");
                     int tskduration = Integer.parseInt(JOptionPane.showInputDialog(null, "Duration of tasks"));
                     int tsks =Integer.parseInt(JOptionPane.showInputDialog(null, "The task status\n"
                             + "1. To Do\n"
                             + "2. Doing\n"
                             + "3. Done\n"));
                if (tsks ==1) {
                    
                }
                if (tsks== 2){
                    
                }
                if (tsks==3){
                    
                }
                     String Id = new String();
                     guis.printTaskDetails(tasknme, n, tskdescrip, fnAndln, tskduration, tasknme, Id);
                     guis.checkTaskDescription(tskdescrip);
                     guis.createTaskID(tasknme, n, tasknme);
                     guis.printTaskDetails(tasknme, n, tskdescrip, fnAndln, tskduration, tasknme, Id, tsks);
                     
                     
                 }
             }
             if(a ==2 ){
                 JOptionPane.showMessageDialog(null, "Coming soon");
             }
             if(a ==3){
                 break;
             }
             
             
        }
        
       
        
    }
    
}
