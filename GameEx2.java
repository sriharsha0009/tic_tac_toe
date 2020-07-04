import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/*
<applet code="GameEx2" height=500 width=500>
</applet>
*/
public class GameEx2 extends Applet implements ActionListener{
	
	Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25;
	Label l1 = new Label("Piano the great");
	Font f = new Font("Verdana",Font.BOLD,15);
	public void init(){
	 GridBagLayout gbl = new GridBagLayout();
	 GridBagConstraints gbc = new GridBagConstraints();
	 setLayout(gbl);
	
	 gbc.gridx = 0;
	 gbc.gridy = 1;
	 gbc.gridwidth=4;
	 gbc.ipadx = 30;
	 gbc.ipady = 30;
	 l1.setFont(f);
	 add(l1,gbc);
	 
	 
	 a1 = new Button("");
	 gbc.gridx=0;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a1.setPreferredSize(new Dimension(80,20));
	 a1.setBackground(Color.white);
	 add(a1,gbc);
	 a1.addActionListener(this);
	 
	 a2 = new Button("");
	 gbc.gridx=1;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a2.setPreferredSize(new Dimension(80,20));
	 a2.setBackground(Color.black);
	 add(a2,gbc);
	 a2.addActionListener(this);

	 a3 = new Button("");
	 gbc.gridx=2;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a3.setPreferredSize(new Dimension(80,20));
	 a3.setBackground(Color.white);
	 add(a3,gbc);
	 a3.addActionListener(this);
	 
	 a4 = new Button("");
	 gbc.gridx=3;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a4.setPreferredSize(new Dimension(80,20));
	 a4.setBackground(Color.black);
	 add(a4,gbc);
	 a4.addActionListener(this);
	 
	 a5 = new Button("");
	 gbc.gridx=4;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a5.setPreferredSize(new Dimension(80,20));
	 a5.setBackground(Color.white);
	 add(a5,gbc);
	 a5.addActionListener(this);
	  
	 a6 = new Button(" ");
	 gbc.gridx=5;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a6.setPreferredSize(new Dimension(80,20));
	 a6.setBackground(Color.black);
	 add(a6,gbc);
	 a6.addActionListener(this);
	 
	 a7 = new Button(" ");
	 gbc.gridx=6;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a7.setPreferredSize(new Dimension(80,20));
	 a7.setBackground(Color.white);
	 add(a7,gbc);
	 a7.addActionListener(this);
	 
	 a8 = new Button("");
	 gbc.gridx=7;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a8.setPreferredSize(new Dimension(80,20));
	 a8.setBackground(Color.black);
	 add(a8,gbc);
	 a8.addActionListener(this);
	 
	 a9 = new Button("");
	 gbc.gridx=8;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a9.setPreferredSize(new Dimension(80,20));
	 a9.setBackground(Color.white);
	 add(a9,gbc);
	 a9.addActionListener(this);
	 
	 a10 = new Button("");
	 gbc.gridx=9;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a10.setPreferredSize(new Dimension(80,20));
	 a10.setBackground(Color.white);
	 add(a10,gbc);
	 a10.addActionListener(this);
	 
	 a11 = new Button("");
	 gbc.gridx=10;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a11.setPreferredSize(new Dimension(80,20));
	 a11.setBackground(Color.black);
	 add(a11,gbc);
	 a11.addActionListener(this);

	 a12 = new Button("");
	 gbc.gridx=11;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a12.setPreferredSize(new Dimension(80,20));
	 a12.setBackground(Color.white);
	 add(a12,gbc);
	 a12.addActionListener(this);
	 
	 a13 = new Button("");
	 gbc.gridx=12;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a13.setPreferredSize(new Dimension(80,20));
	 a13.setBackground(Color.black);
	 add(a13,gbc);
	 a13.addActionListener(this);
	 
	 a14 = new Button("");
	 gbc.gridx=13;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a14.setPreferredSize(new Dimension(80,20));
	 a14.setBackground(Color.white);
	 add(a14,gbc);
	 a14.addActionListener(this);
	  
	 a15 = new Button("");
	 gbc.gridx=14;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a15.setPreferredSize(new Dimension(80,20));
	 a15.setBackground(Color.black);
	 add(a15,gbc);
	 a15.addActionListener(this);
	 
	 a16 = new Button("");
	 gbc.gridx=15;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a16.setPreferredSize(new Dimension(80,20));
	 a16.setBackground(Color.white);
	 add(a16,gbc);
	 a16.addActionListener(this);
	 
	 a17 = new Button("");
	 gbc.gridx=16;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a17.setPreferredSize(new Dimension(80,20));
	 a17.setBackground(Color.black);
	 add(a17,gbc);
	 a17.addActionListener(this);
	 
	 a18 = new Button("");
	 gbc.gridx=17;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a18.setPreferredSize(new Dimension(80,20));
	 a18.setBackground(Color.white);
	 add(a18,gbc);
	 a18.addActionListener(this);
	 
	 a19 = new Button("");
	 gbc.gridx=18;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a19.setPreferredSize(new Dimension(80,20));
	 a19.setBackground(Color.black);
	 add(a19,gbc);
	 a19.addActionListener(this);
	 
	 a20 = new Button("");
	 gbc.gridx=19;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a20.setPreferredSize(new Dimension(80,20));
	 a20.setBackground(Color.black);
	 add(a20,gbc);
	 a20.addActionListener(this);
	 
	 a21 = new Button("");
	 gbc.gridx=20;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a21.setPreferredSize(new Dimension(80,20));
	 a21.setBackground(Color.white);
	 add(a21,gbc);
	 a21.addActionListener(this);
	  
	 a22 = new Button("");
	 gbc.gridx=21;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a22.setPreferredSize(new Dimension(80,20));
	 a22.setBackground(Color.black);
	 add(a22,gbc);
	 a22.addActionListener(this);
	 
	 a23 = new Button("");
	 gbc.gridx=22;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a23.setPreferredSize(new Dimension(80,20));
	 a23.setBackground(Color.white);
	 add(a23,gbc);
	 a23.addActionListener(this);
	 
	 a24 = new Button("");
	 gbc.gridx=23;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a24.setPreferredSize(new Dimension(80,20));
	 a24.setBackground(Color.black);
	 add(a24,gbc);
	 a24.addActionListener(this);
	 
	 a25 = new Button("");
	 gbc.gridx=24;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a25.setPreferredSize(new Dimension(80,20));
	 a25.setBackground(Color.black);
	 add(a25,gbc);
	 a9.addActionListener(this);
	 
	 
	}
	
