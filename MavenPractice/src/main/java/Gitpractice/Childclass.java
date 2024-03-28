package Gitpractice;

public class Childclass extends Parentclass {

	public void mul()
	{
		int d=a*b;
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		obj.add();
		obj.mul();

	}

}
