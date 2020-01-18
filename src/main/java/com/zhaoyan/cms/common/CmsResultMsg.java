/**
 * 
 */
package com.zhaoyan.cms.common;

import java.io.Serializable;

/**
 * @author zhaoyan
 *
 * 2020年1月18日
 */
public class CmsResultMsg<T extends Object> implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3537163495520030144L;
	private Integer id;
	private String msg;
	private T t;
	@Override
	public String toString() {
		return "CmsResultMsg [id=" + id + ", msg=" + msg + ", t=" + t + "]";
	}
	/**
	 * @param id	服务器响应号
	 * @param msg	提示信息
	 * @param t		封装具体的信息
	 */
	public CmsResultMsg(Integer id, String msg, T t) {
		super();
		this.id = id;
		this.msg = msg;
		this.t = t;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	/**
	 * 
	 */
	public CmsResultMsg() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		result = prime * result + ((t == null) ? 0 : t.hashCode());
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
		CmsResultMsg other = (CmsResultMsg) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		if (t == null) {
			if (other.t != null)
				return false;
		} else if (!t.equals(other.t))
			return false;
		return true;
	}
	
	
	
	

}
