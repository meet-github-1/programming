import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class calcy extends JFrame{
	calcy(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
		JButton b=new JButton("9");
		this.add(b);
		setVisible(true);
	}
 public static void main(String[] args){
	 calcy a=new calcy();
 }
}
