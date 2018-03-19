package parcial;

import java.io.*;

public class LongQueue {
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int numP;
		int count = 0;
		try {
			numP = Integer.parseInt(input);
			int Group[] = new int[numP];
			while(!input.equals("0"))
			{
				String []temp = br.readLine().split("");
				for(int i = 0; i  < temp.length; i++)
				{
					Group[i] = Integer.parseInt(temp[i]);
					if(Group[i] < Group[i+1]) 
					{
						count++;
					}else if(Group[i] > Group[i+1])
					{
						count++;
					}
					System.out.println(count);
				}
			}
		}catch(Exception ex) {
			
		}
	}		
}
