// Luke James
// 16 September 2022
// Assignment 2 - Model.java
// Function: Create image of turtle and move it

class Model
{
	int turtle_x;
	int turtle_y;
	int dest_x;
	int dest_y;

	Model()
	{
	}

	public void update()
	{
		// Move the turtle
		if(this.turtle_x < this.dest_x)
			this.turtle_x += Math.min(4, dest_x - turtle_x); // Makes the turtle move either
		else if(this.turtle_x > this.dest_x)                   // 4 pixels or the difference between
			this.turtle_x -= Math.max(4, dest_x - turtle_x); // the destination and the turtle.
		if(this.turtle_y < this.dest_y)                         // This stop the turtle from "bouncing".
			this.turtle_y += Math.min(4, dest_y - turtle_y);
		else if(this.turtle_y > this.dest_y)
			this.turtle_y -= Math.max(4, dest_y - turtle_y);
	}

	public void setDestination(int x, int y)
	{
		this.dest_x = x;
		this.dest_y = y;
	}
}