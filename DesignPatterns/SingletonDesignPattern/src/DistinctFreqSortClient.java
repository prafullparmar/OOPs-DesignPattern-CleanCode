import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
//This program outputs unique strings in descending order of their frequency in the input

//Class implementing Comparator to compare strings
class strFreqComparator implements Comparator<String>
{
	
	public HashMap<String,Integer> hm = null;
	public LoggerClass log;
	
	public strFreqComparator(HashMap<String,Integer> hm,LoggerClass log) {
		this.hm = hm;
		this.log = log;
	}
	
	@Override
	public int compare(String s1,String s2)
	{
		
		log.logger.log(Level.INFO,"Comparing: ->"+ s1+": "+hm.get(s1)+" & "+ s2+": "+hm.get(s1)+";");
		int freqCompare = hm.get(s1).compareTo(hm.get(s2));
		int valCompare = s1.compareTo(s2);
		
		if(freqCompare == 0)
		{
			return -valCompare;
			
		}
		else {
			return -freqCompare;
		}
		
	}
}

public class DistinctFreqSortClient {

	public static void main(String[] args)
	{
		ArrayList<String> array1 = new ArrayList<String>();
		HashMap<String,Integer> hmap = new HashMap<>();
		String tempStr = null;
		String name = "LogFile1";
		//Requesting a Instance of Logger class with name LogFile1
		LoggerClass log = LoggerClass.getInstance(name);
		log.logger.log(Level.INFO, "Expecting an instance of name "+ name);
		log.logger.log(Level.INFO, "Received an instance with name "+ log.name);
	
		
		System.out.println("Enter number of Strings");
		Scanner in = new Scanner(System.in);
		int numOfStr = in.nextInt();
		System.out.println("Enter the "+numOfStr+" Strings :");
		for(int i=0;i<numOfStr ;i++)
		{
			tempStr = in.next();
			array1.add(tempStr);
			int freq = hmap.getOrDefault(tempStr, 0);
			hmap.put(tempStr,freq+1);		
		}
		
		ArrayList<String> array2 = new ArrayList<>(hmap.keySet());
		log.logger.log(Level.INFO,"Instance: "+log.name + " The keyset is :"+ array2);
		
		//Requesting a Instance of Logger class with name LogFile2
		name = "LogFile2";
	    log = LoggerClass.getInstance(name);
		log.logger.log(Level.INFO, "Expecting an instance of name "+ name);
		log.logger.log(Level.INFO, "Received an instance with name "+ log.name);
		
        //Sorting the strings using the custom comparator
		strFreqComparator cmp = new strFreqComparator(hmap,log);
		Collections.sort(array2, cmp);
		System.out.println(array2);
		log.logger.log(Level.INFO,"Instance: "+log.name + " The unique sorted by frequency strings are:"+ array2);	
		
	}
		
}
