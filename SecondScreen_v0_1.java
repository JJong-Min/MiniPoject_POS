import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.util.Arrays;

public class SecondScreen extends JFrame{
	private Image backgroundImage = new ImageIcon("images/backgroundimage2.jpg").getImage();
	JButton button1 = new JButton("�ֹ�");
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	
	
	String columnNames[] = {"No.", "��ǰ��", "����"};
	String check[] = {};
	Object rowdata[][] = {{"", "", ""},{"", "", ""},{"", "", ""}, {"","" ,"" }, {"","" ,"" }, {"","" ,"" }, {"","" ,"" }, {"","" ,"" }
							,{"", "", ""},{"", "", ""}, {"","" ,"" }, {"","" ,"" }, {"","" ,"" }, {"","" ,"" }, {"","" ,"" }
						};
	
	JTable table = new JTable(rowdata, columnNames);
	
	JScrollPane jscp1 = new JScrollPane(table);
	
	
	
	public SecondScreen() {
		cg();
		setTitle("Menu");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		jscp1.setLocation(10,10);
	    jscp1.setSize(200,200);
		button1.setBounds(400,320,80,80);
		
		button2.setBounds(380,50,80,80);
		button2.setText("����");
		
		button3.setBounds(250,50,80,80);
		button3.setText("��");
		
		button4.setBounds(380,170,80,80);
		button4.setText("�׸�");
		
		button5.setBounds(250,170,80,80);
		button5.setText("������");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		
		add(jscp1);
		setVisible(true);
	}
	
	
	public void paint(Graphics g) {
		g.drawImage(backgroundImage,0,0, null);
	}
	
	
	/*���콺 �̺�Ʈ*/
	public void cg(){
		button1.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				setVisible(false);//â�� ���̰�
				new FirstScreen();//â�� ���̰�
			} 
		});
		
		button2.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				for (int i = 0; i<=3; i++) {
					if (table.getValueAt(i, 0) == "") {
						table.setValueAt(i+1, i, 0);
						table.setValueAt(button2.getText(),i , 1);
						table.setValueAt(1, i, 2);
						break;
					} else if (table.getValueAt(i, 1) == button2.getText() ) {
						int count = (int) table.getValueAt(i, 2);
						table.setValueAt(count+1, i, 2);
						break;
						
					}
				}

			} 
		});
		
		button3.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				for (int i = 0; i<=3; i++) {
					if (table.getValueAt(i, 0) == "") {
						table.setValueAt(i+1, i, 0);
						table.setValueAt(button3.getText(), i, 1);
						table.setValueAt(1, i, 2);
						break;
					} else if (table.getValueAt(i, 1) == button3.getText() ) {
						int count = (int) table.getValueAt(i, 2);
						table.setValueAt(count+1, i, 2);
						break;
						
					}
				}

			} 
		});
		
		button4.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				for (int i = 0; i<=3; i++) {
					if (table.getValueAt(i, 0) == "") {
						table.setValueAt(i+1, i, 0);
						table.setValueAt(button4.getText(), i, 1);
						table.setValueAt(1, i, 2);
						break;
					} else if (table.getValueAt(i, 1) == button4.getText() ) {
						int count = (int) table.getValueAt(i, 2);
						table.setValueAt(count+1, i, 2);
						break;
						
					}
				}

			} 
		});
		
		button5.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				for (int i = 0; i<=3; i++) {
					if (table.getValueAt(i, 0) == "") {
						table.setValueAt(i+1, i, 0);
						table.setValueAt(button5.getText(), i, 1);
						table.setValueAt(1, i, 2);
						break;
					} else if (table.getValueAt(i, 1) == button5.getText() ) {
						int count = (int) table.getValueAt(i, 2);
						table.setValueAt(count+1, i, 2);
						break;
						
					}
				}

			} 
		});
	}
}