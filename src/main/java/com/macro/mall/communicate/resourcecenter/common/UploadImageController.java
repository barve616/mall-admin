package com.macro.mall.communicate.resourcecenter.common;

import com.macro.mall.base.dto.UpPicBean;
import com.macro.mall.base.service.impl.ImgUtilsService;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.util.StringUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@RequestMapping("/image")
public class UploadImageController {

    @Resource
    private ImgUtilsService imgUtilsService;

    /**
     * base64图片上传
     * @param imageBase64 图片
     * @param path 目录
     */
    @RequestMapping(value = "/uploadImgBase64", method = RequestMethod.POST)
    public CommonResult uploadImgBase64 (@RequestParam(value = "imageBase64", required = true) String imageBase64,
                                         @RequestParam(value = "path", required = true) String path) {
        try {
            String filePath = filePath = imgUtilsService.uploadImg(imageBase64, path);
            if (StringUtil.isNotEmpty(filePath))
                return CommonResult.success(filePath);
            else
                return CommonResult.failed();
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
    }

    /**
     *二进制图片上传
     * @return
     */
    @RequestMapping(value = "uploadImgBinary", method = RequestMethod.POST)
    public CommonResult uploadImgBinary (MultipartFile file) {
        try {
            UpPicBean info = imgUtilsService.uploadPicToDMZ(file);
            if (info != null)
                return CommonResult.success(info);
            else
                return CommonResult.failed();
        } catch (IOException e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
    }
}
