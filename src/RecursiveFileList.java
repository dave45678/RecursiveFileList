/**
 * Lists all the files and directories of the given folder recursively
 */
import java.io.File;

public class RecursiveFileList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        walkin(new File ("MyDir"));
        System.out.println("<End of Listing>");
    }

    public static void walkin(File dir) {
        
        File  listFile[] = dir.listFiles();
        if (listFile != null) {
            for (int i=0; i<listFile.length; i++) {
                if (listFile[i].isDirectory()) {
                    System.out.println("Directory: " + listFile[i].getPath());
                    walkin(listFile[i]);
                } else {
                    //if (listFile[i].getName().endsWith(pattern)) {
                    System.out.println("           " + listFile[i].getPath());
                }
            }
        }
    }
}
