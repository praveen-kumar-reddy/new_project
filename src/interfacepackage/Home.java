package interfacepackage;

public  class Home implements outside,interior{

 

	@Override
	public void color() {
	 System.out.println("black color");
		
	}

	@Override
	public void design() {
	 System.out.println("high design");		
	}

	@Override
	public void lights() {
	 System.out.println("disko lights");
	}

	@Override
	public void outsidedesign() {
		 System.out.println("bule");
		
	}
	public static void main(String[] args) {
		 Home obj=new Home();
obj.design();
obj.lights();
obj.paints();
obj.outsidedesign();
obj.paints();
outside.paints();
	}

	@Override
	public void paints() {
		 System.out.println("asian paints");
	}

}
