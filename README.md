#pring dubbo learning start

 xml 中添加 
 ``` <dubbo:registry address="zookeeper://localhost:2181" /> ```
 并注释掉原来的 registry内容 即可使用zookeeper注册中心
 
 启动 provider App.java
 启动 consumer App.java 在控制台输入内容 即可调用到 provider中方法  第一次等待时间稍长
 
 dubbo文档 https://dubbo.gitbooks.io/dubbo-user-book/content/
