

public class DataStorage {
	
	public String[] data = new String[12];

	public DataStorage next;
	
	
	public DataStorage(String[] dataP) {
		
		for (int i =0; i < 12; i++)
			data[i] = dataP[i];		
	
	}
}

class LinkList {
	
	public DataStorage firstLink, tempStore;
	private double Balance; 
	private int SerialNumber;

// checks to see if linkedlist is empty
	public boolean isEmpty(){
		return(firstLink == null);
	}
	
// adds customer info to the link
	public void addInfo(String[] dataP) {
		
		DataStorage newLink = new DataStorage(dataP);
			
		newLink.next = firstLink;
			
		firstLink = newLink;

	}
	
// searches links for customer	
	public boolean Search(int SerialNumberP) {

		DataStorage theLink = firstLink;
		
		SerialNumber = Integer.parseInt(theLink.data[10]);

		if(!isEmpty()){
			
			while(SerialNumber != SerialNumberP){
				if(theLink.next == null){
	
					return false;
				}else{
					theLink = theLink.next;
					SerialNumber = Integer.parseInt(theLink.data[10]);
				}
			
			}
		}
		tempStore = theLink;
		return true;
	}

// returns customer info if the Search method is successful	
	public String[] CustInfo(){
		return tempStore.data;
	}
	
// deletes the account
	public void Delete(){
	
		DataStorage deleteLink = firstLink;
		DataStorage previousLink = firstLink;
		
		while(tempStore != deleteLink)
		{
			previousLink = deleteLink;
			deleteLink = deleteLink.next;
		}
		
		if (deleteLink == firstLink)
		{
			firstLink = firstLink.next;
		}else{
			previousLink.next = deleteLink.next;
		}		
	}

// changes the balance depending on which button is pushed	
	public double Balance(boolean deposit, double amount){
		
		double custBalance = Double.parseDouble(tempStore.data[9]); 
		if (deposit == true){
			custBalance = custBalance + amount;
		}else{
			custBalance = custBalance - amount;
		}
		
		tempStore.data[9] = String.valueOf(custBalance);
		
		return custBalance;
	}

// adds a loan to a customer

	public String custLoan(String loan){
		
		if (tempStore.data[11].equals("None")){
			tempStore.data[11] = loan;
		}else{
			tempStore.data[11] = tempStore.data[11] + "\n" + loan;
		}
		return tempStore.data[11];
	}

}
	
