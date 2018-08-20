

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Random;

public class CohortController {

    public static void main(String[] args){
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        Cohort cohort = new Cohort("E-23");
        Student student1 = new Student("Euan");
        Student student2 = new Student("Stoo");
        Student student3 = new Student("Vicky");
        Student student4 = new Student("Ricardo");
        Student student5 = new Student("Digory");
        Student student6 = new Student("Joanne");
        Student student7 = new Student("Raphael");
        Student student8 = new Student("Pat");
        Student student9 = new Student("Mike");
        Student student10 = new Student("Marcin");
        Student student11 = new Student("Kirstin");
        Student student12 = new Student("Gemma");
        Student student13 = new Student("Emil");
        Student student14 = new Student("Melinda");
        Student student15 = new Student("Robbie");
        Student student16 = new Student("Bea");
        Student student17 = new Student("Tahnee");
        Student student18 = new Student("Gary");
        Student student19 = new Student("Mark");
        Student student20 = new Student("Molly");
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        cohort.addStudent(student3);
        cohort.addStudent(student4);
        cohort.addStudent(student5);
        cohort.addStudent(student6);
        cohort.addStudent(student7);
        cohort.addStudent(student8);
        cohort.addStudent(student9);
        cohort.addStudent(student10);
        cohort.addStudent(student11);
        cohort.addStudent(student12);
        cohort.addStudent(student13);
        cohort.addStudent(student14);
        cohort.addStudent(student15);
        cohort.addStudent(student16);
        cohort.addStudent(student17);
        cohort.addStudent(student18);
        cohort.addStudent(student19);
        cohort.addStudent(student20);

        get("/random", (req, res) -> {

            Random generator = new Random();
            int randomIndex = generator.nextInt(cohort.getStudents().size());
            Student randomName = cohort.getStudents().get(randomIndex);

            HashMap<String, Object> model = new HashMap<>();
            model.put("randomName", randomName);
            return new ModelAndView(model, "random.vtl");

        },velocityTemplateEngine);

        get("/pair", (req, res) -> {
            Random generator = new Random();
            int randomIndex = generator.nextInt(cohort.getStudents().size());
            Student name1 = cohort.getStudents().get(0);
            Student name2 = cohort.getStudents().get(1);
            HashMap<String, Object> model = new HashMap<>();
            model.put("name1", name1);
            model.put("name2", name2);
            return new ModelAndView(model, "pair.vtl");
        },velocityTemplateEngine);
    }
}
