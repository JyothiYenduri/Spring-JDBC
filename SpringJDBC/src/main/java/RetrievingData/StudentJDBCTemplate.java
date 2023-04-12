package RetrievingData;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
public class StudentJDBCTemplate {

		private DataSource dataSource;
		private JdbcTemplate jdbcTemplateObject;
		
		public void setDataSource(DataSource dataSource) {
			this.dataSource=dataSource;
			this.jdbcTemplateObject=new JdbcTemplate(dataSource);
		}
		public void create(String name, Integer age) {
			String SQL="insert into students1 (name, age) values (?, ?)";
			jdbcTemplateObject.update(SQL, name, age);
			System.out.println("Create Record Name = "+name+" Age = "+age);
			
		}
		public List<Student> listStudents(){
			String SQL="select * from students1";
			List<Student> students=jdbcTemplateObject.query(SQL, new BeanPropertyRowMapper<Student>(Student.class));
			return students;
		}
}
