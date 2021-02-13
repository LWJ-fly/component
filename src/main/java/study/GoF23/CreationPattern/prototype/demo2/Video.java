package study.GoF23.CreationPattern.prototype.demo2;

import java.util.Date;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 13:37
 * @Descrintion:视频的属性
 * @version: 1.0
 */
public class Video implements Cloneable {

    private String name;//视频的名称
    private Date createTime;//创建电视的名称

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public Video() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        //实现深克隆，还有的深度克隆有 序列化，反序列化
        Video video = (Video) clone;
        //将这个对象的属性也进行克隆
        video.createTime = (Date) this.createTime.clone();
        return null;
    }
}
