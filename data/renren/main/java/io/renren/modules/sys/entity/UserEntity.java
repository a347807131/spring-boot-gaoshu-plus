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
@TableName("tb_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String city;
	/**
	 * 
	 */
	private String country;
	/**
	 * 
	 */
	private Date created;
	/**
	 * 
	 */
	private Integer golds;
	/**
	 * 
	 */
	private String headImgUrl;
	/**
	 * 
	 */
	private Date lasgLogin;
	/**
	 * 
	 */
	private String nickname;
	/**
	 * 
	 */
	private String openId;
	/**
	 * 
	 */
	private Integer posts;
	/**
	 * 
	 */
	private String province;
	/**
	 * 
	 */
	private String sex;
	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private Integer subscribe;
	/**
	 * 
	 */
	private Long subscribeTime;
	/**
	 * 
	 */
	private Long cid;

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
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * 获取：
	 */
	public String getCountry() {
		return country;
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
	public void setGolds(Integer golds) {
		this.golds = golds;
	}
	/**
	 * 获取：
	 */
	public Integer getGolds() {
		return golds;
	}
	/**
	 * 设置：
	 */
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}
	/**
	 * 获取：
	 */
	public String getHeadImgUrl() {
		return headImgUrl;
	}
	/**
	 * 设置：
	 */
	public void setLasgLogin(Date lasgLogin) {
		this.lasgLogin = lasgLogin;
	}
	/**
	 * 获取：
	 */
	public Date getLasgLogin() {
		return lasgLogin;
	}
	/**
	 * 设置：
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * 获取：
	 */
	public String getOpenId() {
		return openId;
	}
	/**
	 * 设置：
	 */
	public void setPosts(Integer posts) {
		this.posts = posts;
	}
	/**
	 * 获取：
	 */
	public Integer getPosts() {
		return posts;
	}
	/**
	 * 设置：
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取：
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 设置：
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：
	 */
	public String getSex() {
		return sex;
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
	public void setSubscribe(Integer subscribe) {
		this.subscribe = subscribe;
	}
	/**
	 * 获取：
	 */
	public Integer getSubscribe() {
		return subscribe;
	}
	/**
	 * 设置：
	 */
	public void setSubscribeTime(Long subscribeTime) {
		this.subscribeTime = subscribeTime;
	}
	/**
	 * 获取：
	 */
	public Long getSubscribeTime() {
		return subscribeTime;
	}
	/**
	 * 设置：
	 */
	public void setCid(Long cid) {
		this.cid = cid;
	}
	/**
	 * 获取：
	 */
	public Long getCid() {
		return cid;
	}
}
