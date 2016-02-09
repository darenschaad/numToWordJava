import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;
import java.util.ArrayList;

public class Scrabble {
  public HashMap letters = new HashMap();

  public static void main(String[] args) {
    staticFileLocation("/public");

  }
}
