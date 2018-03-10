/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.data;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import top.catarina.core.persist.entity.User;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-10 15:01
 */
@Data
public class CommentForm {

	private long id;

	@NotBlank
	private String content;

	private String[] mids;

	private long pid;

	private User author;
}
