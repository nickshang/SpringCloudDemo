package com.shang.cloud;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;


/**
 * zuul前置过滤器
 * 更多过滤器参考:org.springframework.cloud.netflix.zuul.filters.pre;
 * Created by Think on 2017/6/20.
 */
public class PreZuulFilter  extends ZuulFilter{

    private final  static Logger LOGGER = LoggerFactory.getLogger(PreZuulFilter.class);

    @Override
    public boolean shouldFilter() {
        return true;                                        // 启动过滤
    }

    @Override
    public Object run() {
        HttpServletRequest httpServletRequest = RequestContext.getCurrentContext().getRequest();
        String host =  httpServletRequest.getRemoteHost();
        LOGGER.info("请求地址host{}",host);
        return null;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }
}
