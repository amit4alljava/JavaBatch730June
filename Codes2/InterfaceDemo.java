//interfaces are 100% abstract
// What to do
// What inside interface (abstract methods + constants)
abstract interface IPlayer{
	public static final int MAX_POWER = 100;
	int DEFAULT_POWER = 10;
	public abstract void attack();
	void jump();
	void run();
	void powerIncrement();
	void dead();
}
class RedPlayer implements IPlayer{

	@Override
	public void attack() {
		System.out.println("Red Player Attack Using Punches");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerIncrement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dead() {
		// TODO Auto-generated method stub
		
	}
	
}
class WhitePlayer implements IPlayer{
	private int power =DEFAULT_POWER;
	@Override
	public void attack(){
		System.out.println("White Player Attack Using Kicks");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerIncrement() {
		// TODO Auto-generated method stub
		if(power<MAX_POWER){
			power++;
		}
		System.out.println("Power Incremented "+power);
	}

	@Override
	public void dead() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlayer player = new WhitePlayer();
		player.attack();
	}

}
