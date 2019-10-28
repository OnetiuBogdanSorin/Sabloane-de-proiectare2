package My;

import java.util.ArrayList;
import java.util.List;

class Chapter {
	public String TC;
	List<SubChapter> sc1 = new ArrayList<SubChapter>();

	
	public Chapter() {}
	public Chapter(String tc) {
		this.TC = tc;
	}
	public String getChapter() {
		return TC;
	}
	public void setChapter(String tC) {
		TC = tC;
	}
	
	
	public int createSubChapter(String string1) {
		SubChapter sc= new SubChapter(string1);
		sc1.add(sc);
		return sc1.indexOf(sc);
	}
	
	public void addSubChapter(SubChapter chp) {
		sc1.add(chp);
		
	}
	
	public SubChapter getSubChapter(int indexOfSubChapter) {
		return sc1.get(indexOfSubChapter);
	}
	public String toString() {
		return this.TC;
	}
	
}