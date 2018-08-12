package com.cdc.blinddate.util;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @name: FileUtil
 * @description: 文件操作工具类
 * @author: 纪佳鸿
 * @time: 2018/8/11 20:03
 */
public class FileUtil {

    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
    File targetFile = new File(filePath);
    if(!targetFile.exists()){
        targetFile.mkdirs();
    }
    FileOutputStream out = new FileOutputStream(filePath+fileName);
    out.write(file);
    out.flush();
    out.close();
}
}
