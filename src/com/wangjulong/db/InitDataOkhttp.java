package com.wangjulong.db;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用 Okhttp 获取网络内容
 * Created by Administrator on 2016/9/20.
 */
public class InitDataOkhttp{

    // Okhttp 官方示例代码
    private OkHttpClient client = new OkHttpClient();

    private String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }


    public int[][] initData() throws IOException, SQLException {

        InitDataOkhttp initDataOkhttp = new InitDataOkhttp();

        // 获取网页内容
        String response = initDataOkhttp.run("http://trend.caipiao.163.com/qlc/?periodNumber=100");

        // 处理获得的网页内容 返回整形数组(开奖号码的二维数组)
        DatabaseAccess databaseAccess = new DatabaseAccess();
        databaseAccess.addToLottery(response);

        return databaseAccess.getAllNumber();
    }

}
