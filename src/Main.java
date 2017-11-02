import java.nio.charset.MalformedInputException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		God god = new God();
		//Thread.sleep(200);
		Scanner input = new Scanner(System.in);
		int repeat = 0;		
		
		int[] select4kill_ar = new  int[god.mafiyas.length/3];
		int[] WillBeKillCount = new int [god.mafiyas.length/3];
		
		//System.out.println(god.mafiya_count);
		int count=0;
		int kill_count_rant = 0;
		int Count_Live_Mafiye ;
		do
		{
		// night;
			Count_Live_Mafiye =0;
			
			for(int m=0;m< god.mafiyas.length;m++)
			{
				if(god.mafiyas[m].role == 1 && god.mafiyas[m].is_dead == false)
				{
					Count_Live_Mafiye ++;
					//System.out.println(god.mafiyas[m].is_dead);
					//System.out.println(Count_Live_Mafiye);
				}
			}
			
			for(int i=0;i< god.mafiyas.length; i++)
			{
				
				if(god.mafiyas[i].role == 1 && god.mafiyas[i].is_dead == false)
				{					
					select4kill_ar[count] =  god.mafiyas[i].select_for_kill();
					//System.out.println(count);
					count++;					
					
					
				}
				
				if(i==god.mafiyas.length-1)
				{
					for(int j =0 ; j<Count_Live_Mafiye;j++ )
					{
						//int kill=select4kill_ar[i];
						for(int k=j; k <Count_Live_Mafiye;k++)
						{
							if(select4kill_ar[j] == select4kill_ar[k] && k != j )
							{
								WillBeKillCount[j]++;								
							}
														
							
						}
					}
					
					//int kill_count_rant = 0;
					for(int l=0;l<Count_Live_Mafiye;l++)
					{
						if(kill_count_rant <= WillBeKillCount[l] )
						{
							kill_count_rant = WillBeKillCount[l];
							god.person_will_be_kill =	select4kill_ar[l];
						}						
					}
					if(kill_count_rant <= 2 )
					{
						i=0;
						count = 0;
					}
				}
				
				//System.out.println(kill_count_rant);
				//System.out.println(god.person_will_be_kill);
			}
			
			
			
			System.out.println("We will kill "+ god.person_will_be_kill);
			//System.out.println(god.person_will_be_kill);
			
			
			
			for(int j=0;j< god.mafiyas.length;j++)
			{
				if(god.mafiyas[j].role == 2 && god.mafiyas[j].is_dead == false)
				{
					
					god.person_willnot_be_kell =  god.mafiyas[j].select_for_help();
					System.out.println("Doctor select "+ god.person_willnot_be_kell);
				}
			}
			
			for(int j=0;j< god.mafiyas.length;j++)
			{
				if(god.mafiyas[j].role == 3 && god.mafiyas[j].is_dead == false)
				{
					god.person_is_mafiya =  god.mafiyas[j].select_for_detect_mafiya();
					System.out.println("Detective say mafiya is  "+ god.person_is_mafiya);
				}
			}
			
			if(god.person_will_be_kill != god.person_willnot_be_kell)
			{
				god.mafiyas[god.person_will_be_kill].is_dead = true;
				System.out.println("The god kill  "+ god.person_will_be_kill);				
			}
			
			
			
			
			System.out.println("If you want to exit press '1' and you don't want to exit '0'");
			if(1==input.nextInt())
			{
			repeat = 1;
			}
			
			kill_count_rant = 0;
			count = 0;
			for(int i =0;i <WillBeKillCount.length;i++)
			{
				WillBeKillCount[i]=0;
			}
			
		}while(repeat==0);
		
		

	}

}
