package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-03-14 23:07:39
 */
@TableName("tb_posts")
public class PostsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String content;
	/**
	 * 
	 */
	private Date created;
	/**
	 * 
	 */
	private Date lastUpdate;
	/**
	 * 
	 */
	private Integer privacy;
	/**
	 * 
	 */
	private Integer replys;
	/**
	 * 
	 */
	private Integer reward;
	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private String tag;
	/**
	 * 
	 */
	private String title;
	/**
	 * 
	 */
	private Integer views;
	/**
	 * 
	 */
	private Long authorId;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
	 * 获取：
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * 设置：
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	/**
	 * 获取：
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}
	/**
	 * 设置：
	 */
	public void setPrivacy(Integer privacy) {
		this.privacy = privacy;
	}
	/**
	 * 获取：
	 */
	public Integer getPrivacy() {
		return privacy;
	}
	/**
	 * 设置：
	 */
	public void setReplys(Integer replys) {
		this.replys = replys;
	}
	/**
	 * 获取：
	 */
	public Integer getReplys() {
		return replys;
	}
	/**
	 * 设置：
	 */
	public void setReward(Integer reward) {
		this.reward = reward;
	}
	/**
	 * 获取：
	 */
	public Integer getReward() {
		return reward;
	}
	/**
	 * 设置：
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * 获取：
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * 设置：
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：
	 */
	public void setViews(Integer views) {
		this.views = views;
	}
	/**
	 * 获取：
	 */
	public Integer getViews() {
		return views;
	}
	/**
	 * 设置：
	 */
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	/**
	 * 获取：
	 */
	public Long getAuthorId() {
		return authorId;
	}
}
