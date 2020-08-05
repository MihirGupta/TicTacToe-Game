//Uploading to github

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.util.Random;
import javax.swing.JProgressBar;
public class Application {
	
	private JFrame frame;
	/**
	 * Launch the application user interface.
	 */
	static boolean flag=false; //stops program when match is over
	static int i=0;;
	
	
	static JButton btn_1 = new JButton("");
	static JButton btn_2 = new JButton("");
	static JButton btn_3 = new JButton("");
	static JButton btn_4 = new JButton("");
	static JButton btn_5 = new JButton("");
	static JButton btn_6 = new JButton("");
	static JButton btn_7 = new JButton("");
	static JButton btn_8 = new JButton("");
	static JButton btn_9 = new JButton("");
	static JButton btnReset = new JButton("New Game");
	
	static JButton btn_array[] = {btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9};
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application. 
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 321, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btn_2.setBackground(UIManager.getColor("Button.darkShadow"));
		btn_3.setBackground(UIManager.getColor("Button.darkShadow"));
		btn_4.setBackground(UIManager.getColor("Button.darkShadow"));
		btn_5.setBackground(UIManager.getColor("Button.darkShadow"));
		btn_6.setBackground(UIManager.getColor("Button.darkShadow"));
		btn_7.setBackground(UIManager.getColor("Button.darkShadow"));
		btn_8.setBackground(UIManager.getColor("Button.darkShadow"));
		btn_9.setBackground(UIManager.getColor("Button.darkShadow"));
		
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				ProcessEvent(e);	
				//AI_Brain.first_move_dicision();
			}
		});
		btn_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn_1.setBounds(34, 114, 74, 73);
		frame.getContentPane().add(btn_1);
		
		btn_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				ProcessEvent(e);
			}
		});
		btn_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_2.setBounds(118, 114, 74, 73);
		frame.getContentPane().add(btn_2);
		
		btn_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ProcessEvent(e);
			}
		});
		btn_3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn_3.setBounds(199, 114, 74, 73);
		frame.getContentPane().add(btn_3);
		
		btn_4.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				ProcessEvent(e);
			}
		});
		btn_4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_4.setBounds(34, 198, 74, 73);
		frame.getContentPane().add(btn_4);
		
		btn_5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ProcessEvent(e);
			}
		});
		btn_5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_5.setBounds(118, 198, 74, 73);
		frame.getContentPane().add(btn_5);
		
		btn_6.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				ProcessEvent(e);
			}
		});
		btn_6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn_6.setBounds(199, 198, 74, 73);
		frame.getContentPane().add(btn_6);
		
		btn_7.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				ProcessEvent(e);
			}
		});
		btn_7.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn_7.setBounds(34, 282, 74, 73);
		frame.getContentPane().add(btn_7);
		
		btn_8.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				ProcessEvent(e);
			}
		});
		btn_8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn_8.setBounds(118, 282, 74, 73);
		frame.getContentPane().add(btn_8);
		
		btn_9.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				ProcessEvent(e);
			}
		});
		btn_9.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn_9.setBounds(199, 282, 74, 73);
		frame.getContentPane().add(btn_9);

		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				btn_1.setBackground(UIManager.getColor("Button.darkShadow"));
				btn_2.setBackground(UIManager.getColor("Button.darkShadow"));
				btn_3.setBackground(UIManager.getColor("Button.darkShadow"));
				btn_4.setBackground(UIManager.getColor("Button.darkShadow"));
				btn_5.setBackground(UIManager.getColor("Button.darkShadow"));
				btn_6.setBackground(UIManager.getColor("Button.darkShadow"));
				btn_7.setBackground(UIManager.getColor("Button.darkShadow"));
				btn_8.setBackground(UIManager.getColor("Button.darkShadow"));
				btn_9.setBackground(UIManager.getColor("Button.darkShadow"));
				
				btn_1.setEnabled(true);
				btn_2.setEnabled(true);
				btn_3.setEnabled(true);
				btn_4.setEnabled(true);
				btn_5.setEnabled(true);
				btn_6.setEnabled(true);
				btn_7.setEnabled(true);
				btn_8.setEnabled(true);
				btn_9.setEnabled(true);
				
				btn_1.setText("");
				btn_2.setText("");
				btn_3.setText("");
				btn_4.setText("");
				btn_5.setText("");
				btn_6.setText("");
				btn_7.setText("");
				btn_8.setText("");
				btn_9.setText("");
				flag=false;
				i=0;
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnReset.setBounds(65, 373, 166, 30);
		frame.getContentPane().add(btnReset);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(20, 11, 258, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblRules = new JLabel("Rules :");
		lblRules.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblRules.setBounds(20, 52, 48, 14);
		frame.getContentPane().add(lblRules);
		
		JLabel lblClickOnButton = new JLabel("Click on button to place your mark");
		lblClickOnButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblClickOnButton.setBounds(65, 52, 178, 14);
		frame.getContentPane().add(lblClickOnButton);
		
		JLabel lblHumanGreen = new JLabel("Human");
		lblHumanGreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblHumanGreen.setForeground(new Color(34, 139, 34));
		lblHumanGreen.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblHumanGreen.setBounds(34, 77, 108, 14);
		frame.getContentPane().add(lblHumanGreen);
		
		JLabel lblMachineRed = new JLabel("AI");
		lblMachineRed.setHorizontalAlignment(SwingConstants.CENTER);
		lblMachineRed.setForeground(new Color(255, 0, 0));
		lblMachineRed.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMachineRed.setBounds(179, 77, 94, 17);
		frame.getContentPane().add(lblMachineRed);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(271, 401, 1, 2);
		frame.getContentPane().add(separator);
	}
	
	public void ProcessEvent(MouseEvent e) {
		
		JButton sourceButton = (JButton) e.getSource();
		String btnText = sourceButton.getText(); 
		
		if(flag==false)
		{		
			if(btnText=="")
			{	
				sourceButton.setBackground(new Color(34, 139, 34));
				sourceButton.setText("o");
				i++;
				
			}
			sourceButton.setEnabled(false);
		}
		reaction();
	}
	
	public void reaction() 
	{
		
		if(i==1)
		{	
			
			AI_Brain_test.first_move_dicision();
		}
		else if(i==2)
		{
			
			AI_Brain_test.second_move_decision();
		}
		else if(i==3)
		{
			if(complete()==false)
			{	
				if(AI_Brain_test.finishing_move()==false)
					if(AI_Brain_test.block_user_test()==false)
					{
						for(int j=0;;j++)
						{
							if(random_num_generator())
							{
								break;
							}
						}
					}
			}
			complete();
		}
		
		else if(i==4)
		{
			if(complete()==false)
			{	
				if(AI_Brain_test.finishing_move()==false)
					if(AI_Brain_test.block_user_test()==false)
					{
						for(int j=0;;j++)
						{
							if(random_num_generator())
							{
								break;
							}
						}
					}
			}
			complete();
			
		}
		else 
		{
			if(match_over())
				message(11);
			else 
			{
				for(int j=0;;j++)
				{
					if(random_num_generator())
					{
						break;
					}
				}
			}
		}
	}	
	
	public static boolean complete() //check if all 3 boxes are filled in any line
	{
		if((btn_1.getText()=="x" && btn_2.getText()=="x" && btn_3.getText()=="x"))
		{
			btn_1.setText("-x-");
			btn_2.setText("-x-");
			btn_3.setText("-x-");
			message(0);
			return true;
		}
		else if((btn_1.getText()=="o" && btn_2.getText()=="o" && btn_3.getText()=="o"))
		{
			btn_1.setText("-o-");
			btn_2.setText("-o-");
			btn_3.setText("-o-");
			message(1);
			return true;
		}
		else if((btn_4.getText()=="x" && btn_5.getText()=="x" && btn_6.getText()=="x"))
		{
			btn_4.setText("-x-");
			btn_5.setText("-x-");
			btn_6.setText("-x-");
			message(0);
			return true;
		}
		else if((btn_4.getText()=="o" && btn_5.getText()=="o" && btn_6.getText()=="o"))
		{
			btn_4.setText("-o-");
			btn_5.setText("-o-");
			btn_6.setText("-o-");
			message(1);
			return true;
		}
		else if((btn_7.getText()=="x" && btn_8.getText()=="x" && btn_9.getText()=="x"))
		{
			btn_7.setText("-x-");
			btn_8.setText("-x-");
			btn_9.setText("-x-");
			message(0);
			return true;
		}
		else if((btn_7.getText()=="o" && btn_8.getText()=="o" && btn_9.getText()=="o"))
		{
			btn_7.setText("-o-");
			btn_8.setText("-o-");
			btn_9.setText("-o-");
			message(1);
			return true;
		}
		else if((btn_1.getText()=="x" && btn_4.getText()=="x" && btn_7.getText()=="x"))
		{
			btn_1.setText("-x-");
			btn_4.setText("-x-");
			btn_7.setText("-x-");
			message(0);
			return true;
		}
		else if((btn_1.getText()=="o" && btn_4.getText()=="o" && btn_7.getText()=="o"))
		{
			btn_1.setText("-o-");
			btn_4.setText("-o-");
			btn_7.setText("-o-");
			message(1);
			return true;
		}
		else if((btn_1.getText()=="x" && btn_5.getText()=="x" && btn_9.getText()=="x"))
		{
			btn_1.setText("-x-");
			btn_5.setText("-x-");
			btn_9.setText("-x-");
			message(0);
			return true;
		}
		else if((btn_1.getText()=="o" && btn_5.getText()=="o" && btn_9.getText()=="o"))
		{
			btn_1.setText("-o-");
			btn_5.setText("-o-");
			btn_9.setText("-o-");
			message(1);
			return true;
		}
		else if((btn_2.getText()=="x" && btn_5.getText()=="x" && btn_8.getText()=="x"))
		{
			btn_2.setText("-x-");
			btn_5.setText("-x-");
			btn_8.setText("-x-");
			message(0);
			return true;
		}
		else if((btn_2.getText()=="o" && btn_5.getText()=="o" && btn_8.getText()=="o"))
		{
			btn_2.setText("-o-");
			btn_5.setText("-o-");
			btn_8.setText("-o-");
			message(1);
			return true;
		}
		else if((btn_3.getText()=="x" && btn_6.getText()=="x" && btn_9.getText()=="x"))
		{
			btn_3.setText("-x-");
			btn_6.setText("-x-");
			btn_9.setText("-x-");
			message(0);
			return true;
		}
		else if((btn_3.getText()=="o" && btn_6.getText()=="o" && btn_9.getText()=="o"))
		{
			btn_3.setText("-o-");
			btn_6.setText("-o-");
			btn_9.setText("-o-");
			message(1);
			return true;
		}
		else if((btn_3.getText()=="x" && btn_5.getText()=="x" && btn_7.getText()=="x"))
		{
			btn_3.setText("-x-");
			btn_5.setText("-x-");
			btn_7.setText("-x-");
			message(0);
			return true;
		}
		else if((btn_3.getText()=="o" && btn_5.getText()=="o" && btn_7.getText()=="o"))
		{
			btn_3.setText("-o-");
			btn_5.setText("-o-");
			btn_7.setText("-o-");
			message(1);
			return true;
			
		}
		else
		{
			return false;
		}	
	}
	
	public static void message(int n)
	{
		if(n==1)
		{
			JOptionPane.showMessageDialog(null, "Human wins!!");
			flag=true;
		}
		else if(n==0)
		{
			JOptionPane.showMessageDialog(null, "AI wins!!");
			flag=true;
		}
		else if(n==11)
		{
			JOptionPane.showMessageDialog(null, "Match Draw");
			flag=true;
		}	
	}
	
	
	
	public static boolean check_empty(int n)//check if any box is still empty
	{
		switch(n)
		{
			case 0 :
			case 1 :if (btn_1.getText()=="")
					{
						return true;
					}
					else 
					{
					return false;
					}
			
			case 2 :if (btn_2.getText()=="")
					{
						return true;
					}
					else 
					{
						return false;
					}
			
			case 3 :if (btn_3.getText()=="")
					{
						return true;
					}
					else 
					{
						return false;
					}
			case 4 :if (btn_4.getText()=="")
					{
						return true;
					}
					else 
					{
						return false;
					}
			
			case 5 :if (btn_5.getText()=="")
					{
						return true;
					}
					else 
					{
						return false;
					}
			case 6 :if (btn_6.getText()=="")
					{
						return true;
					}
					else 
					{
						return false;
					}
			
			case 7 :if (btn_7.getText()=="")
					{
						return true;
					}
					else 
					{
						return false;
					}			
			case 8 :if (btn_8.getText()=="")
					{
						return true;
					}
					else 
					{
						return false;
					}
			case 9 :if (btn_9.getText()=="")
					{
						return true;
					}
					else 
					{
						return false;
					}
			default : return false;
		}
	}
	
	public static boolean random_num_generator()
	{
		Random generate_random=new Random();
		int random_num=generate_random.nextInt(9) + 1;
		
		if(Application.check_empty(random_num)==true) 
		{
			AI_Brain_test.block_user(random_num);
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	
	public boolean match_over()
	{
		int count=0;
		for(int i=1;i<=9;i++)
		{
			if(check_empty(i)==true)
			{
				count++;
			}
		}
		if(count==0) 
		{
			return true;	
		}
		else 
		{
			return false;
		}
	}
}