package org.emp;

public class ClientDetails extends CompanyDetails {
	
	public void cliId() {

		System.out.println("Client id is N292284");
	}

public static void main(String[] args) {
	
	ClientDetails c = new ClientDetails();
	c.cliId();
	c.comId();
	c.comName();
	c.empId();
	c.empName();
	
}



}
