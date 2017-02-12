package cn.itsrobin.swagger;


import com.google.common.base.Joiner;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lifeng
 * @createTime 2017/2/12.
 * @updateTime 2017/2/12
 */
@Path("/restService")
public class RestService {

   public RestService(){

        System.out.println(111111111);
    }

    @GET
    @Path("/getUserText")
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserText() {
        return "Hello,World!";
    }
}
