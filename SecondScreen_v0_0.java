import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;



public class SecondScreen extends JFrame{
	private Image backgroundImage = new ImageIcon("images/backgroundimage2.jpg").getImage();
	JButton button1 = new JButton("1번");
	JButton button2 = new JButton("2번");
	JButton button3 = new JButton("3번");
	JButton button4 = new JButton("4번");
	JButton button5 = new JButton("5번");
	JButton button6 = new JButton("6번");
	JButton button7 = new JButton("7번");
	JButton button8 = new JButton("8번");
	
	
	public SecondScreen() {
		setTitle("Menu");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		button1.setBounds(50,120,80,80);
		button2.setBounds(50,320,80,80);
		button3.setBounds(150,120,80,80);
		button4.setBounds(150,320,80,80);
		button5.setBounds(250,120,80,80);
		button6.setBounds(250,320,80,80);
		button7.setBounds(350,120,80,80);
		button8.setBounds(350,320,80,80);
		getContentPane().add(button1);
		getContentPane().add(button2);
		getContentPane().add(button3);
		getContentPane().add(button4);
		getContentPane().add(button5);
		getContentPane().add(button6);
		getContentPane().add(button7);
		getContentPane().add(button8);
		setVisible(true);
	}
	
	
	public void paint(Graphics g) {
		g.drawImage(backgroundImage,0,0, null);
	}
	
	
	/*마우스 이벤트*/
	public void cg(){
		button1.addMouseListener(new MouseAdapter() { // 마우스 이벤트 
			@Override public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때 
			} 
			@Override public void mouseExited(MouseEvent e) { // 마우스 나왔을때 	
			}
			@Override public void mousePressed(MouseEvent e) { // 클릭했을때 
				setVisible(false);//창이 보이게
				new FirstScreen();//창이 보이게
			} 
		});
	}
}