package top.catarina.wx.mp.handler;

import me.chanjar.weixin.mp.api.WxMpMessageHandler;
import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
public abstract class AbstractHandler implements WxMpMessageHandler {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 每个handler可能用到的json转化方法
	 * @param obj
	 * @return
	 */
	protected String toJson(Object obj) {
		return WxMpGsonBuilder.create().toJson(obj);
	}
}
