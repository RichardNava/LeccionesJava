package com.ac3.GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4770531197351865637L;
	private JLabel label1, label2, label3;
	private JButton button1, button2;
	//private JPanel panelBG;
	private BackGround bg = new BackGround();
	
	public MainWindow() {
		this.setContentPane(bg);
		initialize();
	}
	
	private void initialize() {
		this.setLayout(null);
		this.setVisible(true);
		this.setBounds(50, 50, 1200, 800);
		this.setResizable(false);
		this.setTitle("Battle Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label1 = getLabel("Seleccione Jugador 1",10);
		label2 = getLabel("Seleccione Jugador 2",110);
		label3 = getLabel("Estado de la batalla",210);
		
		button1 = getButton("Golpe Player1",1000,700);
		button2 = getButton("Golpe Player2",850,700);
		addAll(label1,label2,label3,button1,button2);
	}
	private void addAll(Component... components) {
		for (Component component : components) this.add(component);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==button1) {
			// Lógica de battle Game
			label3.setText("Player1 golpea a Player2");
		}
		else if (e.getSource()==button2) {
			label3.setText("Player2 golpea a Player1");
			
		}
	}
	
	private JLabel getLabel(String text,int posY) {
		JLabel label = new JLabel(text);
		label.setBounds(10, posY, 400, 35);
		label.setFont(new Font("Arial",Font.BOLD,30));
		label.setForeground(Color.WHITE);
		return label;
	}
	private JButton getButton(String text,int posX,int posY) {
		JButton button = new JButton(text);
		button.setBounds(posX,posY,140,30);
		button.addActionListener(this);
		return button;
	}
	
	class BackGround extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = -1346311718144383788L;
		private Image bgImg;
		
		@Override
		public void paint(Graphics g) {
			bgImg = new ImageIcon(getClass().getResource("/img/battle_bg.jpg")).getImage();
			g.drawImage(bgImg,0,0,getWidth(),getHeight(),this);
			setOpaque(false);
			super.paint(g);
		}	
		
	}
}
