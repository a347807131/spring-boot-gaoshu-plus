# 一起刷高数webapp文档说明

标签（空格分隔）： JavaEE SpringBoot Wexin-Java 前后端分离

---

##项目说明
- 采用SpringBoot、Hibernate、wexin-java-tools框架，
  开发的一套供高校在校生在线交流的微信嵌入式网页app问答平台。
- 采用当下非常流行的前后台分离的架构来构建应用，后台只需提供相应的接口给前端。
<br>

##具有如下特点
- 灵活的持久层架构，可以非常方便的更改数据库建表约束及数据库迁移
- 完善的素材管理业务及其架构
- 完善的XSS防范及脚本过滤，彻底杜绝XSS攻击
- 友好的代码结构及注释，便于阅读及二次开发
- 页面交互使用Vue2.x，极大的提高了开发效率
- 引入swagger文档支持，方便编写API接口文档
- 支持AOP式的业务日志保存
<br>

 ##开发环境
- JDK1.8
- MySQL5.5+
- Tomcat8.0+
- Maven3.5+
<br>

##技术选型
- 核心框架 : Spring Boot 1.5
- 持久层框架：Hibernate-JPA 2.1
- 数据库连接池：Druid 1.1.6
- 日志管理：SLF4J log-back
- 页面交互：Vue2.x
- 视图框架：Spring MVC 4.3
- 微信SDK : weixin-java-tools 2.9.8 
<br>

##项目结构
'''
└─spring-boot-gaoshu-plus
    
        ├─gaoshu-base 基础模块
        ├─gaoshu-core 核心模块
        ├─gaoshu-web  web模块
        └─gaoshu-wx   微信模块
'''
<br>

 ##本地部署
 - 通过git下载源码
 - 项目地址 https://github.com/a347807131/spring-boot-gaoshu-plus
 - 创建数据库db_gaoshu_plus，或者更改application中配置文件关于数据库链接的配置
 - 执行data/db.sql文件，初始化数据【按需导入表结构及数据】
 - 修改application-dev.yml文件，更新MySQL账号和密码
 - 在项目根目录下，执行mvn clean install
 - application.yml中相关配置
    - app：
        - store: 素材储存目录
        - domain: 域名
    - wechat: 微信开发相关配置
 <br>
 
 
 



