/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-08 14:03
 */
@Data
@Entity
@Table(name = "tb_post_attribute")
public class PostAttribute implements Serializable{

	@Id
	@GeneratedValue(generator = "pkGenerator")
	@GenericGenerator(name = "pkGenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "post"))
	private long id;

	/*@OneToOne(mappedBy = "attribute")
	@JoinColumn(name = "id")
	private Post post;*/

	//cascade没有写，即是默认值，就是不级联的意思。
	@OneToMany
	@JoinColumn(name = "pid")
	//排序 按转出在哪创建时间升序排列
	@OrderBy("created asc")
	private List<Comment> comments;

	@OneToMany
	@JoinColumn(name = "pid")
	private List<Attach> attaches;
}
