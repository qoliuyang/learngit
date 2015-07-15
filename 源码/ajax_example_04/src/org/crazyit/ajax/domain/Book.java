package org.crazyit.ajax.domain;

public class Book
{
	private Integer id;
	private String name;
	private String author;
	private double price;

	// 无参数的构造器
	public Book()
	{
	}
	// 初始化全部成员变量的构造器
	public Book(Integer id , String name
		, String author , double price)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	// id的setter和getter方法
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// author的setter和getter方法
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return this.author;
	}

	// price的setter和getter方法
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}

}