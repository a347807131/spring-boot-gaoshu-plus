/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.wx;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import top.catarina.ApplicationTest;
import top.catarina.config.WxMpProperties;
import top.catarina.config.WxPayProperties;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-09 17:51
 */
public class ConfigTest extends ApplicationTest{
	@Autowired
	WxMpProperties mpProperties;
	@Autowired
	WxPayProperties payProperties;
	@Override
	public void test() {
		Assert.assertTrue(StringUtils.isBlank(mpProperties.getAesKey()));
		System.out.println(payProperties.getAppId());
	}
}
