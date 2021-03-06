package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
		public static void main(String[] args) {
		//2. create an array of 5 robots.
			Robot[] ro = new Robot[5];
		//3. use a for loop to initialize the robots.
			for (int i = 0; i < ro.length; i++) {
				ro[i] = new Robot();
			}
			//4. make each robot start at the bottom of the screen, side by side, facing up
				ro[0].moveTo(75, 550);
				ro[1].moveTo(250, 550);
				ro[2].moveTo(425, 550);
				ro[3].moveTo(600, 550);
				ro[4].moveTo(775, 550);
				
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
				Random r = new Random();
				for (int i = 0; i < ro.length; i++) {
					ro[i].move(r.nextInt(50));
				}
				
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
				boolean done = false;
				while (!done) {
					for (int i = 0; i < ro.length; i++) {
						ro[i].move(r.nextInt(50));
						if (ro[i].getY()<60) {
							done = true;
						}
					}
				}
		//7. declare that robot the winner and throw it a party!
				for (int i = 0; i < ro.length; i++) {
					if (ro[i].getY()<60) {
						ro[i].move(0);
						JOptionPane.showMessageDialog(null, "Winner!!!!!!!!!!!!!!!");
						ro[i].sparkle();
					}
				}
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
