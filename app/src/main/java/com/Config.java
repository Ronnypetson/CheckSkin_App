package com;//package info.androidhive.camerafileupload;

public class Config {
    // File upload url (replace the ip with your server address)
    public static String FILE_UPLOAD_URL = "http://10.0.0.108:8000";

    // Directory name to store captured images and videos
    public static final String IMAGE_DIRECTORY_NAME = "skin_imgs";

    public Config(String url){
        this.FILE_UPLOAD_URL = url;
    }
}
