/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.core.persist.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-10 23:01
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
abstract class  BaseEntity implements Serializable{

}
