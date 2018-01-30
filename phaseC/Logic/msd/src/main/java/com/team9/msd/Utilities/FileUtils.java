package com.team9.msd.Utilities;

import java.io.File;
import java.io.IOException;

/**
 * This is the utility class that performs operations on File paths to
 * get the correct path for any machine
 */
public class FileUtils {

    /**
     * Locates the resource folder in the given systems file hierarchy
     * @return the path of the resource folder
     */
    private static String getResourceFolder() {
        String classLoader = System.getProperty("user.dir");
        return classLoader + File.separator+ "msd" + File.separator+"src"+File.separator+"main"+File.separator+"resources";
    }

    /**
     * Goes one level deeper into the resource folder
     * @param path, the path till the resource folder
     * @return the path of the next folder that is a level deeper
     */
    private static String getResource(String path) {
        return getResourceFolder() + File.separator + path;
    }

    /**
     * Returns the path of the UploadedFiles folder that stores all
     * the files being uplaoded from our view
     * @return the path of the upload folder
     */
    public static String getUploadFolder() {
        return getResource("UploadedFiles"+File.separator);
    }

    /**
     * Returns the path of the UploadedFiles folder that stores all
     * the files being uplaoded from our view
     * @return the path of the upload folder
     */
    public static String getUploadFolder2() {
        return getResource("UploadedFiles2"+File.separator);
    }


    /**
     * Deletes all files in the UploadedFiles folder
     * @param uploadFolder, path of the UploadedFiles folder
     * @throws IOException
     */
    public static void deleteFiles(String uploadFolder) throws IOException {
        File directory = new File(uploadFolder);
        org.apache.tomcat.util.http.fileupload.FileUtils.cleanDirectory(directory);
    }

    /***
     * Creates an empty directory if it does not exist.
     * @param uploadFolder
     */
    public static void createDir(String uploadFolder) {
        File dir1 = new File(uploadFolder);

        if(!dir1.exists()){
            try {
                dir1.mkdir();
            }
            catch (SecurityException se){
                System.out.println("Folder not created");
            }
        }
    }

}
