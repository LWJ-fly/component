package study.GoF23.StructuralPattern.dynamicProxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/12 0:40
 * @Descrintion:动态代理处理类,我们会用这个类，动态生成代理类
 * @version: 1.0
 */
public class proxyinvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理的类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //动态代理的本质，就是使用反射机制实现
        Object invoke = method.invoke(rent, args);
        fee();
        return invoke;
    }

    public void seeHouse(){
        System.out.println("中介看房子");
    }
    public void fee(){
        System.out.println("收小费");
    }


}
