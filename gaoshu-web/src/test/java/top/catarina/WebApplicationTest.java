/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import top.catarina.base.lang.Consts;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.UserService;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-12 14:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@WebAppConfiguration
public abstract class WebApplicationTest {

	protected MockMvc mockMvc;
	protected MockHttpSession session;
	protected MockHttpServletRequest request;
	protected MockHttpServletResponse response;
	@Autowired
	UserService userService;

	@Autowired
	protected WebApplicationContext webApplicationContext;
	@Before
	public void before(){
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		response =new MockHttpServletResponse();
		request=new MockHttpServletRequest(webApplicationContext.getServletContext());
		session=new MockHttpSession(webApplicationContext.getServletContext());
		User user = userService.get(1);
		session.setAttribute(Consts.USER_ID,user);

		request.setSession(session);
	}
	@Test
	public abstract void  test() throws Exception;
}
