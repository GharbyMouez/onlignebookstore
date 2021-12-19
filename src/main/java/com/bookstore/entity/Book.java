package com.bookstore.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter @AllArgsConstructor
@ToString
@Entity

public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Book_id;
	private String sku;
	private String name;
	private String description;
	private String image;

	private Double unitPrice;
	private boolean active;
	private int unitsInStock;
	private Date createdon;
	private Date updatedon;
	
	@ManyToOne
	@JoinColumn(name="Category_id",nullable=false)
	
	private Category category;
	
	
}
