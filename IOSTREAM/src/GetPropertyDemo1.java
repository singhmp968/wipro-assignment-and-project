public class GetPropertyDemo1{
    public static void main(String[] args){
        String user_home=System.getProperty("user.home");
        String java_version=System.getProperty("java.version");
        String java_home=System.getProperty("java.home");
        String class_path=System.getProperty("java.class.path");
        String os_name=System.getProperty("os.name");
        String user_name=System.getProperty("user.name");
        String user_dir=System.getProperty("user.dir");
        System.out.println("Theuserhomedirectoryis"+user_home);
        System.out.println("Thejavaversionis"+java_version);
        System.out.println("TheJavaHomedirectoryis"+java_home);
        System.out.println("Theclasspathissetto"+class_path);
        System.out.println("TheOperatingSystemis"+os_name);
        System.out.println("Theusernameis"+user_name);
        System.out.println("Theworkingdirectoryis"+user_dir);}}