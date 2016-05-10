import java.util.Scanner;

public class EnemyShipTesting {
	public static void main(String[] args)
	{
		//EnemyShip ufoShip = new UFOEnemyShip();
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("What type of Enemy Ship?(R / U / B)");
		
		if(userInput.hasNextLine())
		{
			String typeofShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeofShip);
		}
		
		
		if(theEnemy != null){
			doStuffEnemy(theEnemy);
		}else
			System.out.println("Enter a U, R, B");
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip)
	{
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
