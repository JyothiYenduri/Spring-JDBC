package RetrievingData;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import RetrievingData.StudentJDBCTemplate;

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
        
        System.out.println("-----Listing Multiple Records-----");
        List<Student> students=studentJDBCTemplate.listStudents();
        
        for(Student record: students) {
        	System.out.print("ID : "+record.getId());
        	System.out.print(", Name : "+record.getName());
        	System.out.println(", Age : "+record.getAge());
        }
    }
}
