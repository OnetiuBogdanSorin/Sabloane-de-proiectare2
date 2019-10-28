package My;

public class ImageProxy implements Element{
	Image realImage=null;
	String imageName;
	
	public ImageProxy(String ImageName) {
		imageName= ImageName;
	}
	
	
	public void print() {
		if(realImage == null) {
			Image imagine1= new Image(imageName);
			realImage=imagine1;
			}
		realImage.print();
	}
}
