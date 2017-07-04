#1. 项目客户端自动刷新
#1.1 引入:org.springframework.cloud:spring-cloud-starter-bus-ampq
#1.2 bootstrap.yml配置rabbitmq
#1.3 手动刷新或者
    * 单节点刷新: 
             方式1: curl.exe -X POST http://localhost:6800/refresh
             方式2: curl.exe -X POST http://localhost:6800/bus/refresh?destination=customers:9000
    * 多节点刷新: curl.exe -X POST http://localhost:6800/bus/refresh
#1.4 手动刷新或者
    在git配置webhook： http://localhost:6800/bus/refresh