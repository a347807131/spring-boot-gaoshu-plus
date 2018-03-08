/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.base.lang;

/**
 * 储存项目中有道的所有枚举类
 *
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 18:52
 */
public interface Enums {
	/**
	 * 状态枚举类
	 */
	enum StatusUser {
		NORMAL(0, "正常"),
		LOCKED(1, "锁定");

		private int index;
		private String text;

		StatusUser(int index, String text) {
			this.index = index;
			this.text = text;
		}

		public String getText() {
			return text;
		}

		public int getIndex() {
			return index;
		}
	}

	/**
	 * 性别枚举类
	 */
	enum Gender {
		FEMAILE(-1, "女"),
		UNKNOW(0, "未知"),
		MALE(1, "男");

		private int index;
		private String text;

		Gender(int index, String text) {
			this.index = index;
			this.text = text;
		}

		public String getText() {
			return text;
		}

		public int getIndex() {
			return index;
		}
	}

	/**
	 * 登录类型枚举类
	 */
	enum EnumLog {
		LOGIN("登录"),
		POSTED("推送"),
		REPLY("回复");

		private String text;

		EnumLog(String text) {
			this.text = text;
		}

		public String getText() {
			return text;
		}
	}

	/**
	 * 推送状态枚举类
	 */
	enum StatusPost {
		WAITING(0, "待回答"),
		RESOLVING(1, "正在解决"),
		RESOLVED(2, "已解决");

		private int index;
		private String text;

		StatusPost(int index, String text) {
			this.index = index;
			this.text = text;
		}

		public String getText() {
			return text;
		}

		public int getIndex() {
			return index;
		}
	}

	/**
	 * 隐私枚举类
	 */
	enum Privacy {
		OPEN(0, "公开"),
		SECRET(1, "保密");

		private String text;
		private int index;

		Privacy(int index, String text) {
			this.text = text;
			this.index = index;
		}

		public String getText() {
			return text;
		}

		public int getIndex() {
			return index;
		}
	}

	/**
	 * 订单状态枚举类
	 */
	enum StatusOrder {

		UNPAID("未支付"),
		PAID("已支付"),
		CANCELLED("已取消");
		private String text;

		StatusOrder(String text) {
			this.text = text;
		}
	}

	/**
	 * 通知消息状态枚举类
	 */
	enum StatusNotify{

		UNREAD(0,"未读"),
		READED(0,"已读");

		private String text;
		private int index;

		StatusNotify(int index, String text) {
			this.text = text;
			this.index = index;
		}

		public String getText() {
			return text;
		}

		public int getIndex() {
			return index;
		}
	}
}