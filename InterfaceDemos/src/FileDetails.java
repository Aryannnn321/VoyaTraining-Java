public class FileDetails {
    public static  void main(String[] args){
        ICompressor compressor= new ZipCompressor();
        String[] zip= compressor.compressFiles("file.doc", "image.jpeg");
    }
}
