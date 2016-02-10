import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;
import java.util.ArrayList;

public class NumberToWords {

  String[] smallArray = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
  String[] teenArray  = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
  String[] tensArray  = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
  String[] hundredsArray = {"One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", "Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"};

  public static void main(String[] args) {
    // staticFileLocation("/public");
  //   get("/", (request, response) -> {
  //     HashMap model = new HashMap();
  //     model.put("template", "templates/Scrabble.vtl");
  //     return new ModelAndView(model, "templates/layout.vtl");
  //   }, new VelocityTemplateEngine());
  //
  //   get("/results", (request, response) -> {
  //     HashMap model = new HashMap();
  //     String userWord = request.queryParams("userWord");
  //     Integer results = getScore(userWord);
  //     System.out.println("results" + results);
  //     model.put("userWord", userWord);
  //     model.put("results", results);
  //     model.put("template", "templates/Scrabble.vtl");
  //     return new ModelAndView(model, "templates/layout.vtl");
  //   }, new VelocityTemplateEngine());
  }

  public String convert(Integer number) {

    if (number < 11){
    return smallArray[number];
    }
    else if (number > 10 && number < 20) {
      return teenArray[(number % 10) - 1];
    }
    else if (number > 19 && number < 100){
      if (number % 10 == 0){
        return tensArray[(number / 10) - 2];
      }
      else{
        return (tensArray[(number / 10) - 2] + " " + smallArray[number % 10] );
      }
    }
    else if (number > 99 && number < 1000) {
      if (number % 100 == 0){
        return hundredsArray[(number / 100) - 1 ];
      }
      else {
        return "Wrong";
      }
    }

    return "Wrong";

  }
}
