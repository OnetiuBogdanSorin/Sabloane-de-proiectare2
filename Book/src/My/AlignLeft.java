package My;

public class AlignLeft implements AlignStrategy {
	
	public AlignLeft() {}

	@Override
		public void print(String text) {System.out.println("++++"+text);}
}
