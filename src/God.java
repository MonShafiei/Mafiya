import java.util.Random;
import java.util.Scanner;

//	Hello mohsen;
//	How are you?

public class God {
	int n =10;
	
	//Scanner input = new Scanner(System.in);
	
	Random ran = new Random();
	
	Person[] mafiyas = new Person[n];
	
	int mafiya_count ;	//
	int docter_count;
	int detective;
	int police_count;
	int person_will_be_kill;
	int person_willnot_be_kell;
	int person_is_mafiya;
	
	public God()
	{
		
		mafiya_count = n/3;	//
		//System.out.println(mafiya_count );
		docter_count = 1;
		detective = 1;
		police_count = n - mafiya_count - docter_count - detective;
		
		
		
	for(int i=0;i<n;i++)
	{
		if(docter_count >0)
		{
			mafiyas[i] = new Person();
			docter_count--;
			mafiyas[i].role = 2;
		}
		else if(detective>0)
		{
			mafiyas[i] = new Person();
			detective--;
			mafiyas[i].role = 3;
		}
		else if(mafiya_count>0)
		{
			mafiyas[i] = new Person();
			mafiya_count --;	
			mafiyas[i].role = 1;	
		}
		else if(police_count>0)
		{
			mafiyas[i] = new Person();
			police_count --;	
			mafiyas[i].role = 4;	
		}
		
			
		
	}
	
	}
	
	
	
	public boolean get_is_mafiya(int j)
	{
		if(mafiyas[j].role == 1)
		{
			return true;
		}		
			return false;		
	}
	
	public boolean get_is_doctor(int j)
	{
		if(mafiyas[j].role == 2)
		{
			return true;
		}		
			return false;
	}
	
	public boolean get_is_detective(int j)
	{
		if(mafiyas[j].role == 3)
		{
			return true;
		}		
			return false;	
	}
	
	public boolean get_is_police(int j)
	{
		if(mafiyas[j].role == 4)
		{
			return true;
		}		
			return false;	
	}
	
	
	
	
	
	
	
	

}
