

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;
import spark.template.velocity.VelocityTemplateEngine;

public class CohortController {

    public static void main(String[] args){
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        staticFileLocation("/public");

        get("/random", (req, res) -> {


        
        },velocityTemplateEngine);

        get("/pair", (req, res) -> {



        },velocityTemplateEngine);
    }
}
