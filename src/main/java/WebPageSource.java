import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebPageSource {
    public static void main(final String[] args) {
        final URL url;
        final int responsecode;
        final HttpURLConnection urlConnection;
        final BufferedReader reader;
        final String regEx = ".*(?<!\\\\)(\\\")(http.*?)(?<!\\\\)\\1.*";
        final Pattern p = Pattern.compile(regEx); //编译成模式
        String line;
        try {
            //生成一个URL对象，要获取源代码的网页地址为：http://www.sina.com.cn
            url = new URL("http://www.vivider.tk/lover");
            //打开URL
            urlConnection = (HttpURLConnection) url.openConnection();
            //获取服务器响应代码
            responsecode = urlConnection.getResponseCode();
            if (responsecode == 200) {
                //得到输入流，即获得了网页的内容
                reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "utf-8"));
                while ((line = reader.readLine()) != null) {
                    final Matcher m = p.matcher(line);
                    if (m.find())
                        System.out.println(line);
                }
            } else {
                System.out.println("获取不到网页的源码，服务器响应代码为：" + responsecode);
            }
        } catch (final Exception e) {
            System.out.println("获取不到网页的源码,出现异常：" + e);
        }
    }
}