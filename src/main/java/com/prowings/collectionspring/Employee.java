package com.prowings.collectionspring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> cources;
	private Properties books;

	public Employee() {
		super();

	}

	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> cources) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.cources = cources;
	}
	

	public Employee(Properties books) {
		super();
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCources() {
		return cources;
	}

	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}
	

	public Properties getBooks() {
		return books;
	}

	public void setBooks(Properties books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", cources=" + cources
				+ ", books=" + books + "]";
	}

	
}