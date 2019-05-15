package com.qingwu.start;

import com.qingwu.ServiceApi;

public class ServiceApiImpl implements ServiceApi {

	@Override
    public String sendMessage(String message) {
        return "provider start message:" + message;
    }
}
