import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
/**
 * Write a description of class RecruitmentSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecruitmentSystem {

    // instance variables - replace the example below with your own
    ArrayList<StaffHire> staffList = new ArrayList<StaffHire>();

    public static void main (String[] args) {
        new RecruitmentSystem();
        JFrame frame = new JFrame("Recruitment System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(null);
    }

    public RecruitmentSystem()
    {
        JFrame frame = new JFrame("Recruitment System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(null);
    }

    /**
     * Constructor for objects of class RecruitmentSystem
     */
    public RecruitmentSystem()
    {
        // initialise instance variables
        x = 0;
    }    
