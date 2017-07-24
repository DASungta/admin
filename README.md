# admin
# Spring Boot 练手项目

#### 对java很不熟悉，但是因为公司需要，所以开始入手JAVA，本程序是在一边学习中一边改进的产物

------------



##### 软件设计规范

1. 项目架构

	参考：[Spring Boot工程结构推荐](http://www.jianshu.com/p/8476326ba7b6 "Spring Boot工程结构推荐")
- 	root package结构：com.example.myproject

- 	应用主类Application.java置于root package下，通常我们会在应用主类中做一些框架配置扫描等配置，我们放在root package下可以帮助程序减少手工配置来加载到我们希望被Spring加载的内容

- 	实体（Entity）与数据访问层（Repository）置于com.example.myproject.domain包下

- 	逻辑层（Service）置于com.example.myproject.service包下

- 	Web层（web）置于com.example.myproject.web包下
```
com
  +- example
    +- myproject
      +- Application.java
      |
      +- domain
      |  +- Customer.java
      |  +- CustomerRepository.java
      |
      +- service
      |  +- CustomerService.java
      |
      +- web
      |  +- CustomerController.java
      |
```

------------

2. 设计思路
	完全基于Rest设计，用于前后端分离，不涉及到web，不涉及到模板引擎和渲染。

------------


3. 程序构建
	下载后idea直接打开即可
