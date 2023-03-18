package lsp;

public class LSPDemo {

	public void calculateArea(Shape s) {
		System.out.println(s.getarea());
		
	}
	
	public static void main(String[] args) {
		
		LSPDemo lsp= new LSPDemo();
		lsp.calculateArea(new Rectangle(2,4));
		lsp.calculateArea(new Square(5));

	}

}
