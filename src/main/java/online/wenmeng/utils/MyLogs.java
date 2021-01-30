package online.wenmeng.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by CXC on 2017/6/5.
 */
public class MyLogs {
    /**
     * @将错误信息输入到txt中
     * @param str 存储的路径,name 保存的名字,content 保存的值
     * @throws IOException
     */
    public static void writeEror_to_txt(String str ,String name,String content){
    	//因为要生成日志、所以固定
    	if(str==null){
            str = System.getProperty("user.dir");
            File ff = new File(str);
            str = ff.getParent();
            ff = new File(str,"webapps");
            str = ff.getAbsolutePath();
        }
        File F=new File(str , name);

        System.out.println(F.getAbsolutePath());

        //如果文件不存在,就动态创建文件
        if(!F.exists()){
            try {
				F.createNewFile();
			} catch (IOException e) {
			}
        }
       
        FileWriter fw=null;
        String writeDate=content;
        try {
            //设置为:True,表示写入的时候追加数据
            fw=new FileWriter(F, true);
            //回车并换行
            fw.write(writeDate+"\r\n");
        } catch (IOException e) {
        }finally{
            if(fw!=null){
                try {
					fw.close();
				} catch (IOException e) {
				}
            }
        }

    }
    /**
     * @获取系统当前时间
     * @return
     */
    public static String get_nowDate(){

        Calendar D=Calendar.getInstance();
        int year=0;
        int moth=0;
        int day=0;
        int hour=0;
        int minute=0;
        int second=0;
        year=D.get(Calendar.YEAR);
        moth=D.get(Calendar.MONTH)+1;
        day=D.get(Calendar.DAY_OF_MONTH);
        hour=D.get(Calendar.HOUR_OF_DAY);
        minute=D.get(Calendar.MINUTE);
        second=D.get(Calendar.SECOND);
        String now_date=checkNum(year)+"-"+checkNum(moth)+"-"+checkNum(day)+" "
        +checkNum(hour)+":"+checkNum(minute)+":"+checkNum(second);
        return now_date;
    }
    
    /**
     * @获取系统当前时间 年-月-日
     * @return
     */
    public static String get_Date(){

        Calendar D=Calendar.getInstance();
        int year=0;
        int moth=0;
        int day=0;
        year=D.get(Calendar.YEAR);
        moth=D.get(Calendar.MONTH)+1;
        day=D.get(Calendar.DAY_OF_MONTH);
        return checkNum(year)+"-"+checkNum(moth)+"-"+checkNum(day);
    }
    
    private static String checkNum(int num) {
    	if(num<10) {
    		return "0"+num;
    	}
    	return String.valueOf(num);
    }
}
