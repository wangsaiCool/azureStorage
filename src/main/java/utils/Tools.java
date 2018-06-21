package utils;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.io.File;
import java.util.Map;
import javax.swing.filechooser.FileSystemView;

/**
 * SCAN ALL THE DISKS<br>
 * <p>
 *
 * @author wangsai
 */
public class Tools {

    public static void getDiskInfo() {
        DiskInfo diskInfo = new DiskInfo();
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File[] roots = File.listRoots();
        for (File file : roots) {
            String path = file.getPath();
            System.out.println(path);

            String diskName = fileSystemView.getSystemTypeDescription(file);
            System.out.println(diskName);
        }

    }

    public static void main(String[] args) {
        getDiskInfo();
    }

}