	public void actionPerformed(ActionEvent e){
		
		
		if(e.getSource()==a1){
			try 
				{
                   AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\kishore\\Desktop\\javacode\\events\\beep.wav").getAbsoluteFile());
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();
				}	 
			catch(Exception x)
				{
					x.printStackTrace();		
				}	
			
		}
		
		else if(e.getSource()==a2){
				
			
		}
		
		else if(e.getSource()==a3){
			
			
		}
		
		else if(e.getSource()==a4){
				
			
		}
		
		else if(e.getSource()==a5){
				
			
		}
		
		else if(e.getSource()==a6){
				
			
		}
		
		else if(e.getSource()==a7){
				
			
		}
		
		else if(e.getSource()==a8){
				
			
		}
		
		else if(e.getSource()==a9){
				
			
		}
		
		else if(e.getSource()==a10){
				
			
		}
		
		else if(e.getSource()==a11){
				
			
		}
		
		else if(e.getSource()==a12){
				
			
		}
		
		else if(e.getSource()==a12){
				
			
		}
		
		else if(e.getSource()==a13){
				
			
		}
		
		else if(e.getSource()==a14){
			
			
		}
		
		else if(e.getSource()==a15){
				
			
		}
		
		else if(e.getSource()==a16){
				
			
		}
		
		else if(e.getSource()==a17){
			
			
		}
		
		else if(e.getSource()==a18){
			
			
		}
		
		else if(e.getSource()==a19){
				
			
		}
		
		else if(e.getSource()==a20){
				
			
		}
		
		else if(e.getSource()==a21){
				
			
		}
		
		else if(e.getSource()==a22){
			
			
		}
		
		else if(e.getSource()==a23){
				
			
		}
		
		else if(e.getSource()==a24){
			
			
		}
		
		else if(e.getSource()==a25){
				
			
		}
		
	}
}