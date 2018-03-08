package top.catarina.core.persist.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 学院实体类
 */
@Data
@Entity
@Table(name = "tb_college")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/**用戶名*/
	@Column(name = "college_name",unique = true,length = 64)
	private String collegeName;
}
