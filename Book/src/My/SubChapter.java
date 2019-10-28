package My;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	public String T;
	
	public SubChapter() {}
	public SubChapter(String t) {
		this.T=t;
	}
	public String getSubChapter() {
		return T;
	}
	public void setSubChapter(String t) {
		T = t;
	}
	//List<Paragraph> p1 = new ArrayList<Paragraph>();
	//List<Image> i1 = new ArrayList<Image>();
	//List<Table> t1 = new ArrayList<Table>();
	List<Element> e1 = new ArrayList<Element>();
		
	public void addParagraph(Paragraph paragraph) {
		e1.add(paragraph);
		
	}
	public void addImage(Image image) {
		e1.add(image);
		
	}
	public void addTable(Table table) {
		e1.add(table);
	}
	public int createParagraph(String string) {
		Paragraph p = new Paragraph(string);
		e1.add(p);
		return e1.indexOf(p);
	}
	
	public int createImage(String string) {
		Image i = new Image(string);
		e1.add(i);
		return e1.indexOf(i);
	}
	
	public int createTable(String string) {
		Table t = new Table(string);
		e1.add(t);
		return e1.indexOf(t);
	}
	public Paragraph getParagraph(int index) {
		int i=0;
		for(var p1 : e1) {
			if(p1 instanceof Paragraph) {
				++i;
				if(i == index) {
					return (Paragraph)p1;
				}
			}
		}
		return null;
	}
	public Image getImage(int index) {
		int i=0;
		for(var i1 : e1) {
			if(i1 instanceof Image){
				++i;
				if(i == index) {
					return (Image)i1;
				}
			}
		}
		return null;
	}
	public Table getTable(int index) {
		int i=0;
		for(var t1 : e1) {
			if(t1 instanceof Table) {
				++i;
				if(i == index) {
					return (Table)t1;
				}
			}
		}
		return null;
	}
	public void print() {
		System.out.println("SubChapter : "+T);
		for(var e : e1) {
			System.out.println(e);
		}
	}
	
}