package com.panpan.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


/*@Component
public class MyFilter {*/
@Component
public class MyFilter implements Ordered, GlobalFilter {
    /*
     * 针对特定请求触发后要执行的过滤逻辑
     * @param exchange
     * @param chain
     * @return
     */

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // pre 处理
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if(username == null){
            // 如果没有传递改参数我们就拒绝该请求
            System.out.println("用户名为空，，，改请求非法....");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete(); // 设置响应完成 也就是在这个位置拦截了请求
        }
        Mono<Void> mono = chain.filter(exchange);// 正常的放过了
        // post 处理
        return mono;
    }

    /*
     * 改过滤器在整个过滤器链中的加载顺序
     *    数字越小 优先级越高
     * @return
     */

    @Override
    public int getOrder() {
        return 0;
    }
}
