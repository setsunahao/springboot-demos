★ idea中是自动集成springBoot插件

★ eclipse 需要安装一个spring ide



### SpringBoot(maven)

1、springBoot快速入门

​      @SpringBootApplication = @Configuration+@ComponentScan+@EnableAutoConfiguration

2、springBoot配置分析(属性和结构化)

​       a> 通过Enviroment 获取

​       b> 通过@Value获取

​	 ★> 配置文件的注意：

​		@PropertySource

​		@PropertySources

​		指定配置文件的名字

​		--spring.config.name=文件名称后缀名称可以省略

​		指定配置文件的目录

​		--spring.config.location=classpath:xxx/xxx.properties

​							    file:/

​	c>  通过@ConfigurationProperties(prefix="xx")

​		      @PropertySource("classpath:xxx.propeties")

​               ★ 注入普通属性

​		★注入集合或者数组

​         d>多环境配置

​		--spring.profiles.active=dev

​                 手动setAdditionalProfiles();

​                 注解@Profile



3、按照条件自动配置

​	Condition 接口

​	@Conditional

​	

4、springBoot @Enable*注解的工作原理

​	@import

​	importSelector

​        importBeanDefinitionRegistrar

​	注解装配监控器实现（BeanDefinitionProcessor回调）

5、springBoot @EnableAutoConfiguration项目应用

1> 新建一个项目中需要提供配置类

2> 在META-INF/spring.factorties在文件中配置

```
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
第三方jar中提供配置类全路径
```

```
@ConditionalOnClass 如果classpath下面存在Gson.class文件就装配该配置类的实例到spring容器中管理
@ConditionalOnMissingBean 如果spring容器中不存在该bean对象就装配到spring容器管理
```

3> 可以通过exclude或者excludeName方式排除不要被装配到spring容器中的类

6、SpringBoot事件监听

步骤:

1> 自定义事件一般是继承ApplicationEvent抽象类

2> 自定义事件监听器，一般是实现ApplicationListener接口

3> 配置监听器，启动的时候，需要把监听器加入到Spring容器中

4> 发布事件

配置监听器方式：

1> SpringApplication=>addListeners

2> 把监听器交给Spring容器管理

3> 使用配置项配置context.listener.classes = 监听器全路径

4> 使用@EventListener注解



7、springBoot运行流程分析

a、判断是否是web环境

b、加载所有classpath下面META-INF/spring.factories  ApplicationContextInitializer

c、加载所有classpath下面META-INF/spring.factories  ApplicationListener

d、推断main方法所在的类

e、运行main方法

f、设置系统变量java.awt.headless系统变量

g、加载所有classpath下面META-INF/spring.factories  SpringApplicationRunnerListener



8、SpringBoot Web（SpringMVC）



jsp配置

SpringBootServletInitializer 

spring.mvc.view.prefix=

spring.mvc.view.suffix=

tomcat-embed-jasper



freemarker配置

spring-boot-starter-freemarker

<#list personList as person>



thymeleaf配置

spring-boot-starter-thymeleaf

<html xmlns:th="http://www.thymeleaf.org">

th:object

th:each="person : ${personList}"

th:text



静态资源配置：

spring.resources.staticLocations=修改静态资源的路径



使用servletAPI

@ServletComponentScan

XxxRegistrationBean

ServeletListener





使用拦截器

配置类继承WebMvcConfigurationSupport=>addInterceptors



错误页面处理：

排除ErrorMvcAutoConfiguration.class 出现404经典页面

自定义错误信息处理页面:(记得交给spring容器管理)

1> 实现ErrorPageRegistrar接口中的registerErrorPages方法

​      创建ErrorPage对象，注册addErrorPages到错误集合对象中

异常处理：

局部@ExceptionHandler

全局@ControllerAdvice+@ExceptionHandler



9、springBoot的定制和优化内嵌的Tomcat

实现 WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> 

ConfigurableServletWebServerFactory 

TomcatServletWebServerFactory 



10、SpringBoot JDBC/AOP/Starter

jdbc

JdbcTemplate

HikariCP 数据源



AOP

动态代理和CGLIB代理问题

基于Spring的写法

基于SpringBoot做法 @EnableAopProxyClass





11、SpringBoot日志/监控/度量

12、SpringBoot测试





**作业：(使用springBoot技术完成) JDBCTemplate**

使用restFul风格方式实现一个完整的用户管理系统

1、预习下如何操作数据库（mysql)

2、完成用户信息的增，删，改，分页条件查询。



交作业方式： 发老师QQ邮箱