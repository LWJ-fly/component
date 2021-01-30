package online.wenmeng.test;

import online.wenmeng.utils.MyLogs;

/**
 * @Auther: 狼芒
 * @Date: 2021/1/30 13:57
 * @Descrintion:
 * @version: 1.0
 */
public class Test {

    @org.junit.Test
    public void fun(){
        String[] srr = {"os.name","os.arch","os.version","file.separator","path.separator","line.separator",
                "java.home","java.class.version","java.class.path","java.library.path","java.compiler"
                ,"java.io.tmpdir","java.ext.dirs","user.name","user.home","user.dir"
                , "java.version", "java.vendor", "java.vendor.url", "java.vm.specification.version", "java.vm.specification.vendor", "java.vm.specification.name","file.encoding"
                , "java.vm.version", "java.vm.vendor", "java.vm.name", "java.specification.version", "java.specification.vendor", "java.specification.name"
        };
        System.out.println(srr.length);
        for (int i = 0; i < srr.length; i++) {
            String s = (i+1)+"\t"+srr[i]+":\t"+ System.getProperty(srr[i]);
            System.out.println(s);
        }
    }

}
