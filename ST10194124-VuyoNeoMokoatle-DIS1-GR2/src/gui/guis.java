/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;


import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class guis {

    public static void printTaskDetails(String tasknme, int n, String tskdescrip, String fnAndln, int tskduration, String tasknme0, String Id, int tsks) {
       
    }
    private int taskduration;
        public static boolean checkTaskDescription(String taskDescription){
        int legth = taskDescription.length();
        boolean properLength = false;
        
        if (legth <= 50){
            properLength = true;
            
        }else{
            properLength =false;
        }
       return properLength;     
    } 
    public static String createTaskID(String tskNme, int num, String loper_nme ){
        String taskID = "";
        String ftTwo = tskNme.substring(0,2);
        String ltThree = loper_nme.substring (loper_nme.length(),-3);
        taskID = ftTwo.toUpperCase()+":"+ num +":"+ltThree.toUpperCase();
        return taskID;
    }
      public static String printTaskDetails(String tasknme, int num, String tskdescrip, String fnAndln,int tskduration, String taskID, String tsks ) {
        String printTaskDetails = new String ();
        
        JOptionPane.showMessageDialog(null, "Task Name: " + tasknme + "\n"
                + "Task Number: "+num+"\n"
                + "Task Description: " + tskdescrip + "\n"        
                + "Developer details: "+ fnAndln + "\n"
                + "TaskID: " + taskID + "\n"
                + "Task Duration: "+"hrs" + tskduration + "\n"
                + "Task Status: "+tsks+"\n");
        
        return printTaskDetails;
        
                
    }
    public  int returnTotalHours(int tskduration){
        this.taskduration = tskduration;
        return 0;
    }
    public int gettsakduration(){
        return taskduration;
    }
}

    

