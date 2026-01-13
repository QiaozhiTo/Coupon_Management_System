package com.imooc.passbook.merchants.security;

import ch.qos.logback.core.util.StringUtil;
import com.imooc.passbook.merchants.constant.Constants;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class AuthCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(Constants.TOKEN_STRING);
        if (StringUtil.isNullOrEmpty(token)) {
            throw new Exception("Header doesn't include" + Constants.TOKEN_STRING +"!");
        }

        if (!token.equals(Constants.TOKEN)) {
            throw new Exception("Header contains wrong" + Constants.TOKEN_STRING +"!");
        }
        AccessContext.setToken(token);
        return false;
//        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        AccessContext.clearAccessKey();
    }
}
