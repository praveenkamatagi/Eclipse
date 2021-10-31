package com.xworkz.Blueetooth.DAO;

import com.xworkz.Blueetooth.DTO.BluetoothDTO;

public class BluetoothDAO {
	private BluetoothDTO[] blue=new BluetoothDTO[5];
	private int volume;
	public BluetoothDAO()
	{
		
	}
	public void add(BluetoothDTO blueTooth )
	{
		if (this.volume<this.blue.length && blueTooth!=null )
		{
		this.blue[volume]=blueTooth;
		
			System.out.println("volume of".concat(" ").concat(String.valueOf(this.volume).concat(" ").concat("BRAND ").concat(" ").concat(blueTooth.getBrand())));
		      this.volume++;
		}
		   else
		   {
			   System.err.println("vol is max");  
		}
	}
public void delete(int index)
{
	System.out.println("  delete index".concat(String.valueOf(index)));
	if(index>=0 && index<this.blue.length)
	{
		this.blue[volume]=null;
		System.out.println("delete");
	}
	else
	{
		System.err.println("not deleted");
	}
}
}

