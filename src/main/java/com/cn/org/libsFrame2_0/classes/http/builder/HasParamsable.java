package com.cn.org.libsFrame2_0.classes.http.builder;

import java.util.Map;

/**
 * Created by zheangyang on 16/3/1.
 */
public interface HasParamsable
{
    OkHttpRequestBuilder params(Map<String, String> params);
    OkHttpRequestBuilder addParams(String key, String val);
}
