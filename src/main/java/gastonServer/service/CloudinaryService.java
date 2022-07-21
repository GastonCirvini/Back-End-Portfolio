
package gastonServer.service;
import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;


@Service
public class CloudinaryService {
    
    Cloudinary cloudinary;
    
    private Map<String, String> valuesMap = new HashMap<>();
    
    public CloudinaryService(){
        valuesMap.put("cloud_name", "porfoliorepo");
        valuesMap.put("api_key","749541136625581");
        valuesMap.put("api_secret","4xKuxaSFQmfbvqQ_PW5I6vMvvR8");
    cloudinary = new Cloudinary(valuesMap);
                }
    
    
    public Map upload(MultipartFile multipartfile) throws IOException{
        File file = convert (multipartfile);
        Map result = cloudinary.uploader().upload(file,ObjectUtils.emptyMap());
        file.delete();
        return result;
    }
    
    public Map delete(String id) throws IOException{
        Map result = cloudinary.uploader().destroy(id, ObjectUtils.emptyMap());
        
        return result;
    }
    
    private File convert(MultipartFile multipartfile) throws IOException{
        File file = new File(multipartfile.getOriginalFilename());
                FileOutputStream fo = new FileOutputStream(file);
                fo.write(multipartfile.getBytes());
                fo.close();
                return file;
    }
    
}
