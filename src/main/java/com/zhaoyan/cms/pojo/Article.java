/**
 * 
 */
package com.zhaoyan.cms.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaoyan
 *
 * 2020年1月9日
 */
public class Article implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2071642802661754987L;
	
	private Integer id;
	private String title;
	private String content;
	private String picture;
	private Integer channel_id;
	private Integer category_id;
	private Integer user_id;
	private Integer hits;
	private Integer hot;
	private Integer status;
	private Integer deleted;
	private Date created;
	private Date updated;
	private Integer commentCnt;
	private String articleType;
	
	
	//	扩展字段
	private Category category;
	private Channel channel;
	private User author;
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", picture=" + picture
				+ ", channel_id=" + channel_id + ", category_id=" + category_id + ", user_id=" + user_id + ", hits="
				+ hits + ", hot=" + hot + ", status=" + status + ", deleted=" + deleted + ", created=" + created
				+ ", updated=" + updated + ", commentCnt=" + commentCnt + ", articleType=" + articleType + "]";
	}
	/**
	 * @param id
	 * @param title
	 * @param content
	 * @param picture
	 * @param channel_id
	 * @param category_id
	 * @param user_id
	 * @param hits
	 * @param hot
	 * @param status
	 * @param deleted
	 * @param created
	 * @param updated
	 * @param commentCnt
	 * @param articleType
	 */
	public Article(Integer id, String title, String content, String picture, Integer channel_id, Integer category_id,
			Integer user_id, Integer hits, Integer hot, Integer status, Integer deleted, Date created, Date updated,
			Integer commentCnt, String articleType) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.picture = picture;
		this.channel_id = channel_id;
		this.category_id = category_id;
		this.user_id = user_id;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
		this.commentCnt = commentCnt;
		this.articleType = articleType;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Integer getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}
	public Integer getHot() {
		return hot;
	}
	public void setHot(Integer hot) {
		this.hot = hot;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public Integer getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(Integer commentCnt) {
		this.commentCnt = commentCnt;
	}
	public String getArticleType() {
		return articleType;
	}
	public void setArticleType(String articleType) {
		this.articleType = articleType;
	}
	/**
	 * 
	 */
	public Article() {
		super();
	}
	
	

}
