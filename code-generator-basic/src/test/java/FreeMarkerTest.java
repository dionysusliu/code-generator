import freemarker.template.TemplateException;
import org.junit.Test;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import java.io.IOException;


public class FreeMarkerTest {
    @Test
    public void test() throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
        // path to template files
        configuration.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));
        // charset for templates
        configuration.setDefaultEncoding("utf-8");
        // load the template
        Template template = configuration.getTemplate("myweb.html.ftl");

        // construct data model (a HashMap)
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("currentYear", 2023);
        List<Map<String, Object>> menuItems = new ArrayList<>();
        Map<String, Object> menuItem1 = new HashMap<>();
        menuItem1.put("url", "https://codefather.cn");
        menuItem1.put("label", "code-nav");
        Map<String, Object> menuItem2 = new HashMap<>();
        menuItem2.put("url", "https://laoyujianli.com");
        menuItem2.put("label", "calendar");
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        dataModel.put("menuItems", menuItems);

        // generate payload from (template, datamodel)
        Writer out = new FileWriter("myweb.html");
        template.process(dataModel, out);
        out.close();
    }

}
