import java.util.Random;

public class Person {

	int role;	//	mafia = 1 ; doctor = 2 ; detective = 3 ; police = 4 ;
	int id;
	int will_be_kill;
	int will_be_help;
	int is_mafiya;
	String name;
	boolean is_dead;
	
	Random ran = new Random();
	
	
	
	public int select_for_kill()
	{
		will_be_kill = ran.nextInt(10);
		return(will_be_kill);
	}
	
	public int select_for_help()
	{
		will_be_help = ran.nextInt(10);
		return(will_be_help);
	}
	
	
	public int select_for_detect_mafiya()
	{
		is_mafiya = ran.nextInt(10);
		return(is_mafiya);
	}
	
	
	
	
	
}
