/**
 * 
 */
package com.surveyproject.atozstore.site.web.models;

import java.math.BigDecimal;

import com.surveyproject.atozstore.entities.Product;

/**
 * @author Nikhil
 *
 */
public class LineItem
{
	private Product product;
	private int quantity;
	
	public LineItem()
	{
	}
	
	public LineItem(Product product, int quantity)
	{
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct()
	{
		return product;
	}
	public void setProduct(Product product)
	{
		this.product = product;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public BigDecimal getSubTotal()
	{
		return product.getPrice().multiply(new BigDecimal(quantity));
	}
	
	
}
