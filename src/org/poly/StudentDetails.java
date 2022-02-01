package org.poly;

public class StudentDetails {
private void studentInfo(float salary) {
	System.out.println("Student salary "+ salary);
}private void studentInfo(int rollnumber,char grade) {
	System.out.println("Student roll number "+rollnumber+"\n"+"Student grade :"+grade);

}private void studentinfo(long phone) {
	System.out.println("Student Phone :"+phone);

}public static void main(String[] args) {
	StudentDetails r =new StudentDetails();
	r.studentinfo(9790710122l);
	r.studentInfo(2000.12f);
	r.studentInfo(30218,'A');
}
}
