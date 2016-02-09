import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;
import java.util.ArrayList;

public class Scrabble {

  public static void main(String[] args) {
    // staticFileLocation("/public");
    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/Scrabble.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      String userWord = request.queryParams("userWord");
      Integer results = getScore(userWord);
      System.out.println("results" + results);
      model.put("userWord", userWord);
      model.put("results", results);
      model.put("template", "templates/Scrabble.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

  }

  public static Integer getScore(String word){

    HashMap <Character, Integer> letters  = new HashMap();
    letters.put('A', 1);
    letters.put('B', 3);
    letters.put('C', 3);
    letters.put('D', 2);
    letters.put('E', 1);
    letters.put('F', 4);
    letters.put('G', 2);
    letters.put('H', 4);
    letters.put('I', 1);
    letters.put('J', 8);
    letters.put('K', 5);
    letters.put('L', 1);
    letters.put('M', 3);
    letters.put('N', 1);
    letters.put('O', 1);
    letters.put('P', 3);
    letters.put('Q', 10);
    letters.put('R', 1);
    letters.put('S', 1);
    letters.put('T', 1);
    letters.put('U', 1);
    letters.put('V', 4);
    letters.put('W', 4);
    letters.put('X', 8);
    letters.put('Y', 4);
    letters.put('Z', 10);

    String wordUpper = word.toUpperCase();
    char[] charArray = wordUpper.toCharArray();

    Integer score = 0;
    for (Integer i = 0; i < charArray.length; i++) {
     score = score + (Integer) letters.get('A');
    }
    return score;
  }
}
