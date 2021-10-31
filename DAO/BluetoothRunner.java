package com.xworkz.Blueetooth.DAO;
import com.xworkz.Blueetooth.DAO.*;
import com.xworkz.Blueetooth.DTO.*;
public class BluetoothRunner {
	public static void main(String[] args) {
		BluetoothDAO dao=new BluetoothDAO();
		dao.add(null);
		BluetoothDTO bluetoothdto=new BluetoothDTO("oppo","red","wire",240,4.97d);
		dao.add(bluetoothdto);
		
		BluetoothDTO blth=new BluetoothDTO("realme","blue","wireless", 250,4.97d);
		dao.add(blth);
		dao.add( bluetoothdto);
		dao.add( bluetoothdto);
		dao.add( bluetoothdto);
		dao.add (bluetoothdto);
		dao.delete(240);
	}

}
