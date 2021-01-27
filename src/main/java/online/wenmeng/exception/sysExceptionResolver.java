package online.wenmeng.exception;

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
        }else {
            e = new sysException("系统还在完善……");
        }
        //创建ModleAndView对象
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMsg",e.getMessage());
        System.out.println(e.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
