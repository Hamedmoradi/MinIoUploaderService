package minio.uploader.service.service;

import io.minio.messages.Bucket;
import minio.uploader.service.payload.FileResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

public interface MinioService {

    boolean bucketExists(String bucketName);

    void makeBucket(String bucketName);

    List<String> listBucketName();

    List<Bucket> listBuckets();

    boolean removeBucket(String bucketName);

    List<String> listObjectNames(String bucketName);

    FileResponse putObject(MultipartFile multipartFile, String bucketName, String fileType);

    InputStream downloadObject(String bucketName, String objectName);

    boolean removeObject(String bucketName, String objectName);

    boolean removeListObject(String bucketName, List<String> objectNameList);

    String getObjectUrl(String bucketName,String objectName);
}
