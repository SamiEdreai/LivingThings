package LivingThing;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("how many objects create?");
		int x = s.nextInt();
		
		LivingThing[] arr = new LivingThing[x];
				
		for (int i=0; i<arr.length; i++) {
			System.out.print("what type of object? (1,2,3)");
			int choice = s.nextInt();
			
			switch(choice) {
			case 1:
				arr[i] = new Chita("chittie", 0.8,67);
				break;
			case 2:
				arr[i] = new Runner("Rani",12.2);
				break;
			case 3:
				arr[i] = new Thief("gogo",1.77,(int)(Math.random()*30));
				break;
			default:
				break;
			}
			
		}
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] instanceof Thief) {
				((Thief)arr[i]).steal();
			}
			if (arr[i] instanceof Runnable) {
				((Runnable)arr[i]).run();
			}
		}
		
		Object[] dupArr = new Object[arr.length];
		for (int i=0; i<arr.length; i++) {
			dupArr[i] = arr[i].clone();
		}
		
		System.out.println("This cuplicated arr:");
		for (int i=0; i<arr.length;i++) {
			System.out.println(dupArr[i]);
		}
		
		
		int numOfBreathable = 0;
		int numOfRunners = 0;
		int numOfThives = 0;
		for (int i=0; i<arr.length;i++) {
			if(arr[i] instanceof Breathable)
				numOfBreathable++;
			if(arr[i] instanceof Runner)
				numOfRunners++;
			if(arr[i] instanceof Thief)
				numOfThives++;
		}
		
		System.out.println("Duplicate those who breath:");
		Breathable[] breathbleArr = new Breathable[numOfBreathable];
		for (int i=0, j=0; i<arr.length;i++) {
			if(arr[i] instanceof Breathable) {
				breathbleArr[j++] = (Breathable)arr[i].clone();
			}
		}
		
		System.out.println("Those who breath:");
		for (int i=0; i<breathbleArr.length;i++) {
			System.out.println(breathbleArr[i]);
		}
		Runner[] runnersArr = new Runner[numOfRunners];
		for (int i=0, j=0; i<arr.length;i++) {
			if(arr[i] instanceof Runner) {
				runnersArr[j++] = (Runner)arr[i].clone();
			}
		}	
			Arrays.sort(runnersArr);
			System.out.println("The sorted runners: " + Arrays.toString(runnersArr)) ;
			
			Thief[] thievesArr = new Thief[numOfThives];
			for (int i=0, j=0; i<arr.length;i++) {
				if(arr[i] instanceof Thief) {
					thievesArr[j++] = (Thief)arr[i].clone();
				}
			}
			Arrays.sort(thievesArr, new CompareThivesByHeight());
			System.out.println("This sorted thies:" + Arrays.toString(thievesArr));
			
			Arrays.sort(thievesArr, new CompareThivesByNumOfSteals());
			System.out.println("This sorted thies by num of steals:" + Arrays.toString(thievesArr));
	}

}
