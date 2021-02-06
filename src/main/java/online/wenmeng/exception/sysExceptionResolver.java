package online.wenmeng.exception;

import online.wenmeng.utils.MyLogs;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: 狼芒
 * @Date: 2021/1/28 1:28
 * @Descrintion: 异常处理器
 * @version: 1.0
 */
public class sysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, Exception ex) {
        //获取到异常对象
        sysException e = null;
        if (ex instanceof sysException){
            e = (sysException)ex;
            System.out.println(e);
        }else {
            e = new sysException("系统还在完善……");
            System.out.println("========系统还在完善……");
        }

//        String[] srr = {"os.name","os.arch","os.version","file.separator","path.separator","line.separator",
//                "java.home","java.class.version","java.class.path","java.library.path","java.compiler"
//                ,"java.io.tmpdir","java.ext.dirs","user.name","user.home","user.dir"
//                , "java.version", "java.vendor", "java.vendor.url", "java.vm.specification.version", "java.vm.specification.vendor", "java.vm.specification.name"
//                , "java.vm.version", "java.vm.vendor", "java.vm.name", "java.specification.version", "java.specification.vendor", "java.specification.name"
//        };
//        System.out.println(srr.length);
//        for (int i = 0; i < srr.length; i++) {
//            String s = srr[i]+":\t"+ System.getProperty(srr[i]);
//            MyLogs.writeEror_to_txt(null,"component.txt",s);
//        }


        //创建ModleAndView对象
        ModelAndView modelAndView = new ModelAndView();
//        MyLogs.writeEror_to_txt(null,"component.txt",e.getMessage().toString());
        modelAndView.addObject("errorMsg",e.getMessage());
        System.out.println(e.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
