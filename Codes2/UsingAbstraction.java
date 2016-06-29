interface IAccount{
	public void withDraw(double amount , int pinCode);
}
class Account implements IAccount{
	@Override
	public void withDraw(double amount, int pinCode){
		if(isAccountExist(pinCode)){
			if(isTransactionAvaliable()){
				System.out.println("WithDraw Done SuccessFully....");
			}
			else
			{
				System.out.println("Transaction is not Avaliable....");
			}
		}
		else{
			System.out.println("Invalid PinCode No");
		}
	}
	
	public boolean isTransactionAvaliable(){
		return true;
	}
	
	public boolean isAccountExist(int pinCode){
		if(pinCode>=1001){
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class UsingAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAccount account = new Account();
		
		//account.isAccountExist(1002);
		//account.isTransactionAvaliable();
		account.withDraw(9999, 1003);
		

	}

}
