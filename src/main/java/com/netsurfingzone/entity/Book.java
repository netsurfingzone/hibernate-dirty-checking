package com.netsurfingzone.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Book implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "no_of_page")
	private Integer noOfPages;

	@Column(name = "price")
	private String price;

	@Column(name = "author")
	private String author;
	
	@Column(name = "version")
	@Version
	private Long version;
/*	
	@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinColumn(name = "book_id",referencedColumnName="id")
	private List<Story> storyList = new ArrayList<>();
	*/
	

/*	public List<Story> getStoryList() {
		return storyList;
	}

	public void setStoryList(List<Story> storyList) {
		this.storyList = storyList;
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(Integer noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
	
	

}
