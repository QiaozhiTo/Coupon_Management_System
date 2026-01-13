package com.imooc.passbook.merchants.security;
//using threadLocal to store token info from every line
public class AccessContext {
    private static final ThreadLocal<String> token = new ThreadLocal<>();
    public static String getToken() {
        return token.get();
    }

    public static void setToken(String tokenStr) {
        AccessContext.token.set(tokenStr);
    }

    public static void clearAccessKey() {
        token.remove();
    }
}
