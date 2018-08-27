package com.xin.jpush.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Properties;

public class FileSystemImpl implements ConfigIntf {
    private static transient final Logger LOGGER = LoggerFactory.getLogger(FileSystemImpl.class);
//    public static final String FILE_SEPARATOR = System.getProperty("file.separator");
//    private String basePath;
//
//    public FileSystemImpl(String basepath) {
//        int i = basepath.indexOf("%");
//        int j = basepath.indexOf("%", i + 1);
//        if (j < 0) {
//            this.basePath = basepath;
//            LOGGER.warn("config path is set to a absolute path : " + this.basePath
//                    + ". please set the configpath arg when start the tomcat server");
//        } else {
//            String querystring = basepath.substring(i + 1, j);
//
//            String reg = basepath.substring(i, j + 1);
//            LOGGER.info("config path is set as a relative path. trying to get the path from tomcat starup parameter... ");
//
//            String replacestring = System.getProperty(querystring);
//            if (replacestring == null) {
//                LOGGER.error(" could not get the configpath parameter : " + querystring
//                        + " it is not set as a tomcat startup parameter,please check it ");
//            } else {
//                String prefix = basepath.substring(0, i);
//                String postfix = basepath.substring(j + 1);
//                this.basePath = prefix + replacestring + postfix;
//                LOGGER.info("substitute " + reg + " to " + replacestring);
//                LOGGER.info("set config base path to: " + this.basePath);
//            }
//        }
//    }
//
//    public String getBasePath() {
//        return basePath;
//    }
//
//    public String[] getPropertyFiles() {
//        try {
//            File file = new File(this.basePath);
//            return file.list(new FilenameFilter() {
//                public boolean accept(File dir, String name) {
//                    return name.toLowerCase().endsWith(".properties");
//                }
//            });
//        } catch (Exception e) {
//            LOGGER.warn(String.format("读取配置文件失败: path = %s, msg = %s", this.basePath,
//                    e.getMessage()));
//            return null;
//        }
//    }
//
//    public InputStream getResourceAsStream(String filePath) throws FileNotFoundException {
//        LOGGER.info("read config file " + filePath + " from " + this.basePath);
//
//        InputStream inputStream;
//        inputStream = new FileInputStream(new File(this.basePath + FILE_SEPARATOR + filePath));
//
//        LOGGER.info("read config file " + filePath + " complete.");
//
//        return inputStream;
//    }
//
//    public Properties getResourceAsProperties(String filePath) throws IOException {
//        Properties props = new Properties();
//        InputStream in = getResourceAsStream(filePath);
//        if (in == null) {
//            return null;
//        }
//
//        props.load(in);
//        in.close();
//
//        return props;
//    }
}
