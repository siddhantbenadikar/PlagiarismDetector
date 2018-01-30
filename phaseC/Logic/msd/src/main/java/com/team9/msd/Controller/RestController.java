package com.team9.msd.Controller;

import com.team9.msd.Utilities.DriverFactory;
import com.team9.msd.Utilities.FileUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/***
 * This class represents a spring boot Rest Controller
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private String uploadFolder = FileUtils.getUploadFolder();
    private String uploadFolder2 = FileUtils.getUploadFolder2();

    /***
     * Function call to create initial directories
     */
    public void createDirs(){
        FileUtils.createDir(uploadFolder);
        FileUtils.createDir(uploadFolder2);
    }

    /***
     * Function which accepts multiple files of a project and stores them on the server
     * Under the folder resources/UploadedFiles
     * @param file
     * @return
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value= "/upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<?> uploadFile(@RequestParam("files") MultipartFile file) {
        createDirs();
        try {
            byte[] bytes = file.getBytes();
            Path dest = Paths.get(uploadFolder + file.getOriginalFilename());
            Files.write(dest, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    /***
     * Function which accepts multiple files of a project and stores them on the server
     * Under the folder resources/UploadedFiles2
     * @param file
     * @return
     * @throws IOException
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/upload2", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<?> uploadFile2(@RequestParam("files") MultipartFile file) throws IOException {

        byte[] fileBytes = file.getBytes();
        Path dest = Paths.get(uploadFolder2 + file.getOriginalFilename());
        Files.write(dest, fileBytes);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    /***
     * Driver function, which calls helpers and java program to calculate the similarities.
     * @return
     * @throws IOException
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/detect", method = RequestMethod.POST)
    public ResponseEntity<?> detect() throws IOException {

        List<Map<String, String>> resp = new ArrayList<>();

        File[] files = new File(uploadFolder).listFiles();
        File[] files2 = new File(uploadFolder2).listFiles();

        if(files.length == 0 || files2.length == 0){
            return new ResponseEntity<Object>(null, HttpStatus.NOT_FOUND);
        }

        Integer count = 1;
        for(File f1: files){
            for(File f2: files2){
                Map<String, String> innerMap = new HashMap<>();

                Double lcs = Math.floor(DriverFactory.getLcsSimilarity(f1, f2));
                Double jks = Math.floor(DriverFactory.getJaccardSimilarity(f1, f2));

                lcs = (lcs+jks)/2;
                String file1 = f1.getName();
                String file2 = f2.getName();
                String lcsScore = lcs.toString()+"%";
                String jksSCore = jks.toString()+"%";

                innerMap.put(count.toString(), file1);
                count++;
                innerMap.put(count.toString(), file2);
                count++;
                innerMap.put(count.toString(), lcsScore);
                count++;
                innerMap.put(count.toString(), jksSCore);
                count++;

                resp.add(innerMap);

            }
        }

        FileUtils.deleteFiles(uploadFolder);
        FileUtils.deleteFiles(uploadFolder2);

        return new ResponseEntity<>(resp, HttpStatus.OK);
    }
}
