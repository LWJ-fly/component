package study.GoF23.CreationPattern.prototype.demo1;

import java.util.Date;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 13:41
 * @Descrintion:客户端，去克隆别人的视频
 * @version: 1.0
 */
public class Bilibili {
    public static void main(String[] args) throws Exception {
        //原型对象
        Date date = new Date();
        Video video = new Video("test",date);

        System.out.println(video);

        //实现克隆
        Video video1 = (Video) video.clone();
        System.out.println(video1);
        System.out.println(video==video1);
        video1.setName("clone:"+video.getName());
        Thread.sleep(1000);
        video.setCreateTime(new Date());
        System.out.println(video+"\r\n"+video1);
        date.setTime(52454544);
        System.out.println(video+"\r\n"+video1);
    }


}
