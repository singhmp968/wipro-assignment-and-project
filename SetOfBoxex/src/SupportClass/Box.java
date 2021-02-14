package SupportClass;

public class Box implements Comparable<Box>{
	
	
	private double l;
	private double w;
	private double h;
	private double vol;
	public Box() {}
	
	public Box(double l,double b,double h) {
	super();
	this.l=l;
		this.w=b;
		this.h=h;
	}
	public double getLength() {
		return l;
	}
	public void setLength(double l) {
		this.l=l;
	}
	
	public double getWidth() {
		return w;
	}
	public void setwidth(double w) {
		this.w=w;
	}
	public double getHeight() {
		return h;
	}
	public void setHeight(double h) {
		this.h=h;
	}
	
	public double vol() {
		vol=this.l*this.w*this.h;
	return vol;
	}

	public String toString() {
		double volum =l*w*h;
		return "Box[Length = "+l+"Width = " + w + "Height = "+ h+"Volume = "+ vol+"]";
	}
	
	
	@Override
	public int hashCode() {
		double thisVol = this.l * this.w * this.h;
		String str = String.valueOf(thisVol);
		return str.hashCode();
	}
	
	@Override
	public int compareTo(Box o) {
		// TODO Auto-generated method stub

		if(this.vol()>o.vol) return 1;
else if(this.vol()<o.vol()) return -1;

return 0;	}

	@Override
	public boolean equals(Object ob) {
		Box th=(Box) ob;
		double thisVol = this.l * this.w * this.h;
		double thatVol=th.l*th.w*th.h;
	if(thisVol==thatVol)return true;
	else 
		return false;
	}
	

}
