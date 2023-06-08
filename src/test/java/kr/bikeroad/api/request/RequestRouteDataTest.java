package kr.bikeroad.api.request;

import kr.bikeroad.api.utils.MyHttpUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class RequestRouteDataTest {
    /*
    GET http://localhost:8080/api/1.0/route?start=127.01117,37.5555&target=126.99448,37.54565&direction=cycling-road
*/
    @Test
    public void openRouteTest1() throws IOException {
        String url = "http://localhost:8080/api/1.0/route?start=127.01117,37.5555&target=126.99448,37.54565&direction=cycling-road";

        String result = MyHttpUtils.httpGetMethod(url);
        System.out.println("result = " + result);
    }
}