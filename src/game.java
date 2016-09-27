import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.im.InputContext;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class game extends JFrame{
	private ImageIcon s =new ImageIcon("images/01.jpg");
	private ImageIcon s1 =new ImageIcon("images/02.jpg");
	private ImageIcon s2 =new ImageIcon("images/03.jpg");
	private ImageIcon s3 =new ImageIcon("images/04.jpg");
	private ImageIcon s4 =new ImageIcon("images/05.jpg");
	private ImageIcon s5 =new ImageIcon("images/06.jpg");
	private ImageIcon s6 =new ImageIcon("images/07.jpg");
	private ImageIcon s7 =new ImageIcon("images/08.jpg");
	private ImageIcon s8 =new ImageIcon("images/09.jpg");
	private ImageIcon s9 =new ImageIcon("images/10.jpg");
	private ImageIcon s10 =new ImageIcon("images/11.jpg");
	private ImageIcon s11 =new ImageIcon("images/12.jpg");
	private ImageIcon s12 =new ImageIcon("images/13.jpg");
	private ImageIcon[] us = {s,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12};
	
	static int card1;
	static int card2;
	static int card3;
	static int card4;
	static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
	public game(){
		card1=(int)(1+Math.random()*(13-1+1));
        card2=(int)(1+Math.random()*(13-1+1));
        card3=(int)(1+Math.random()*(13-1+1));
        card4=(int)(1+Math.random()*(13-1+1));
        
//   	    File file = new File("images");
//    	File[] files = file.listFiles();
//    	for(int i=0;i<files.length;i++){
//    		File file1 = files[i];
//    		file1.getName();
//    	}
     JPanel p1 =new JPanel();
     p1.setLayout(new GridLayout(1,4,1,1));
     p1.add(new JLabel(us[card1]));
     p1.add(new JLabel(us[card2]));
     p1.add(new JLabel(us[card3]));
     p1.add(new JLabel(us[card4]));
     JButton button = new JButton("refresh");
     final JTextField text = new JTextField("请输入表达式：");
     JPanel p2 =new JPanel(new BorderLayout());
     p2.add(text,BorderLayout.SOUTH);
     p2.add(p1,BorderLayout.CENTER);
     add(p2,BorderLayout.EAST);
     
     add(button,BorderLayout.SOUTH);
     button.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           methodA();
       }
		private void methodA() {
			String s = text.getText();
			Object a =0;
			Object b =24.0;
			System.out.println(s);
			
				try {
					a=jse.eval(s);
				} catch (ScriptException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
	            System.out.println(a);  
	        
			if(a.equals(b)){
			game mp=new game();
            mp.setTitle("24点小游戏");
            mp.setSize(650,400);
            mp.setLocationRelativeTo(null);
            mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mp.setVisible(true);
            }
		}
   });
	}
	
	
    public static void main(String[] args){
           game mp=new game();
            mp.setTitle("24点小游戏");
            mp.setSize(650,400);
            mp.setLocationRelativeTo(null);
            mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mp.setVisible(true);
//            final TextField jt=new TextField("");
//            mp.add(jt);
//            JButton button = new JButton("refresh");
//            mp.add(button);
//            button.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    methodA();
//                }
//    			private void methodA() {
//    				int flag=0;
//    				System.out.println("请输入表达式：");
//    				Scanner input = new Scanner(System.in);
//    				String s = input.nextLine();
//
//    		        try {  
//    		        	flag=(int) jse.eval(s);
//    		            //System.out.println(jse.eval(s));  
//    		        } catch (Exception t) {  
//    		        }  
//    		        if(flag==24){
//    				new game();
//    				}
//    			}
//            });
    }
}
 
//class MyPanel extends JFrame{
//	
//	static int card1;
//	static int card2;
//	static int card3;
//	static int card4;
//     Image image=null;
//     Image image1=null;
//     Image image2=null;
//     Image image3=null;
//     JPanel p1 =new JPanel();
//     
//     setLayout(new GridLayout(1,4,5,5));
//     
     
//        public void paint(Graphics g){
//        	card1=(int)(1+Math.random()*(13-1+1));
//            card2=(int)(1+Math.random()*(13-1+1));
//            card3=(int)(1+Math.random()*(13-1+1));
//            card4=(int)(1+Math.random()*(13-1+1));
//          	File file = new File("images");
//          	File[] files = file.listFiles();
//          	for(int i=0;i<files.length;i++){
//          		File file1 = files[i];
//          		file1.getName();
//          	}
//          	 try {
//				image=ImageIO.read(files[card1]);
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//             g.drawImage(image, 0, 50, 100, 160, null);
//             
//             try {
//				image1=ImageIO.read(files[card2]);
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//             g.drawImage(image1, 104, 50, 100, 160, null);
//             try {
//				image2=ImageIO.read(files[card3]);
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//             g.drawImage(image2, 208, 50, 100, 160, null);
//             try {
//				image3=ImageIO.read(files[card4]);
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//             g.drawImage(image3, 312, 50, 100, 160, null);
//       
//       
//    }

