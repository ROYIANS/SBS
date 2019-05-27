package cn.royians.sbs.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HttpClientExample {

    // HTTP GET请求
    public JSONObject sendGet(String url) throws Exception {


        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(url);

        //添加请求头
        String USER_AGENT = "Mozilla/5.0";
        request.addHeader("User-Agent", USER_AGENT);

        HttpResponse response = client.execute(request);

        if(response.getStatusLine().getStatusCode()==200) {
            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

            StringBuilder result = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            JSONObject jsonObject = JSON.parseObject(result.toString());
            rd.close();

            return jsonObject;
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
            return null;
        }


    }

}
