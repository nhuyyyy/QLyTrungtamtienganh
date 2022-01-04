/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttnn.BLL;

import java.io.File;



/**
 *
 * @author WindZ
 */
public class Hander {
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty())
            return false;
        return true;
    }
    public static String getFullPath(final String shortPath) {
        /*
        final URL resource = Handler.class.getClassLoader().getResource("./" + shortPath);
        String tempPath = resource.getFile(); // get the path of class
        tempPath = tempPath.substring(1); // removes the "/" character at the beginning of the path
        tempPath = tempPath.replace("%20", " "); // spaces handler with url
        return tempPath;
        */
        File file = new File(shortPath);
        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }
}

