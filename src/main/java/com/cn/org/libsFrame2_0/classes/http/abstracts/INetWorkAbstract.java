package com.cn.org.libsFrame2_0.classes.http.abstracts;

import com.cn.org.libsFrame2_0.classes.base.ErrorBean;
import com.cn.org.libsFrame2_0.classes.base.ResponseBean;

/**
 * Created by Smile on 16/11/30.
 */

public abstract class INetWorkAbstract {

    /**
     * 在接口请求之前
     * @param action
     */
    public void onBefore(int action){

    }

    /**
     * 在接口请求中
     * @param progress
     * @param total
     * @param action
     */
    public void inProgress(float progress, long total, int action) {

    }

    /**
     * 在接口请求之后
     * @param action
     */
    public void onAfter(int action) {

    }

    /**
     * 请求失败调用的方法
     */
    public void onFalue(int action, ErrorBean errorBean){

    }

    public  <T> void onCall(ResponseBean<T> onCall){

    }
}
