package controllers;

/**
 * Created by HAWK-VAIO on 1/27/2017.
 */

import play.mvc.*;

public class Application extends Controller {

    public Result hello(String name) {
        return ok("Hello " + name + "!");
    }

}