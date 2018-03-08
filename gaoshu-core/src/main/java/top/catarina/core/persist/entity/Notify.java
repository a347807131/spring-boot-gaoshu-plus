package top.catarina.core.persist.entity;

import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.util.Date;

/**
 * 系统通知实体类
 */
@Data
@Entity
@Table(name = "tb_notify")
public class Notify {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "own_id")
	private long ownId;

	@Column(name = "from_id")
	private long fromId;

	/**事件类型*/
	private int event;

	/**关联post的id*/
	@Column(name = "post_id")
	private long postId;

	@Temporal(value = TemporalType.TIMESTAMP)
	//设置不可readonly
	@Column(insertable = false, updatable = false)
	//设置更改时自动更新为当前时间
	@Generated(GenerationTime.INSERT)
	private Date created;

	/**状态*/
	private int status;
}
