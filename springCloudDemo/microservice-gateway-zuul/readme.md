#### microservice-gateway-zuul
-------------------

API网关服务提供者
* 网关服务
    * Cookies and Sensitive Headers
    * Ignored Headers
    * Strangulation Patterns and Local Forwards
    * Uploading Files through Zuul
    * Plain Embedded Zuul
    * Disable Zuul Filters
    * Providing Hystrix Fallbacks For Routes
    * Polyglot support with Sidecar
    * zull filter
* hystrix
    * HystrixCommand 通过：在方法基础上通过定义方法进行回退；
    * feign 通过：fallback指定类进进行回退
    * zull 通过:ZuulFallbackProvider指定回退