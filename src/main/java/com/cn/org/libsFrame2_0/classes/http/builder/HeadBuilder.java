package com.cn.org.libsFrame2_0.classes.http.builder;


import com.cn.org.libsFrame2_0.classes.http.OkHttpUtils;
import com.cn.org.libsFrame2_0.classes.http.request.OtherRequest;
import com.cn.org.libsFrame2_0.classes.http.request.RequestCall;

/**
 * Created by zhangyang on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
