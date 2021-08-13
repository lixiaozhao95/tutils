package com.lixiaozhao.tutils;

import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @ClassName T
 * @Description TODO
 * @Author lixiaozhao
 * @Date 2021/8/13 9:57
 * @Version 1.0
 */
public class T {
    public static void show(Context context) {
        Gson gson = new GsonBuilder().create();
        String s = gson.toJson(new Bean("Info"));
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }
}
