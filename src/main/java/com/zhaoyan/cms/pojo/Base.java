/**
 * 
 */
package com.zhaoyan.cms.pojo;

import java.io.Serializable;

/**
 * @author zhaoyan
 *
 * 2020年1月9日
 */
public class Base implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2294006403136109138L;
	private Integer id;
	private String name;
	@Override
	public String toString() {
		return "Base [id=" + id + ", name=" + name + "]";
	}
	/**
	 * @param id
	 * @param name
	 */
	public Base(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 */
	public Base() {
		super();
	}
	
	

}
