package com.navi;

import java.util.Scanner;

//class for custom exception
class CustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CustomException(String str) {
		// calling constructor of custom exception
		super(str);
	}
}

class Elevator{
	//The lift starts from floor 1 through floor 10. So the starting floor would be assumed floor 1.
	int currFloor = 1;
	
	// Creating a method for selecting floor
	void selectFloor(int floor) {
		//Checking the floor we have selected.
		//if we have to go up, a for loop ensures going up count.
		if (floor > currFloor) {
			System.out.print("Going up");
			for(int i =currFloor+1;i<=floor;i++) {
				System.out.print(".."+i);
			}
			System.out.println("..Ding!");
			currFloor = floor;
		}else if (floor < currFloor) { 		// If we want to go down, then the for loop counts the opposite and counts from current floor to the floor we have to go
			System.out.print("Going Down");
			for(int i =currFloor-1;i>=floor;i--) {
				System.out.print(".."+i);
			}
			System.out.println("..Ding!");
			currFloor = floor;
		}else {			// If we are on the same floor and we select the same floor again, then it will display the message.
			System.out.println("You are already in floor "+floor+".");
		}
		System.out.println();
		
	}
	// Creating a method for fire alarm.
	void fireAlarm() throws CustomException {
		//If we are in any floor other than floor 1 the lift has to come back to floor 1..
		//So we are using if statement to check the 'currFloor'.
		if(currFloor > 1) {
			// We have already written the code to go down in the selectFloor method.
			// So all we have to do is call the method and select the floor1.
			selectFloor(1);			
		}
		//Calling custom exception
		throw new CustomException("Danger! You must exit the bulding now!");
	}
}

public class ElevatorDriver {

	public static void main(String[] args) throws CustomException{
		Scanner sc = new Scanner(System.in);
		Elevator elevator = new Elevator();
		
		//The while loop runs always until the we press 'q' in the switch case 'q'.
		while(true) {
			System.out.println("Enter an option \n- 's' to Select a floor \n- 'f' for Fire alarm \n- 'q' to quit");
			char option = sc.next().charAt(0);
			
			switch(Character.toLowerCase(option)) {
			case 's':
				System.out.println("Enter the floor that you'd like to go to ");
				int floor = sc.nextInt();
				//Checking whether the floor selected is between 1 to 10. If not show an Invalid message.
				if (floor < 1 || floor > 10) {
					try {
						//If the floor selected is not between 1 to 10 it throws custom exception.
						throw new CustomException("Invalid! Enter the floor that you'd like to go to from 1 to 10");
					}
					catch(CustomException e) {
						e.printStackTrace();
					}
				}else {
					//Calling the selectFloor method if the floor selected is between 1 to 10.
					elevator.selectFloor(floor);
				}
				break;
			case 'f':
				//Calling fireAlarm method
				elevator.fireAlarm();
				
				break;
			case 'q':
				System.exit(0);
			default:
				System.out.println("Invalid Selction");
			}
		}
		

	}

}
