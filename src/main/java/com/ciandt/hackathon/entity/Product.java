<<<<<<< HEAD
package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Product {

	@Id
	private Long id;
	private String imageURL;
	private String description;
	private Double price;
	private ProductType productType;
	private Integer points;
	
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public ProductType getProductType() {
		return this.productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}

}
=======

package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Product {

	@Id
	private Long id;
	private String imageURL;
	private String description;
	private Double price;
	private String type;
	private Integer points;
	
    public Long getId() {
        return id;
    }
    
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}

}
>>>>>>> branch 'fernando_noronha' of https://github.com/fapereira1/make-a-wish.git
