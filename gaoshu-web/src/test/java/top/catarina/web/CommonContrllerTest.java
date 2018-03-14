/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.chanjar.weixin.common.bean.result.WxMediaUploadResult;
import me.chanjar.weixin.mp.api.WxMpMaterialService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import top.catarina.WebApplicationTest;
import top.catarina.core.data.CommentForm;
import top.catarina.core.data.PostForm;
import top.catarina.core.persist.dao.AttachDao;
import top.catarina.core.persist.entity.Attach;
import top.catarina.core.persist.service.UserService;

import javax.transaction.Transactional;
import java.io.File;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-12 14:51
 */
public class CommonContrllerTest extends WebApplicationTest {
	@Autowired
	AttachDao attachDao;
	@Autowired
	UserService userService;
	@Autowired
	WxMpMaterialService mpMaterialService;

	@Override
	public void test() throws Exception {
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders
				.get("/home/index").session(session))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
		String content = result.getResponse().getContentAsString();
		System.out.println(content);
	}

	@Test
	public void testDownload() throws Exception {
		Attach attach = attachDao.getOne(1L);
		String oriPicUrl = attach.getOriginal();
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders
				.get(oriPicUrl).session(session))
				.andExpect(MockMvcResultMatchers.status().isCreated())
				.andReturn();
		String contentType = result.getResponse().getContentType();
		Assert.assertNotNull(contentType);
	}

	@Test
	public void testComment() throws Exception {
		CommentForm form = new CommentForm();
		form.setContent("mock测试");
		form.setPid(2);
		String value = new ObjectMapper().writeValueAsString(form);
		mockMvc.perform(MockMvcRequestBuilders
				.post("/comment").contentType(MediaType.APPLICATION_JSON).content(value).session(session))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testPostGet() throws Exception {
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders
				.get("/post/list").session(session))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
		String content = result.getResponse().getContentAsString();
		System.out.println(content);
	}

	@Test
	public void testPostPost() throws Exception {
		String path=getClass().getClassLoader().getResource("dragen.gif").getPath();
		//WxMediaUploadResult media = mpMaterialService.mediaUpload("image", new File(path));

		PostForm form = new PostForm();
		form.setContent("mock测试");
		form.setTag("高数");
		form.setTitle("测试标题");
		//form.setMids(new String[]{media.getMediaId()});
		String value = new ObjectMapper().writeValueAsString(form);
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders
				.post("/post")
				.contentType(MediaType.APPLICATION_JSON)
				.content(value).session(session))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
		String content = result.getResponse().getContentAsString();
		System.out.println(content);
	}

	@Test
	//@Transactional
	public void testSingleUpdate() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders
				.put("/user/profile/nickname=Civinbtw")
				.session(session))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
	}

}
