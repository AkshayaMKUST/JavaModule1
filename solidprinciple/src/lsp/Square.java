package lsp;

public class Square implements Shape {

	private int side;
	
	public Square(int side) {
		this.side=side;
	}
	
	
	@Override
	public int getarea() {
		
		return this.side * this.side;
	}

}
