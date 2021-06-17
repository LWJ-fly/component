package online.wenmeng.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * @Auther: 狼芒
 * @Date: 2021/6/17 23:55
 * @Descrintion: 实现截屏功能
 * @version: 1.0
 */
public class ScreenMonitor {
    static Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    static String basePath = "c:\\";
    public static void main(String[] args) {
        init();
        while (true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            long name = System.currentTimeMillis();
            snapShot(name);
        }
    }

    public static void init(){
        File[] roots = File.listRoots();// 获取磁盘分区列表
        basePath = roots[roots.length-1].getPath();
        basePath = new StringBuffer(basePath).append("ScreenMonitor\\").append(System.currentTimeMillis()).append("\\").toString();
        File file = new File(basePath);
        if (!file.exists()||!file.isDirectory()){
            try {
                file.mkdir();
            } catch (Exception e) {
            }
        }
    }

    public static void snapShot(long name) {
        try {
            //拷贝屏幕到一个BufferedImage对象screenshot
            BufferedImage screenshot = (new Robot()).createScreenCapture(new
                    Rectangle(0, 0, (int) (d.getWidth() * 2.15), (int) d.getHeight() + 125));
            //根据文件前缀变量和文件格式变量，自动生成文件名
            String fileName = new StringBuilder(basePath).append(name).append(".png").toString();
            File file = new File(fileName);
            //将screenshot对象写入图像文件
            ImageIO.write(screenshot, "png", file);
        } catch (Exception e) {
        }
    }
}
