#jersey+jetty本地启动
  这部分的配置主要在web.xml.  
  在web启动的时候会初始化spring和jersey各自的容器.
  
  spring主要用于管理swagger相关配置.
  
  jersey用于管理对外api接口的相关配置,通过扫描cn.itsrobin.action即可获取接口配置信息(路径在SpringWithSwagger中声明),职责类似于srpingMvc.
  
  WebServer为jetty配置了用于本地启动的上下文,直接执行main方法即可启动项目.  
  
  执行 http://localhost:8080/rest/restService/getUserJson 返回数据说明启动成功.
  
#添加swagger  