/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import top.catarina.core.persist.entity.User;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-10 14:50
 */
@Data
public class PostForm {

	@NotBlank
	@JsonProperty("pid")
	private long id;

	@NotBlank
	private String title;

	/**
	 * 访问权限
	 */
	private int privacy;

	private int reward;

	@NotBlank
	private String tag;

	@NotBlank
	private String content;

	private User author;

	//extend
	//素材
	private String[] mids;
}
