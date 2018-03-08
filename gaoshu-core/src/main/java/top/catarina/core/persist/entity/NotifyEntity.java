package top.catarina.core.persist.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 系统通知实体类
 */
@Data
@Entity
@Table(name = "tb_notify")
public class NotifyEntity {
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

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	/**状态*/
	private int status;
}
