package top.catarina.core.persist.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 学院实体类
 */
@Data
@Entity
@Table(name = "tb_college")
public class College implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/**用戶名*/
	@Column(name = "college_name",unique = true,length = 64)
	private String collegeName;
}
