package org.crazyit.ajax.domain;

public class Book
{
	private Integer id;
	private String name;
	private String author;
	private double price;

	// �޲����Ĺ�����
	public Book()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Book(Integer id , String name
		, String author , double price)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	// id��setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// author��setter��getter����
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return this.author;
	}

	// price��setter��getter����
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}

}