package rkppl.kelompok3.tubes;

public class D implements PowInterface {
	
	public D(){
		System.out.println("Ctor Dikelas D");
	}
	
	@Override
	public double pow(double n1, double n2){
		n1 = 0.6;
		n2 = 0.7;
		
		return n1 + n2;
	}
	
	@Override
	public double mul(double n1, double n2){
		return n1 * n2;
	}
	
	@Override
	public double div(double n1, double n2) {
		return n1 /n2;
	}
	
	@Override
	public String toString(){
		return "toString di kelas D";
	}

}
