import java.io.*;


public class Grades {
	String ID;
	String name;
	int[] grades;
	int total;
	int rank;
	
	public Grades() throws IOException {
		ID=null;
		name=null;
		grades=new int[5];
		for(int i=0;i<5;i++) grades[i]=0;
		total=0;
		rank=0;
	}
		
	public void countEachTotal(int[] weight) {
		double t=0;
		for(int i=0;i<5;i++) {
			t+=grades[i]*weight[i]*0.01;
		}
		total=(int)Math.round(t);
	}
}
