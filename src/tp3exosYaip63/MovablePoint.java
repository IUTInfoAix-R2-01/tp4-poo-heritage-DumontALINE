package tp3exosYaip63;

public class MovablePoint {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public String toString() {
		return "(x, y) speed=(x,y)";
	}
	
	public void moveUp () {
		y -= ySpeed;
	}
	
	public void moveDown () {
		y += ySpeed;
	}
	
	public void moveLeft () {
		x -= xSpeed;
	}
	
	public void moveright () {
		x += xSpeed;
	}
}
