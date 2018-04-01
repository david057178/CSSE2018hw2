/**
 * 
 */

/**
 * @author Owner
 *
 */

import java.util.*;
import java.io.*;

public class GradeSys extends Grades {
	int weight[];
	int avg;
	Map<String,Grades> map;
	Grades user;
	
	public GradeSys()throws IOException {	
		setMap();
		setWeight();
		avg=countAvg();
		user=null;
	}
	private void setWeight() {
		weight=new int[5];
		weight[0]=10;
		weight[1]=10;
		weight[2]=10;
		weight[3]=30;
		weight[4]=40;
	}
	private void setMap() throws IOException {
		map=new HashMap<>();
		//FileReader fr = new FileReader("src/gradeinput");
		FileReader fr = new FileReader("src/testcase1");
		BufferedReader br = new BufferedReader(fr);
		while (br.ready()) {
			Grades g=new Grades();
			String[] str=br.readLine().split(" ");
			g.ID=str[0];
			g.name=str[1];
			for(int i=0;i<5;i++) g.grades[i]=Integer.valueOf(str[i+2]);
			map.put(str[0],g);
		}
		fr.close();
	}
	public int countAvg() {
		int average=0;
		Set<String> keySet = map.keySet();
	    Iterator<String> it = keySet.iterator();
	    while(it.hasNext()){
	    	String key = it.next();
	    	average += map.get(key).total;
	    }
	    average/=map.size();
	    return average;
	}
	public void countAllTotal() {
		Set<String> keySet = map.keySet();
	    Iterator<String> it = keySet.iterator();
	    while(it.hasNext()){
	    	String key = it.next();
	    	map.get(key).countEachTotal(weight);
	    }
	}
	public void countRank() {
		
	}
	public void showGrade() {
		if(user.grades[0]>59)System.out.println(user.name+"¦¨ÁZ:lab1:     "+user.grades[0]);
		else System.out.println(user.name+"¦¨ÁZ:lab1:     "+user.grades[0]+"*");
		if(user.grades[1]>59)System.out.println("      lab2:     "+user.grades[1]);
		else System.out.println("      lab2:     "+user.grades[1]+"*");
		if(user.grades[2]>59)System.out.println("      lab3:     "+user.grades[2]);
		else System.out.println("      lab3:     "+user.grades[2]+"*");
		if(user.grades[3]>59)System.out.println("      mid-term :  "+user.grades[3]);
		else System.out.println("      mid-term :  "+user.grades[3]+"*");
		if(user.grades[4]>59)System.out.println("      final exam : "+user.grades[4]);
		else System.out.println("      final exam : "+user.grades[4]+"*");
		user.countEachTotal(weight);
		if(user.total>59)System.out.println("      total grade : "+user.total);
		else System.out.println("      total grade : "+user.total+"*");
	}
	public void showRank() {
		countRank();
		System.out.println(user.rank);
	}
	public void showAverage() {
		avg=countAvg();
		System.out.println(avg);
	}
	public void changeWait() {
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			weight[i]=scanner.nextInt();
		}
		scanner.close();
		countAllTotal();
	}
}
