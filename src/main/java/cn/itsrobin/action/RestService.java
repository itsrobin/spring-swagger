package cn.itsrobin.action;



import cn.itsrobin.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author lifeng
 * @createTime 2017/2/12.
 * @updateTime 2017/2/12
 */
@Path("/restService")
public class RestService {

    @GET
    @Path("/getUserText")
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserText() {
        return "Hello,World!";
    }

    @GET
    @Path("/getUserJson")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserJson() {
        User user  = new User();
        user.setName("snail");
        user.setAge("22");
        user.setSex("male");
        return user;
    }
}
