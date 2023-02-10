package org.bank;

public class BankInfo extends AxisBank {
      public void savings() {
    	  System.out.println("savings is 1%");
}
      public void deposit() {
    	  System.out.println("deposit is 3%");
      }
      public void fixed() {
    	  System.out.println("fixed is 5%");
      }
      public void deposit() {
    	  System.out.println("deposit is 7%");
      }
  
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.savings();
		b.deposit();
		b.fixed();

	}

}
