package net.matt.gui.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JLabel;

import net.matt.entity.CardList;

public class MainScreen extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFilename;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setTitle("Card Game Manger");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450,111);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		JButton btnCreateCard = new JButton("Create Card");
		btnCreateCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardCreatorScreen cardCreatorScreen = new CardCreatorScreen();
				cardCreatorScreen.setVisible(true);
			}
		});
		panel.add(btnCreateCard);
		
		JButton btnDeleteCard = new JButton("Delete Card");
		panel.add(btnDeleteCard);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.EAST);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				{
					File file = new File(txtFilename.getText());
					try {
						CardList.saveCardList(file);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		panel_1.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		panel_1.add(btnLoad);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblFileName = new JLabel("File Name:");
		panel_2.add(lblFileName);
		
		txtFilename = new JTextField();
		panel_2.add(txtFilename);
		txtFilename.setColumns(10);
	}

}
