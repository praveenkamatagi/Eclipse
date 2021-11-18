package com.xworkz.equalsMethods;

public class Camera {
	String company;
	int price;
	double pixel;
	float model;
	
	public Camera() {
		
	}

	@Override
	public boolean equals(Object obj) {
	System.out.println("invoked equals method");
	if(obj!=null) {
		System.out.println("object is not pointing to null");
		if(obj instanceof Camera) {
			System.out.println("referenve to camera");
		 Camera photo =(Camera) obj;
		 String photoCompany=photo.getCompany();
		 int photoPrice =photo.getPrice();
		 if(this.company.equals(photoCompany)  && this.price==getPrice()) {
			 System.out.println(".....matching......");
			 return true;
		 }
		 else {
			 System.err.println("reference is not camera");
		 }
		}
		 else {
			 System.err.println("obj is  pointing to null");
		 }
		}
		 else {
			 System.out.println("price and companynot matching");
			 
		 }
	return false;
		}
		 
		

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 25;
	}

	@Override
	public String toString() {
		
	 
			System.out.println(this.company);
			System.out.println(this.price);
			System.out.println(this.pixel);
			System.out.println(this.model);
			return "camera is good";
		}
		 
	

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getPixel() {
		return pixel;
	}

	public void setPixel(double pixel) {
		this.pixel = pixel;
	}

	public float getModel() {
		return model;
	}

	public void setModel(float model) {
		this.model = model;
	}
	

}
		
			 