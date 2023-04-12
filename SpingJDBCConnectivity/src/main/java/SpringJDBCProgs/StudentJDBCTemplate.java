package SpringJDBCProgs;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
	public void create(String name, Integer age) {
		String SQL="insert into students (name, age) values (?, ?)";
		jdbcTemplateObject.update(SQL, name, age);
		System.out.println("Create Record Name = "+name+" Age = "+age);
		
	}
}
