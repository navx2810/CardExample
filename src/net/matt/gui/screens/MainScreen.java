package net.matt.gui.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.matt.entity.CardList;
import java.awt.FlowLayout;

public class MainScreen extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setSize(450,96);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(15);
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
		btnDeleteCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				{
					CardSelectorScreen sCardSelectorScreen = new CardSelectorScreen();
					sCardSelectorScreen.setVisible(true);
				}
			}
		});
		panel.add(btnDeleteCard);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setVgap(15);
		contentPane.add(panel_1, BorderLayout.EAST);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				{
					try {
						CardList.saveCardList();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		panel_1.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CardList.loadCardList();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_1.add(btnLoad);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
	}

}
