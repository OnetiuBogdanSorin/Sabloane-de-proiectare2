package My;

public class Paragraph implements Element {
	public String Nume;
	public AlignStrategy align;
	
	public Paragraph() {}
	public Paragraph(String N) {
		this.Nume = N;
	}
	public String getNume() {
		return Nume;
	}
	public void setNume(String nume) {
		Nume = nume;
	}
	public String toString() {
		return this.Nume;
	}
	
	@Override
	public void print() {
		if(align != null) {
		align.print(Nume);}
		else System.out.println(Nume);
	}
	
	public void setAlignStrategy(AlignStrategy align) {
		this.align=align;}
}


	

