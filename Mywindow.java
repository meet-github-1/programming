import javax.swing.*;
import java.awt.*;
class Mywindow{
 public static void main(String[] args){
     JFrame f=new JFrame("My first window");
	 f.setSize(500,500);
	 JButton start =new JButton("start");
	 //f.add(start);
	 JTextArea t =new JTextArea("About Me");
	 //f.add(t);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 f.setVisible(true);
	 GridLayout grid =new GridLayout(5,3,10,10);
	 f.setLayout(grid);
	 JTextArea text=new JTextArea();
	 text.setText("Result");
	 text.setEditable(true);
	 f.add(text);
	 f.add(new JButton("+"));
	 f.add(new JButton("-"));
	 f.add(new JButton("="));
	 f.setVisible(true);
	 JButton []ab =new JButton[10];
	 for(int i=0;i<10;i=i+1){
		 ab[i]=new JButton(Integer.toString(i));
		 f.add(ab[i]);
	 }
	 f.setVisible(true);



 }
}
