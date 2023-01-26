package firstRobot;
import robocode.*;

public class CarinaSutter extends JuniorRobot
{

	public void run() {
		setColors(red, black, white, white, black);

	// goes into corner and rotates gun
		int heightdistance = fieldHeight - robotY;
		int widthdistance = fieldWidth - robotX;
		turnTo(0);
		ahead(heightdistance);
		turnTo(90);
		ahead(widthdistance);
		while(true) {
		turnGunRight(25);
		}
		
		}
		
	

	public void onScannedRobot() {
	// scannes the surroundings and fires when it sees a bot
		turnGunTo(scannedAngle);
		if(scannedDistance < 100)
			fire(3);
		fire(1);
		
	}


	public void onHitByBullet() {

	}
	

	public void onHitWall() {

		}
}
