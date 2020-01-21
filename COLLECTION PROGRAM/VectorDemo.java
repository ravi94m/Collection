import java.util.*;
class VectorDemo{
	public static void main(String aa[]){
		//Vector v=new Vector();
		Vector v=new Vector(10,5);
		v.addElement("Kalu");
		System.out.println(v.capacity());
		for(int i=0;i<10;i++){
			v.addElement(i);
		}
		System.out.println(v.capacity());
		System.out.println(v);
	}
}