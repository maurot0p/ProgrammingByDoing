import java.util.Scanner;
public class Solution {
  public static void main(String[] args) {
  
    Scanner keyboard= new Scanner(System.in);
    int factorial=1;
    System.out.println("Which factorial do you want?");
    int n= keyboard.nextInt();
      for(int i=1; i<n+1; i++){
        factorial=i*factorial;
        }
      System.out.println("The result is " + factorial);
  }
}


    public int getBench() {
        SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        int bench = sharedPreferences.getInt("StartingBench", 0);

        return bench;
    }
    public int getSquat() {
        SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        int squat = sharedPreferences.getInt("StartingSquat", 0);

        return squat;
    }
    public int getDead() {
        SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        int dead = sharedPreferences.getInt("StartingDead", 0);

        return dead;
    }
    public int getOhp() {
        SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        int ohp = sharedPreferences.getInt("StartingOhp", 0);

        return ohp;
    }