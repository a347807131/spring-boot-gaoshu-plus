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
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import top.catarina.WebApplicationTest;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.UserService;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-12 14:16
 */
public class DemoControllerTest extends WebApplicationTest {
	@Autowired
	UserService userService;

	@Override
	public void test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders
				.get("/demo/1"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content()
						.string("demo1"));
	}

	/*
	java.lang.AssertionError: created
		Expected: 1520751022000
     got: 2018-03-11 14:50:22
    ; lasgLogin
	Expected: 1520751022000
     got: 2018-03-11 14:50:22
	 */
	@Test
	public void test2() throws Exception {
		User user = userService.get(1);
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writerFor(User.class);
		String jsonString = writer.writeValueAsString(user);

		mockMvc.perform(MockMvcRequestBuilders
				.get("/demo/2"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content()
						.json(jsonString, false));
	}
}
