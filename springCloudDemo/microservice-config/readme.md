#### microservice-config
-------------------

Spring  cloud config 
> /{application}/{profile}[/{label}]            // label -分支   application -项目名(找不到，返回默认)
  /{application}-{profile}.yml                  // http://localhost:7908/abc-default.yml     
  /{label}/{application}-{profile}.yml          // http://localhost:7908/master/abc-default.yml  
  /{application}-{profile}.properties           // http://localhost:7908/abc-default.properties
  /{label}/{application}-{profile}.properties   // http://localhost:7908/master/abc-default.properties

   