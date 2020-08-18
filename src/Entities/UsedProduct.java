package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufacturingDate;
	
	public UsedProduct() {
		super();
		
	}

	public UsedProduct(String name, Double price, Date manufacturingDate) {
		super(name, price);
		this.manufacturingDate = manufacturingDate;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	@Override 
	public String priceTag() {
		return getName() 
				+ "(used) $ "
				+String.format("%.2f", getPrice()) 
				+"(Manufacture date: "
				+ sdf.format(manufacturingDate);
				
	}
	
	

}
