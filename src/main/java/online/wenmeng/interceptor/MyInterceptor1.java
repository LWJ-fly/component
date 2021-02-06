package online.wenmeng.interceptor;

import online.wenmeng.utils.MyStatic;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: 狼芒
 * @Date: 2021/1/30 18:18
 * @Descrintion: 自定义拦截器，不适合拦截错误的异常，适合进行权限验证，页面跳转，流之间的关闭等
 * @version: 1.0
 */
public class MyInterceptor1 implements HandlerInterceptor {
    /**
     * 预处理方法，在刚进来的时候进行判断，首次要执行这一逻辑，但是并不在页面中执行，而是后台执行，所以！逻辑不可合理会造成死循环
     * @param request
     * @param response
     * @param handler
     * @return 返回true的话放行，false不放行,首先！要经过路径管理器，如果没有此路径是不执行的
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        if (MyStatic.flag){
            MyStatic.num++;
            if (MyStatic.num>5){
                MyStatic.flag = false;
            }
            System.out.println("preHandle…………");
            request.getRequestDispatcher("fileUpLoad.jsp").forward(request,response);
            return false;
        }
        return true;
    }

    /**
     * 执行controler执行后 返回页面前 执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle"+modelAndView);
//        request.getRequestDispatcher("error.html").forward(request,response);
    }

    /**
     * 在页面加载完成后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion "+ex);
        String afterOut = response.getHeader("afterOut");
        if (afterOut!=null&&afterOut.equals("afterOut")){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                         request.getRequestDispatcher("fileUpLoad.jsp").forward(request,response);
                    } catch (ServletException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }
}
