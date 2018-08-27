package com.xin.jpush.common;

//import org.dom4j.Document;
//import org.dom4j.DocumentException;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;

public class ConfigUtil {
//    private static transient final Logger LOGGER = LoggerFactory.getLogger(ConfigUtil.class);
//    private static final String READER_CONFIG = "/ReaderConfig.xml";
//    private static final String CONFIG_PATH = "configpath";
//
//    private static ConfigIntf configIntf = null;
//
//    public enum ConfigType {
//        filesystem, classpath, rest
//    }
//
//    public static ConfigIntf getConfigReader() {
//        if (configIntf == null) {
//            setConfigReader();
//        }
//
//        return configIntf;
//    }
//
//    public static void setConfigReader() {
//        URL url = ConfigUtil.class.getResource(READER_CONFIG);
//        InputStream stream = ConfigUtil.class.getResourceAsStream(READER_CONFIG);
//        if (stream == null || (url.toString().contains(".jar!"))) {
//            LOGGER.info("config reader type is set to default classpath loading way.");
//            configIntf = new ClassPathImpl();
//        } else {
//            SAXReader saxReader = new SAXReader();
//            Document document = null;
//            try {
//                document = saxReader.read(stream);
//            } catch (DocumentException e) {
//                LOGGER.error("error while reading conifg file." + e);
//            }
//
//            Element root = document.getRootElement();
//            Iterator<?> iter = root.elementIterator("readerconfig");
//            Element data = (Element) iter.next();
//            String type = data.elementText("readertype").trim().toLowerCase();
//            String basepath = data.elementText("basepath").trim().toLowerCase();
//            initialConfig(type, basepath);
//        }
//    }
//
//    public static URL getResourceURL(String fileName) {
//        ConfigIntf configIntf = getConfigReader();
//        if (configIntf instanceof ClassPathImpl) {
//            fileName = fileName.replaceAll("../", "");
//            return ConfigUtil.class.getClassLoader().getResource(fileName);
//        } else if (configIntf instanceof FileSystemImpl) {
//            String basePath = ((FileSystemImpl) configIntf).getBasePath();
//            basePath += "/" + fileName;
//
//            return getFileURL(basePath);
//        } else if (configIntf instanceof RestImpl) {
//            String basePath = ((RestImpl) configIntf).getBasePath();
//            basePath += "/" + fileName;
//
//            return getFileURL(basePath);
//        } else {
//            return null;
//        }
//    }
//
//    public static String getConfigPath() {
//        return System.getProperty(CONFIG_PATH) == null ? "" : System.getProperty(CONFIG_PATH);
//    }
//
//    private static void initialConfig(String type, String path) {
//        ConfigType configType = ConfigType.valueOf(type);
//        LOGGER.info("config reader type is set to  :" + configType);
//        switch (configType) {
//            case filesystem:
//                configIntf = new FileSystemImpl(path);
//                break;
//            case rest:
//                configIntf = new RestImpl(path);
//                break;
//            default:
//                configIntf = new ClassPathImpl();
//                break;
//        }
//    }
//
//    private static URL getFileURL(String filePath) {
//        File file = new File(filePath);
//        try {
//            if (!file.exists()) {
//                LOGGER.warn(String.format("%s 不存在", file.getAbsolutePath()));
//                return null;
//            }
//
//            return file.toURI().toURL();
//        } catch (Exception e) {
//            LOGGER.error(e.getMessage());
//            return null;
//        }
//    }
}
