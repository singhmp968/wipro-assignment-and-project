package SetOfBox;

public class Box implements Comparable<Box>{
private double l;
private double b;
private double h;

public Box() {}
public Box(double l,double b,double h) {
	
	this.l=l;
		this.b=b;
		this.h=h;
	}
	

public double getL() {
	return l;
}
public void setL(double l) {
	this.l = l;
}
public double getB() {
	return b;
}
public void setB(double b) {
	this.b = b;
}
public double getH() {
	return h;
}
public void setH(double h) {
	this.h = h;
}
@Override
public int compareTo(Box o) {
	// TODO Auto-generated method stub
	return 0;
}

}