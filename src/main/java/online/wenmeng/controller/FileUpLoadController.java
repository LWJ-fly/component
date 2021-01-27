package online.wenmeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
    public String fileUpLoad(MultipartFile upload){
        String originalFilename = upload.getOriginalFilename();
        originalFilename = UUID.randomUUID().toString().replace("-","")+originalFilename;
        String path = System.getProperty("user.dir");
        File file = new File(path,originalFilename);
        System.out.println(file.getAbsolutePath());
        try {
            upload.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

}
