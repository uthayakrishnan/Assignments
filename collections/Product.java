package collections;

import java.util.Objects;

//Q81
public class Product {
	
	private int id;
	private String name;
	private int price;
	private int qnty;
	
	public Product() {}
	public Product(int id, String name, int price, int qnty) {
		this.id=id;
		this.name=name;
		this.price =price;
		this.qnty=qnty;
		
	}
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
@Override
public String toString() {
	
	return this.id +"\n"+this.name+"\n"+this.price+"\n"+this.qnty;
	
}
@Override
public boolean equals(Object obj)
{
	Product pdt = (Product)obj;
	return this.id==pdt.getId()&&
			this.name == pdt.getName()&&
			this.price == pdt.getPrice()&&
			this.qnty == pdt.getQnty();
	 
	
}
@Override
public int hashCode() {
    return Objects.hash(id,name,price,qnty);
}

 
}
