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
import top.catarina.core.persist.entity.College;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-10 14:26
 */
@Data
public class UserForm {

	@NotBlank
	private String nickname;
	@NotBlank
	private String collegeName;
}
