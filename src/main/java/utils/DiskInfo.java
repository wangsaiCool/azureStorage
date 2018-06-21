package utils;

public class DiskInfo {
    private static int freeSpace = 0;
    private static int totalSpace = 0;
    private static int usedSpace = 0;
    //各个磁盘路径
    private static String pathName = null;

    public static String getPathName() {
        return pathName;
    }

    public static void setPathName(String pathName) {
        DiskInfo.pathName = pathName;
    }

    public DiskInfo() {
    }

    public static int getSpaceFree() {
        return freeSpace;
    }

    public static void setSpaceFree(int freeSpace) {
        DiskInfo.freeSpace = freeSpace;
    }

    public static int getTotalFree() {
        return totalSpace;
    }

    public static void setTotalFree(int totalSpace) {
        DiskInfo.totalSpace = totalSpace;
    }

    public static int getUsedFree() {
        return usedSpace;
    }

    public static void setUsedFree(int usedSpace) {
        DiskInfo.usedSpace = usedSpace;
    }
}
