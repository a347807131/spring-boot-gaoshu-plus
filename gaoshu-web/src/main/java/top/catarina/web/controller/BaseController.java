/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.web.controller;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpMaterialService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import top.catarina.base.context.AppContext;
import top.catarina.base.upload.FileRepo;
import top.catarina.core.persist.entity.Attach;
import top.catarina.core.persist.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 20:00
 */
public abstract class BaseController {

	@Autowired
	protected AppContext appContext;
	@Autowired
	FileRepo fileRepo;
	@Autowired
	WxMpMaterialService materialService;

	/**
	 * 包装分页对象
	 *
	 * @param pn 页码
	 */
	protected Pageable wrapPage(Integer pn) {
		return wrapPage(pn, 10);
	}

	/**
	 * 包装分页对象
	 *
	 * @param pn 页码
	 */
	protected Pageable wrapPage(Integer pn, Integer maxResults) {
		return wrapPage(pn, maxResults, null);
	}

	protected Pageable wrapPage(Integer pn, Sort sort) {
		return wrapPage(pn, null, sort);
	}

	/**
	 * @param pn         页码
	 * @param maxResults 最大结果数
	 * @param sort       排序
	 */
	protected Pageable wrapPage(Integer pn, Integer maxResults, Sort sort) {
		if (pn == null)
			pn = 1;

		if (maxResults == null || maxResults == 0) {
			maxResults = 10;
		}
		return new PageRequest(pn, maxResults, sort);
	}

	protected String getSuffix(String name) {
		int pos = name.lastIndexOf(".");
		return name.substring(pos);
	}

	protected String getIpAddr(HttpServletRequest request) throws Exception {
		String ip = request.getHeader("X-Real-IP");
		if (!StringUtils.isBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
			return ip;
		}
		ip = request.getHeader("X-Forwarded-For");
		if (!StringUtils.isBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
			// 多次反向代理后会有多个IP值，第一个为真实IP。
			int index = ip.indexOf(',');
			if (index != -1) {
				return ip.substring(0, index);
			} else {
				return ip;
			}
		} else {
			return request.getRemoteAddr();
		}
	}

	/**
	 * 处理上传的素材id，并重微信服务器下载到本地
	 */
	protected List<Attach> handleAblums(String[] ablums) throws Exception {
		if (ablums == null)
			return Collections.emptyList();
		ArrayList<Attach> attaches = new ArrayList<>();
		for (String mid : ablums) {
			File temp = materialService.mediaDownload(mid);
			int[] size = fileRepo.imageSize(temp.getPath());
			Attach attach = new Attach();
			attach.setMId(mid);
			attach.setWidth(size[0]);
			attach.setHeight(size[1]);
			String pathAndFileName = fileRepo.storeAndScale(temp);
			attach.setOriginal(appContext.getOrigDir()+pathAndFileName);
			attach.setPreview(appContext.getTempDir()+pathAndFileName);

			attaches.add(attach);
		}
		return attaches;
	}

}
