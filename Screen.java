
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roger
 */
public class Screen 
{
    public static Scanner getInput( String prompt )
    {
        String s = JOptionPane.showInputDialog( prompt );
        return new Scanner( s );
    }
}
