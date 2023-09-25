package com.ccteam;
public class Employee {
		private int eid;
		private String ename;
		public void setEid(int eid){
			this.eid=eid;
		}
		public int getEid(){
			return eid;
		}
		public void setEname(String ename) {
			this.ename=ename;
		}
		public String getEname() {
			return ename;
		}
		public static void main(String[] args) {
			Employee em=new Employee();
			em.setEid(12);
			em.setEname("Nitya");
			em.getEid();
			em.getEname();
			System.out.println(em.getEid());
			System.out.println(em.getEname());
		}
	}
