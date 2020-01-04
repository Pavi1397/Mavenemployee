package com.deloitte.employee;
import javax.persistence.*;

@Entity
@Table(name="Employee_details")
public class Employee {

		private int empId;
		private String empname;
		private float salary;
		
		public Employee() {}
		
		public Employee(int empId, String empname, float salary) {
			super();
			this.empId = empId;
			this.empname = empname;
			this.salary = salary;
		}
		@Id
		@Column(name = "emp_id")
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}

}
