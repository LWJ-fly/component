package online.wenmeng.test;


import org.springframework.core.io.UrlResource;

import javax.imageio.ImageIO;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 * @Auther: 狼芒
 * @Date: 2021/6/17 23:55
 * @Descrintion: 实现截屏功能
 * @version: 1.0
 */
public class ScreenMonitor {
    static Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    static String basePath = "c:\\";
    static SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss");

    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        Boolean isSend = true;
        Long startUpTime = System.currentTimeMillis();
        init();
        while (true) {
            if (isSend) {
                boolean exists = new UrlResource("http://www.baidu.com").exists();
                if (exists) {
                    isSend = false;
                    sentEmail("2105252583@qq.com", "开机时间:\t" + ft.format(startUpTime) + "\r\n联网时间:\t" + ft.format(System.currentTimeMillis()), "私人电脑开机");
                }
            }
            Thread.sleep(3000);
            String name = ft.format(System.currentTimeMillis());
            snapShot(name);
        }
    }

    public static void init() {
        File[] roots = File.listRoots();// 获取磁盘分区列表
        basePath = roots[roots.length - 1].getPath();//获取最后一个分区
        //构建存储空间
        basePath = new StringBuffer(basePath).append("ScreenMonitor").append(File.separatorChar).append(ft.format(System.currentTimeMillis())).append(File.separatorChar).toString();
        //创建存储空间对象
        File file = new File(basePath);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
    }

    public static void snapShot(String name) throws IOException, AWTException {
        //拷贝屏幕到一个BufferedImage对象screenshot
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();//本地环境
        GraphicsDevice[] screenDevices = graphicsEnvironment.getScreenDevices();
        Rectangle virtualBounds = new Rectangle();
        for (int i = 0; i < screenDevices.length; i++) {
            GraphicsConfiguration[] configurations = screenDevices[i].getConfigurations();
            for (int j = 0; j < configurations.length; j++) {
                System.out.println(configurations[j].getBounds() + "\r\n\r\n");
                virtualBounds = virtualBounds.union(configurations[j].getBounds());
            }
        }
        virtualBounds.setSize(3600, virtualBounds.height);
        BufferedImage screenshot = (new Robot()).createScreenCapture(virtualBounds);
        //根据文件前缀变量和文件格式变量，自动生成文件名
        String fileName = new StringBuilder(basePath).append(name).append(".png").toString();
        File file = new File(fileName);
        //将screenshot对象写入图像文件
        ImageIO.write(screenshot, "png", file);
    }
    public static Boolean sentEmail(String receiver, String content, String subtitle) {
        //  得到session
        Properties props = new Properties();
        props.setProperty("mail.host", "smtp.163.com");
        props.setProperty("mail.host", "smtp.qq.com");
        props.setProperty("mail.smtp.auth", "true");

        props.setProperty("mail.smtp.auth", "true");//开启认证
        props.setProperty("mail.debug", "true");//启用调试
        props.setProperty("mail.smtp.timeout", "1000");//设置链接超时
        props.setProperty("mail.smtp.port", "465");//设置端口
        props.setProperty("mail.smtp.socketFactory.port", "465");//设置ssl端口
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                //设置账号密码
                return new PasswordAuthentication("3319691033", "999999999999999999999");
            }
        };

        Session session = Session.getInstance(props, auth);
        /*
         * 2、创建MimeMessage
         */
        MimeMessage msg = new MimeMessage(session);
        try {
            //设置发件人
            msg.setFrom(new InternetAddress("wenmeng.online@qq.com", "闻梦家园", "utf-8"));
            //设置收件人
            msg.setRecipients(MimeMessage.RecipientType.TO, receiver);
            //设置标题
            msg.setSubject(subtitle);
            //设置内容
            msg.setContent(content, "text/html;charset=utf-8");
            //发送邮件
            Transport.send(msg);
        } catch (Exception e) {
            //这里需要通知我，出现错误立即更正
            return false;
        }
        return true;
    }
}
