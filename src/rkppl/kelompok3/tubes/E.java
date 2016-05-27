package rkppl.kelompok3.tubes;

import java.util.List;

public class E{
	
//	List dataList = new List();
    private List dataList;
	
	public E (){
            System.out.println("Ctor di kelas "+getClass().getSimpleName());
	}
	
	public boolean contains(String n) {
//		return false;
            return this.dataList.toString().contains(n);
	}

	public List getDataList() {
            return dataList;
	}

	public void setDataList(List dataList) {
		this.dataList = dataList;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
            return "String pada kelas "+getClass().getSimpleName();
	}
}
