package lab1;

public class Rectangle {
	
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height){
	this.width=width;
	this.height=height;
	}
	 
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
		
	}
	public int getArea(){
		return height*width;
	}
	public int getPerimeter(){
		int perimeter1;
		perimeter1= 2*height+2*width;
		return perimeter1;
	}
	
	public void flip(int x,int y){
 x=width;
 y=height;
 width=y;
 height=x;
	}
	
	}



