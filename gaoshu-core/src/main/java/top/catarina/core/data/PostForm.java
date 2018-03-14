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

import java.io.Serializable;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-10 14:50
 */
@Data
public class PostForm implements Serializable{

	private long id;

	@NotBlank
	private String title;

	/**
	 * 访问权限
	 */
	private int privacy;

	private int reward;

	private String tag;

	@NotBlank
	private String content;

	//extend
	//素材
	private String[] mids;
}
