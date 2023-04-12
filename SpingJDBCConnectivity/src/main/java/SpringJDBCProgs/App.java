package SpringJDBCProgs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SpringJDBCProgs.StudentJDBCTemplate;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("-----Records Creation------");
        studentJDBCTemplate.create("Chinna",21);
        studentJDBCTemplate.create("Moni",28);
        studentJDBCTemplate.create("Dhruva",25);
        
    }
}
