package Framawork.Utils;

import java.io.File;

public class CreateFolders {

   public static void createFolderRepost(String path) {
       File pathReport = new File(path);
       
       if(!pathReport.exists()) {
           pathReport.mkdir();
       }
   }
}
