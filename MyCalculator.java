package java_80_JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculator extends JFrame {
public MyCalculator() {
	this.setTitle("My Calculator");
	this.setSize(300, 300);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	
	JTextField jTextField = new JTextField(50);
	JPanel jPanel_head = new JPanel();
	jPanel_head.setLayout(new BorderLayout());
	jPanel_head.add(jTextField, BorderLayout.CENTER);
	
	
	JButton jbu0 = new JButton("0");
	JButton jbu1 = new JButton("1");
	JButton jbu2 = new JButton("2");
	JButton jbu3 = new JButton("3");
	JButton jbu4 = new JButton("4");
	JButton jbu5 = new JButton("5");
	JButton jbu6 = new JButton("6");
	JButton jbu7 = new JButton("7");
	JButton jbu8 = new JButton("8");
	JButton jbu9 = new JButton("9");
	JButton jbu_chia = new JButton(" Chia ");
	JButton jbu_cong = new JButton(" Cộng ");
	JButton jbu_tru = new JButton(" Trừ ");
	JButton jbu_nhan = new JButton(" Nhân ");
	JButton jbu_bang = new JButton(" Bằng ");
	
	
	
	JPanel jPanel_buttons = new JPanel();
	jPanel_buttons.setLayout(new GridLayout(5, 3));
	
	
	//this.setLayout(new FlowLayout() );
	//this.setLayout(new GridLayout() );
	//this.setLayout(new BorderLayout() );
	//=> cả 3 tình huống trên đều không sử dụng được 
	
	jPanel_buttons.add(jTextField);
	jPanel_buttons.add(jbu0);
	jPanel_buttons.add(jbu1);
	jPanel_buttons.add(jbu2);
	jPanel_buttons.add(jbu3);
	jPanel_buttons.add(jbu4);
	jPanel_buttons.add(jbu5);
	jPanel_buttons.add(jbu6);
	jPanel_buttons.add(jbu7);
	
	jPanel_buttons.add(jbu8);
	jPanel_buttons.add(jbu9);
	jPanel_buttons.add(jbu_cong);
	jPanel_buttons.add(jbu_tru);
	jPanel_buttons.add(jbu_nhan);
	jPanel_buttons.add(jbu_chia);
	jPanel_buttons.add(jbu_bang);
	
	
	
	
	
//	this.add(jTextField);
//	this.add(jbu1);
//	this.add(jbu2);
//	this.add(jbu3);
//	this.add(jbu4);
//	this.add(jbu5);
//	this.add(jbu6);
//	this.add(jbu7);
//	
//	this.add(jbu8);
//	this.add(jbu9);
//	this.add(jbu_cong);
//	this.add(jbu_tru);
//	this.add(jbu_nhan);
//	this.add(jbu_chia);
//	this.add(jbu_bang);
//	
	
	this.setLayout(new BorderLayout() );
	this.add(jPanel_head,BorderLayout.NORTH );
	this.add(jPanel_buttons,BorderLayout.CENTER );
	
	
	
	this.setVisible(true);
}
public static void main(String[] args) {
	new MyCalculator();	
	
	
	
}
}
