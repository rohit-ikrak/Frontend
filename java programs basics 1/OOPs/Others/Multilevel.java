class A{
	void print(){
		System.out.println("Hello");
	}
}

class B extends A{
	void print(){
		System.out.println("World");
	}
}

class C extends B{
	void print(){
		System.out.println("Java");
	}
}

class InheritanceEx2 extends C{
	public static void main(String[] args){
		InheritanceEx2 i = new InheritanceEx2();
		i.print();
	}
}