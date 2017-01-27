package controllers;

/**
 * Created by HAWK-VAIO on 1/27/2017.
 */

import play.mvc.*;

public class Application extends Controller {

    public Result hello(String name) {
        response().setHeader(Http.HeaderNames.CACHE_CONTROL, "max-age=3600");
        return ok("<h1>Hello " + name + "!</h1>").as("text/html");
    }

}