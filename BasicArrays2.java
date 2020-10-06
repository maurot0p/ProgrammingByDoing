import java.util.Random;
public class BasicArrays2
{
public static void main(String args[]){
	Random r = new Random();
	int slot[] = {1 + r.nextInt(100),1 + r.nextInt(100),1 + r.nextInt(100),1 + r.nextInt(100),1 + r.nextInt(100),1 + r.nextInt(100),1 + r.nextInt(100),1 + r.nextInt(100),1 + r.nextInt(100),1 + r.nextInt(100)};

	 for (int i=0; i<slot.length; i++)
		System.out.println("Slot " + i + " contains " + slot[i]);
	
	}
}