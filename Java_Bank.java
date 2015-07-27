import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import javax.swing.JPanel;
import javax.swing.JLabel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollBar;


public class Java_Bank {
	
	private int Customers = 0;
	private int AccountNum = 1;
	String[] info = new String[12];
	private boolean deposit;
	
	private JFrame frame;
	private JTextField LastName;
	private JTextField FirstName;
	private JTextField MInitial;
	private JTextField HouseNum;
	private JTextField StreetName;
	private JTextField City;
	private JTextField State;
	private JTextField Zip;
	private JTextField Phone;
	private JTextField IntBalance;
	private JTextField AccountNumSearch;
	private JTextField Amount;
	private JTextField LoanAmountIn;
	private JTextField APRIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java_Bank window = new Java_Bank();
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
	public Java_Bank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		LinkList newCust = new LinkList();
		frame = new JFrame();
		frame.setBounds(100, 100, 737, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 721, 519);
		frame.getContentPane().add(tabbedPane);
		
		JPanel Welcome = new JPanel();
		tabbedPane.addTab("Welcome", null, Welcome, null);
		Welcome.setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][][][][][][][][][][][]"));
		
		JLabel label_1 = new JLabel(" ");
		Welcome.add(label_1, "cell 7 0");
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Java Bank Account Interface");
		lblWelcomeToThe.setForeground(Color.DARK_GRAY);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Welcome.add(lblWelcomeToThe, "cell 5 1,alignx center");
		
		JLabel label_4 = new JLabel(" ");
		Welcome.add(label_4, "cell 5 2");
		
		JLabel lblDirectionsTheNew = new JLabel("Directions: The New Account tab enables input of a customer");
		Welcome.add(lblDirectionsTheNew, "cell 5 3");
		
		JLabel label_5 = new JLabel(" ");
		Welcome.add(label_5, "cell 5 4");
		
		JLabel lblTheBalanceTab = new JLabel("The Balance tab enables serach and display of all the customer info ");
		Welcome.add(lblTheBalanceTab, "cell 5 5");
		
		JLabel label_6 = new JLabel(" ");
		Welcome.add(label_6, "cell 5 6");
		
		JLabel lblTheLoanTab = new JLabel("The Loan tab enables new loans for a customer searched in the Balance tab");
		Welcome.add(lblTheLoanTab, "cell 5 7");
		
		JLabel label_7 = new JLabel(" ");
		Welcome.add(label_7, "cell 5 8");
		
		JLabel label_8 = new JLabel(" ");
		Welcome.add(label_8, "cell 5 9");
		
		JLabel label_9 = new JLabel(" ");
		Welcome.add(label_9, "cell 5 10");
		
		JLabel lblTotalCustomers = new JLabel("Total Customers: " + String.valueOf(Customers));
		Welcome.add(lblTotalCustomers, "cell 6 14");
		
		JPanel NewAccount = new JPanel();
		tabbedPane.addTab("New Account", null, NewAccount, null);
		NewAccount.setLayout(new MigLayout("", "[][][grow]", "[][][][][][][][][][][]"));
		
		JLabel lblNewCustomerName = new JLabel("New Customer Name");
		lblNewCustomerName.setForeground(Color.BLUE);
		NewAccount.add(lblNewCustomerName, "cell 2 0");
		
		JLabel lblLastName = new JLabel("Last Name");
		NewAccount.add(lblLastName, "cell 1 1,alignx trailing");
		
		LastName = new JTextField();
		NewAccount.add(LastName, "flowx,cell 2 1,alignx left");
		LastName.setColumns(20);
		
		JLabel lblFirstName = new JLabel("First Name");
		NewAccount.add(lblFirstName, "cell 2 1");
		
		FirstName = new JTextField();
		NewAccount.add(FirstName, "cell 2 1");
		FirstName.setColumns(16);
		
		JLabel lblMiddleInitial = new JLabel("Middle Initials");
		NewAccount.add(lblMiddleInitial, "cell 2 1");
		
		MInitial = new JTextField();
		NewAccount.add(MInitial, "cell 2 1");
		MInitial.setColumns(3);
		
		JLabel lblCustomerAddress = new JLabel("Customer Address");
		lblCustomerAddress.setForeground(Color.BLUE);
		NewAccount.add(lblCustomerAddress, "cell 2 2");
		
		JLabel lblHouseapt = new JLabel("House/Apt #");
		NewAccount.add(lblHouseapt, "cell 1 3,alignx trailing");
		
		HouseNum = new JTextField();
		NewAccount.add(HouseNum, "flowx,cell 2 3,alignx left");
		HouseNum.setColumns(8);
		
		JLabel lblStreetName = new JLabel("Street Name");
		NewAccount.add(lblStreetName, "cell 2 3");
		
		StreetName = new JTextField();
		NewAccount.add(StreetName, "cell 2 3");
		StreetName.setColumns(20);
		
		JLabel lblCity = new JLabel("City");
		NewAccount.add(lblCity, "cell 1 4,alignx trailing");
		
		City = new JTextField();
		NewAccount.add(City, "flowx,cell 2 4,alignx left");
		City.setColumns(20);
		
		JLabel lblState = new JLabel("State");
		NewAccount.add(lblState, "cell 2 4");
		
		State = new JTextField();
		NewAccount.add(State, "cell 2 4");
		State.setColumns(15);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		NewAccount.add(lblZipCode, "cell 2 4");
		
		Zip = new JTextField();
		NewAccount.add(Zip, "cell 2 4");
		Zip.setColumns(5);
		
		JLabel Spacer1 = new JLabel(" ");
		NewAccount.add(Spacer1, "cell 2 5,aligny baseline");
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		NewAccount.add(lblPhoneNumber, "cell 1 6,alignx trailing");
		
		Phone = new JTextField();
		NewAccount.add(Phone, "flowx,cell 2 6,alignx left");
		Phone.setColumns(10);
		
		JLabel Spacer8 = new JLabel("           ");
		NewAccount.add(Spacer8, "cell 2 6");
		
		JLabel lblInitialBalance = new JLabel("Initial Balance");
		NewAccount.add(lblInitialBalance, "cell 2 6,alignx trailing");
		
		IntBalance = new JTextField();
		IntBalance.setText("xxx.xx");
		NewAccount.add(IntBalance, "cell 2 6,alignx left");
		IntBalance.setColumns(10);
		
		JLabel Spacer2 = new JLabel(" ");
		NewAccount.add(Spacer2, "cell 2 7");
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setHorizontalAlignment(SwingConstants.CENTER);
		NewAccount.add(lblAccountNumber, "cell 1 8");
		
		JLabel NewAccountNum = new JLabel("1XXXXXXXX");
		NewAccount.add(NewAccountNum, "cell 2 8");
		
		JLabel Spacer3 = new JLabel(" ");
		NewAccount.add(Spacer3, "cell 2 9,alignx right,aligny baseline");
		
		JLabel CustomerAdded = new JLabel(" ");
		NewAccount.add(CustomerAdded, "cell 2 10");
		
		JButton btnAddCustomer = new JButton("Add Customer");
		NewAccount.add(btnAddCustomer, "cell 1 10");
		
		JPanel Balance = new JPanel();
		tabbedPane.addTab("Balance", null, Balance, null);
		Balance.setLayout(new MigLayout("", "[][][][][grow]", "[][][][][][][][][][][][][][][grow]"));
		
		JLabel lblSearchByAccount = new JLabel("Search by Account Number");
		Balance.add(lblSearchByAccount, "cell 2 1");
		
		AccountNumSearch = new JTextField();
		AccountNumSearch.setToolTipText("All numbers are 9 digits starting with 1");
		AccountNumSearch.setText("1XXXXXXXX");
		Balance.add(AccountNumSearch, "flowx,cell 4 1,alignx left");
		AccountNumSearch.setColumns(9);
		
		JLabel label = new JLabel("");
		Balance.add(label, "flowx,cell 4 2");
		
		JLabel lblCustomerInformation = new JLabel("Customer Information");
		lblCustomerInformation.setForeground(Color.BLUE);
		Balance.add(lblCustomerInformation, "cell 2 3");
		
		JLabel lblName = new JLabel("Name");
		Balance.add(lblName, "cell 2 4");
		
		JButton btnSearch = new JButton("Search");
		Balance.add(btnSearch, "cell 4 1");
		
		JLabel LNameResult = new JLabel(" ");
		Balance.add(LNameResult, "flowx,cell 4 4");
		
		JLabel FNameResult = new JLabel(" ");
		Balance.add(FNameResult, "cell 4 4");
		
		JLabel MIntResult = new JLabel(" ");
		Balance.add(MIntResult, "cell 4 4");
		
		JLabel lblAddress = new JLabel("Address");
		Balance.add(lblAddress, "cell 2 5");
		
		JLabel HouseNumResult = new JLabel(" ");
		Balance.add(HouseNumResult, "flowx,cell 4 5");
		
		JLabel StreetResult = new JLabel(" ");
		Balance.add(StreetResult, "cell 4 5");
		
		JLabel CityResult = new JLabel(" ");
		Balance.add(CityResult, "flowx,cell 4 6");
		
		JLabel StateResult = new JLabel(" ");
		Balance.add(StateResult, "cell 4 6");
		
		JLabel ZipResult = new JLabel(" ");
		Balance.add(ZipResult, "cell 4 6");
		
		JLabel Spacer4 = new JLabel("                   ");
		Balance.add(Spacer4, "cell 4 1");
		
		JButton btnDeleteAccount = new JButton("Delete Account");
		Balance.add(btnDeleteAccount, "cell 4 1");
		
		JLabel lblPhoneNumber_1 = new JLabel("Phone Number");
		Balance.add(lblPhoneNumber_1, "cell 2 7");
		
		JLabel PhoneResult = new JLabel(" ");
		Balance.add(PhoneResult, "cell 4 7");
		
		JLabel Spacer5 = new JLabel(" ");
		Balance.add(Spacer5, "cell 4 8");
		
		JLabel lblBalance = new JLabel("Balance");
		Balance.add(lblBalance, "cell 2 9");
		
		JLabel TheBalance = new JLabel(" ");
		Balance.add(TheBalance, "cell 4 9");
		
		JLabel Spacer6 = new JLabel(" ");
		Balance.add(Spacer6, "cell 4 10");
		
		JLabel lblEnterDollarAmount = new JLabel("Enter Dollar Amount");
		Balance.add(lblEnterDollarAmount, "cell 2 11");
		
		Amount = new JTextField();
		Amount.setText("xxx.xx");
		Amount.setToolTipText("Enter xxx.xx  format");
		Balance.add(Amount, "flowx,cell 4 11,alignx left");
		Amount.setColumns(10);
		
		JButton btnDeposit = new JButton("Deposit");
		Balance.add(btnDeposit, "cell 4 11");
		
		JLabel Spacer7 = new JLabel("          ");
		Balance.add(Spacer7, "cell 4 11");
		
		JButton btnWithdraw = new JButton("Withdraw");
		Balance.add(btnWithdraw, "cell 4 11");
		
		JLabel Spacer9 = new JLabel("                                                       ");
		Balance.add(Spacer9, "cell 4 2");
		
		JLabel AccountDeleted = new JLabel(" ");
		AccountDeleted.setForeground(Color.red);
		Balance.add(AccountDeleted, "cell 4 2");
		
		JLabel label_10 = new JLabel(" ");
		Balance.add(label_10, "cell 2 12");
		
		JLabel lblLoans = new JLabel("Loans");
		Balance.add(lblLoans, "cell 2 14");
		
		JTextArea LoansArea = new JTextArea();
		Balance.add(LoansArea, "flowx,cell 4 14,grow");
		
		JPanel Loan = new JPanel();
		tabbedPane.addTab("Loan", null, Loan, null);
		Loan.setLayout(new MigLayout("", "[][][grow][][][][21.00][][][][][][][81.00][][][][][][][][][][][][][][][][]", "[][][][][][][][][][][]"));
		
		JLabel lblNewLoansFor = new JLabel("New Loans for 2015");
		lblNewLoansFor.setForeground(Color.BLUE);
		lblNewLoansFor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Loan.add(lblNewLoansFor, "cell 1 0");
		
		JLabel label_2 = new JLabel(" ");
		Loan.add(label_2, "cell 1 1");
		
		JLabel lblCustomer = new JLabel("Customer");
		Loan.add(lblCustomer, "cell 1 2");
		
		JLabel LNameLoans = new JLabel("                        ");
		Loan.add(LNameLoans, "cell 2 2");
		
		JLabel FNameLoans = new JLabel("                      ");
		Loan.add(FNameLoans, "cell 3 2");
		
		JLabel MNameLoans = new JLabel("       ");
		Loan.add(MNameLoans, "cell 4 2");
		
		JLabel lblAccountNumber_1 = new JLabel("Account Number");
		Loan.add(lblAccountNumber_1, "cell 1 3");
		
		JLabel AccountNumLoans = new JLabel("              ");
		Loan.add(AccountNumLoans, "cell 2 3");
		
		JLabel label_3 = new JLabel(" ");
		Loan.add(label_3, "cell 1 4");
		
		JLabel label_11 = new JLabel(" ");
		Loan.add(label_11, "cell 1 5");
		
		JLabel lblLoanAmount = new JLabel("Loan Amount: ");
		Loan.add(lblLoanAmount, "cell 1 6,alignx trailing");
		
		LoanAmountIn = new JTextField();
		LoanAmountIn.setToolTipText("Only include numeric characters");
		Loan.add(LoanAmountIn, "cell 2 6,growx");
		LoanAmountIn.setColumns(10);
		
		JLabel lblApr = new JLabel("APR :");
		Loan.add(lblApr, "cell 1 7,alignx trailing");
		
		APRIn = new JTextField();
		APRIn.setToolTipText("Only include numeric characters");
		Loan.add(APRIn, "cell 2 7,growx");
		APRIn.setColumns(10);
		
		JLabel label_12 = new JLabel(" ");
		Loan.add(label_12, "cell 1 8");
		
		JButton btnAddLoan = new JButton("Add Loan");
		Loan.add(btnAddLoan, "cell 1 9");
		
		JLabel LoanMsg = new JLabel(" ");
		Loan.add(LoanMsg, "cell 2 9");
		
		btnAddCustomer.addActionListener(new ActionListener() {
			/**
			* Action Listener for the add new customer button.
			*/
						public void actionPerformed(ActionEvent arg0) {
							
							try {
								
								info [0] = LastName.getText();
								info [1] = FirstName.getText();
								info [2] = MInitial.getText();
								info [3] = HouseNum.getText();
								info [4] = StreetName.getText();
								info [5] = City.getText();
								info [6] = State.getText();
								info [7] = Zip.getText();
								info [8] = Phone.getText();
								info [9] = IntBalance.getText();
								info[10] = Integer.toString(AccountNum);
								info[11] = "None";
								
								newCust.addInfo(info);
								
								NewAccountNum.setForeground(Color.blue);
								NewAccountNum.setText(Integer.toString((AccountNum + 100000000)));
								CustomerAdded.setForeground(Color.blue);
								CustomerAdded.setText("Customer Added");
								AccountNum++;
								Customers++;
								lblTotalCustomers.setText("Total Customers: " + String.valueOf(Customers));
										
							}
							catch (Exception exepction)
							{
								CustomerAdded.setForeground(Color.red);
								CustomerAdded.setText("Input Error");
							}	
							
						}
					});
		btnSearch.addActionListener(new ActionListener() {
			/**
			* Action Listener for the search button.
			*/					
						public void actionPerformed(ActionEvent arg1) {
							
							try {
								LNameResult.setForeground(Color.black);
								FNameResult.setText(" ");
								MIntResult.setText(" ");
								HouseNumResult.setText(" ");
								StreetResult.setText(" ");
								CityResult.setText(" ");
								StateResult.setText(" ");
								ZipResult.setText(" ");
								PhoneResult.setText(" ");
								TheBalance.setText(" ");
								AccountDeleted.setText(" ");
								LoansArea.setText(" ");
								
								LNameLoans.setText(" ");
								FNameLoans.setText(" ");
								MNameLoans.setText(" ");
								AccountNumLoans.setText(" ");
								
								String tempNum = AccountNumSearch.getText();
								int tempAccountNum; 
								tempAccountNum = Integer.parseInt(tempNum) - 100000000;
								
								if (newCust.Search(tempAccountNum)){
									
									info = newCust.CustInfo().clone();
									
									LNameResult.setText(info[0] + ", ");
									FNameResult.setText(info[1] + " ");
									MIntResult.setText(info[2]);
									HouseNumResult.setText(info[3] + " ");
									StreetResult.setText(info[4]);
									CityResult.setText(info[5] + ", ");
									StateResult.setText(info[6] + " ");
									ZipResult.setText(info[7]);
									PhoneResult.setText(info[8]);
									LoansArea.setText(info[11]);
									
									LNameLoans.setText(info[0] + ", ");
									FNameLoans.setText(info[1] + " ");
									MNameLoans.setText(info[2]);
									
									int tempAccountNumL = Integer.parseInt(info[10]) + 100000000;
									AccountNumLoans.setText(Integer.toString(tempAccountNumL));
									
									double amount = Double.parseDouble(info[9]);
									if (amount < 0){
										TheBalance.setForeground(Color.red);
									}else{
										TheBalance.setForeground(Color.black);
									}
									
									TheBalance.setText("$ " + info[9]);
									
								}else{
									LNameResult.setForeground(Color.red);
									LNameResult.setText("Customer not found");
								}
									
							}
							catch (Exception exepction)
							{
								LNameResult.setForeground(Color.red);
								LNameResult.setText("Error");
							}	
						}
					});
		
		btnDeleteAccount.addActionListener(new ActionListener() {
			/**
			* Action Listener for the delete button.
			*/	
					public void actionPerformed(ActionEvent arg0) {
				
						try {
							newCust.Delete();
							AccountDeleted.setText("Account Deleted");
							Customers--;
							lblTotalCustomers.setText("Total Customers: " + String.valueOf(Customers));
						}
						catch (Exception exepction)
						{
							AccountDeleted.setText("Error");
						}	
				
			}
		});
		
		btnDeposit.addActionListener(new ActionListener() {
			/**
			* Action Listener for the deposit button.
			*/	
			public void actionPerformed(ActionEvent e) {
				
				try {
					deposit = true;
					TheBalance.setForeground(Color.black);
					
					double amount = Double.parseDouble(Amount.getText());
					double newBalance = newCust.Balance(deposit, amount);
					info[9] = String.valueOf(newBalance);
					
					if (newBalance < 0){
						TheBalance.setForeground(Color.red);
						TheBalance.setText("$ " + info[9]);
					}else{
						TheBalance.setText("$ " + info[9]);
					}
				}
				catch (Exception exepction)
				{
					TheBalance.setForeground(Color.red);
					TheBalance.setText("Error");
				}	
			}
		});
		
		btnWithdraw.addActionListener(new ActionListener() {
			/**
			* Action Listener for the withdraw button.
			*/	
			public void actionPerformed(ActionEvent e) {
				
				try {
					deposit = false;
					TheBalance.setForeground(Color.black);
					
					double amount = Double.parseDouble(Amount.getText());
					double newBalance = newCust.Balance(deposit, amount);
					info[9] = String.valueOf(newBalance);
					
					if (newBalance < 0){
						TheBalance.setForeground(Color.red);
						TheBalance.setText("$ " + info[9]);
					}else{
						TheBalance.setText("$ " + info[9]);
					}
				}
				catch (Exception exepction)
				{
					TheBalance.setForeground(Color.red);
					TheBalance.setText("Error");
				}
			}
		});
		
		btnAddLoan.addActionListener(new ActionListener() {
			/**
			* Action Listener for the loan button.
			*/	
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					LoanMsg.setForeground(Color.blue);
					
					info[11] = "$ " + LoanAmountIn.getText() + "  at  " + APRIn.getText() + "%"; 
					
					info[11] = newCust.custLoan(info[11]);
					
					LoansArea.setText(info[11]);
					
					LoanMsg.setText("Loan Added");
				}
				catch (Exception exepction)
				{
					LoanMsg.setForeground(Color.red);
					LoanMsg.setText("Error");
				}
			}
		});
		
		
		
		
		
		
	}
}


