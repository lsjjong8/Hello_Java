package chapter14.lecture;

import java.io.*;

public class NonBufferVsBufferExample {
    
    static int data = -1;
    
    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime(); // 시작 시간 저장

        // 시작 : 원본 파일에서 읽은 1 byte를 타깃 파일로 바로 출력
        while(true) {
            data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();
        // 끝 : 원본 파일에서 읽은 1 byte를 타깃 파일로 바로 출력

        long end = System.nanoTime(); // 끝 시간 저장

        return (end-start); // 복사에 걸린 시간 리턴
    }
    public static void main(String[] args) throws Exception {
        String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
        String targetFilePath1 = "C:/Temp/targetFile1.jpg";
        FileInputStream fis1 = new FileInputStream(originalFilePath1);
        FileOutputStream fos1 = new FileOutputStream(targetFilePath1);

        String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
        String targetFilePath2 = "C:/Temp/targetFile2.jpg";
        BufferedInputStream fis2 = new BufferedInputStream(new FileInputStream(originalFilePath2));
        BufferedOutputStream fos2 = new BufferedOutputStream(new FileOutputStream(targetFilePath2));

        long nonBufferTime = copy(fis1, fos1);
        System.out.println("버퍼를 사용하지 않았을때:\t" + nonBufferTime + "ns");

        long bufferTime = copy(fis2, fos2);
        System.out.println("버퍼를 사용했을 때:\t" + bufferTime + "ns");

        fis1.close();
        fos1.close();
        fis2.close();
        fos2.close();
    }
}
