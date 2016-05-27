package rkppl.kelompok3.tubes;

public class A implements AddAndSubInterface{
	
	public A() {        
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }

    @Override
    public int add(int n1, int n2) {
       return n1 + n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
    
    @Override
    public String toString() {
        return "toString di kelas " + getClass().getSimpleName();
    }
}
