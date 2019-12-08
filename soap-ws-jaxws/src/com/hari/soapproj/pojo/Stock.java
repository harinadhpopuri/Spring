/**
 * 
 */
package com.hari.soapproj.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hpopuri
 *
 */
@XmlRootElement
public class Stock implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private float avgPrice;
	private int quantity;
	private float totalPrice;	
	
	
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(long id, String name, float avgPrice, int quantity, float totalPrice) {
		super();
		this.id = id;
		this.name = name;
		this.avgPrice = avgPrice;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(float avgPrice) {
		this.avgPrice = avgPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(avgPrice);
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + quantity;
		result = prime * result + Float.floatToIntBits(totalPrice);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (Float.floatToIntBits(avgPrice) != Float.floatToIntBits(other.avgPrice))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Float.floatToIntBits(totalPrice) != Float.floatToIntBits(other.totalPrice))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", avgPrice=" + avgPrice + ", quantity=" + quantity
				+ ", totalPrice=" + totalPrice + "]";
	}
	

}
