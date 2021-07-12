package com.lut.ticket.config;

import java.io.FileWriter;
import java.io.IOException;


public class AlipayConfig {



    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000117646089";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCbBhgRPhMPkCgoZ5g7C9TdZYSWlgwvo+kBdAOG63oYTGNA4rYPRluoS1OKu+tlYxLcN/Dk0P+0FLH2K9lDlg4kzx1kzPECQHL0z63JjwMzX5RxMlo0VO+ImeHkXmXY9K3IbGk9EV/C/7wCAWabLf4ndhDlplOgAk9xbcNiqp9jjOGVCq3RZ1aICTp2pugBgMBvylgnpNU9ZI7/Xc/VSlKnFCclgwdFWP60B0uAXIkobekLkm/+Mw3OXNcEKlpq0H7QmfOoFT14/OQzCbbpKRadm0BacEIYXC+ow59XBHoUAHFe7EeacLRcRzmf3Hdszhj9u63/gIHhSH10fMkbl1pxAgMBAAECggEAVjCELwn5JPz8JsK6E5IXbmRj3CleaxpRkNpEn73KKzpFMK0bldCDY0VGFGs4jC0SLlf32fANSrz62Kg2ampCQNraN9Ht6VeV0mCo+dhGakioymq5VkEm0CbmPcbyDzaybC1CMY64VD1E9UR8HKjslloBOP1JnzvJmYHyUKgWaAzskHkeYH+Yz3/X/jY/L5tzzrGOhRofAFZKmonqswic9nfKjZWJQwc4LNXNS2LXlJHjFU4qml00Bd28TInMGid/C+BTkCRpmggzzoyyKpx1DMfkhBdMeMT1DjTPwDpdCKedESPoXTOb0vuG7XlR67XB9KCIahwYjAIOqUau8WmVMQKBgQDYiMPsuwdrObacKWBdZ67JpkivBPvrTNMCnivHjVkTee8LqBrToJS0L0iraezVMLCmmfxu5pJVbB44RcELw0wc2fvb/rw6hTnGCpFBxaa7b8PRyclr2n3ppX8KyGlN08HjMGcbM8THMxIvZS7linPY4vNNiuQm+IumlwndB+gcLQKBgQC3R1LakNP2acEEy1EyYOupXIwkR4ir7TN8rZrK8iekCBB6urTswY/u5sFLU6bB8jwbMjJ77Zf6NxuUxbB+1K6UD9g8La+yrdQX5I4tKC8cCxeai/zka1fpr2wxNF9m/maaxEaedSGEeNXeZvBgK1M0svHSY4jPyj+UBNyDAxQt1QKBgQCEW7VHc1upk3GoKzKYZdRVtqsfMLC8uA0TwJOKO0CDwzj3qx4a1kGPkoedH/aAqm6Qp/fB4nb4eEpQo3LJOevAhw6I/0EXlHAoOjVoOuUcFclg5zOUFc55j4wEj1SvGg2eTev4mMBj8zfeeL8d2G/P14pZj9i+aZcTkaeZ0Ed1UQKBgQCx+TijtW+fISKmHSlD2on9dDlCIZS+HyCYOZzO5kdIKeyWwSdfoLa8LqgVFa4hN7DWV/BeF2I1P74wwaeaAb1lWd2I0nSC9fm3GeJWR2c3vC23jaiNxw8fhZFyVoEt6myIbYCF7wgVM6G6zgst1+R8kCfzPWRlIuiKPA5Fyn+V4QKBgEGJRvDLMAG9JKEktxZIbK/tyXCYgJ5GHEIwrmbDkDL5MEytFAg504/xqV5pjqZkFY5AveQ2w5wrHu5p68ohiu5JiXWtXKeOjAb9nfGSsmKzft6o47NP2jkR9MTiqX8iM+YXtr0aq2StHPFlRNWcb9t7OtwVntEKQTVdUw8VpxM1";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAobgccoMJXcwY9iS9/L173Lhbn9KLFh2NDhvCaUMUko3TtTHX0RvX8CLBqYg4Ohc4J8q57/psesr34u3GrRWz2LSKbUxnOtivJrF9YO+XAxh69ykty5dEA8DG+5p1VtUpyt8dOw5phXzE0K4g3n5st51rZoF+LyPwXdfTJzqrYI9gtL0SurH79MhHKM3kPLn4BRMmjh6TekpIJAlIlQFL+Qv8ri5KksbGCTXkBnrZmjbbfWvHW9zE0O9gQBI5HDfajcJbVilyOWk8uG2N34VjDKFpbTOyjA8U0RAiANNLtu09YrbxHAg0gd0QMvRc7v+iHX8p/MTPNX+qDgsxYcBdrQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8888/handlePay";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8888/handlePay";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\log";
    
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

