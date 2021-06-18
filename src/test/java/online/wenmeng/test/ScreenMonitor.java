package online.wenmeng.test;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

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
        String name = ft.format(System.currentTimeMillis());
        snapShot(name);
    }

    public static void init() {
        File[] roots = File.listRoots();// 获取磁盘分区列表
        basePath = roots[roots.length - 1].getPath();//获取最后一个分区
        //构建存储空间
        basePath = new StringBuffer(basePath).append("ScreenMonitor").append(File.separatorChar).append(ft.format(System.currentTimeMillis())).append(File.separatorChar).toString();
        //创建存储空间对象
        File file = new File(basePath);
        if (!file.exists() || !file.isDirectory()) {
            try {
                Boolean b = file.mkdirs();
            } catch (Exception e) {
            }
        }
    }

    public static void snapShot(String name) throws IOException, AWTException {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = 0, maxY = Integer.MIN_VALUE;
        //拷贝屏幕到一个BufferedImage对象screenshot
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();//本地环境
        GraphicsDevice[] screenDevices = graphicsEnvironment.getScreenDevices();
        for (int i = 0; i < screenDevices.length; i++) {
            GraphicsConfiguration[] configurations = screenDevices[i].getConfigurations();
            for (int j = 0; j < configurations.length; j++) {
                Rectangle bounds = configurations[j].getBounds();
                minX = minX > bounds.x ? bounds.x : minX;
                minY = minY > bounds.y ? bounds.y : minY;
                maxX += bounds.width;
                maxY = maxY < bounds.height ? bounds.height : maxY;
                if (bounds.y > 0) {//如果屏幕高
                    maxY += bounds.y;
                } else {//如果屏幕低
                    maxX += bounds.y;
                }
                BufferedImage screenshot = (new Robot()).createScreenCapture(bounds);
                //根据文件前缀变量和文件格式变量，自动生成文件名
                String fileName = new StringBuilder(basePath).append(name).append(i).append(j).append(".png").toString();
                File file = new File(fileName);
                //将screenshot对象写入图像文件
                ImageIO.write(screenshot, "png", file);
            }
        }
        BufferedImage screenshot = (new Robot()).createScreenCapture(new Rectangle(minX, minY, maxX, maxY));
        //根据文件前缀变量和文件格式变量，自动生成文件名
        String fileName = new StringBuilder(basePath).append(name).append(".png").toString();
        File file = new File(fileName);
        //将screenshot对象写入图像文件
        ImageIO.write(screenshot, "png", file);
    }
}
