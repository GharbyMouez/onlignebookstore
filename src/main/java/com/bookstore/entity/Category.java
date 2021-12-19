package com.bookstore.entity;

import java.math.BigInteger;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter @AllArgsConstructor
@ToString
@Entity

public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer Category_id;
private String categoryname;

@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
private Set<Book> book;
}
