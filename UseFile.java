import java.io.File;

public class UseFile {
  public static void main(String[] args) {
    UseFile uf = new UseFile();
    uf.file();
  }
  public void file(){
    File f = new File("myFile.dat");
    System.out.println("The file is exists? --> "+f.exists());
    System.out.println("The file can write? --> "+f.canWrite());
    System.out.println("The file can read? --> "+f.canRead());
    System.out.println("The file is a file? --> "+f.isFile());
    System.out.println("The file is a directory? --> "+f.isDirectory());
    System.out.println("The file is absolute path? --> "+f.isAbsolute());
    System.out.println("The file's name is --> "+f.getName());
    System.out.println("The file's path is --> "+f.getPath());
    System.out.println("The file's absolute path is --> "+f.getAbsolutePath());
    System.out.println("The file's parent path is --> "+f.getParent());
    System.out.println("The file's last modifered time is --> "+f.lastModified());
    System.out.println("The file's length is --> "+f.length());
    File nf = new File("newFile");
    f.renameTo(nf);
    System.out.println("\t Rename the file to:"+nf.getName());
    System.out.println(f+" is exist? -->"+f.exists());
    nf.delete();
    System.out.println("Delete "+nf+" ...");
    System.out.println(nf+" is exists? -->"+f.exists());
  }
}
