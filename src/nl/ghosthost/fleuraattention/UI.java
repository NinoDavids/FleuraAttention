package nl.ghosthost.fleuraattention;

import java.awt.*;
import javax.swing.*;

public class UI {
	
	static JFrame homeFrame = new JFrame("FleuraAttention");
	static JFrame settingsFrame = new JFrame("FleuraAttention");
	static JFrame topFrame = new JFrame("FleuraAttention");
	static JFrame registerFrame = new JFrame("FleuraAttention");
	static JFrame loginFrame = new JFrame("FleuraAttention");
	static JFrame adminFrame = new JFrame("FleuraAttention");

  //static JLabel UIbarcode;
  
  //static ImageIcon image;
  //static JTextField input;
  //static JButton submitButton;
  
  
  public static void GUI()
  {
	  homeScreen();
      //submitButton.addActionListener(new ActionListener() {
      //public void actionPerformed(ActionEvent e) {
      	//String scannedCode = input.getText();
      	//JOptionPane.showMessageDialog(frame, "Submit Button clicked.");
      	//DatabaseConnection.Scanner(scannedCode);
      	//APICall.oneTimeCall(scannedCode);
      	//input.setText("");
      	//}
      // });
  }
  
  public static void homeScreen() 
  {
	  homeFrame.setVisible(true);
	  homeFrame.setLayout(new CardLayout());
      
	  JButton addFault = new JButton("addFault");
	  JButton removeFault = new JButton("removeFault");
	  JButton faultTop = new JButton("faultTop"); 
	  JButton settings = new JButton("settings");
	  JButton addUser = new JButton("addUser");
	  JLabel version = new JLabel("Version: ");
	  
	  homeFrame.add(addFault);homeFrame.add(removeFault);homeFrame.add(faultTop);homeFrame.add(settings);homeFrame.add(addUser);homeFrame.add(version);
	  
	  homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //JLabel text = new JLabel("Scan barcode: ");
      //text.setBounds(10, 425, 350, 30);
  
      //frame.add(UIbarcode);
      
      //frame.setLocationRelativeTo(null);
      //frame.getRootPane().setDefaultButton(submitButton);
	  homeFrame.pack();
	  homeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
  }
  
  public static void updateFrame(String[] information) 
  {  
	homeFrame.invalidate();
	homeFrame.validate();
	homeFrame.repaint();
	System.gc();
  }
}
