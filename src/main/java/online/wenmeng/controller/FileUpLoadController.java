package online.wenmeng.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import online.wenmeng.exception.sysException;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Auther: 狼芒
 * @Date: 2021/1/27 23:38
 * @Descrintion:
 * @version: 1.0
 */
@Controller
public class FileUpLoadController {

    /**
     * SpringMVC文件上传
     * @return
     */
    @ResponseBody
    @RequestMapping("fileupload")
    public String fileUpLoad(MultipartFile upload,String name){
        String originalFilename = upload.getOriginalFilename();
        originalFilename = UUID.randomUUID().toString().replace("-","")+originalFilename;
        String path = System.getProperty("user.dir");
        File file = new File(path);
        path = file.getParent();
        file = new File(path,"webapps");
        path = file.getAbsolutePath();
        file = new File(path,originalFilename);
        try {
            if (name!=null&&name.trim().length()>0) {
                upload.transferTo(file);
                System.out.println(file.getAbsolutePath()+"\t\tname:"+name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
    /**
     * 跨服务器文件上传
     * @return
     */
    @ResponseBody
    @RequestMapping("fileuploadToImg")
    public String fileuploadToImg(MultipartFile upload,String name){
        String originalFilename = upload.getOriginalFilename();
        originalFilename = UUID.randomUUID().toString().replace("-","")+originalFilename;
        String path = "https://localhost:8080/upload";
        File file = new File(path,originalFilename);
        System.out.println(file.getAbsolutePath()+"\t\tname:"+name);
        //创建客户端对象
        Client client = Client.create();
        //和图片服务器进行连接
        WebResource webResource = client.resource(path + originalFilename);
        //上传文件
        try {
            webResource.put(upload.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping("exception")
    public String exception() throws sysException {
        System.out.println("exception is run");
            int i= 10/0;

        return "sucess";
    }

    @RequestMapping("afterOut")
    public ModelAndView afterOut(ModelAndView modelAndView, HttpServletResponse response){
        response.setHeader("afterOut","afterOut");
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
