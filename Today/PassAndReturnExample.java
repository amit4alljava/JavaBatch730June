import java.util.Scanner;

// Pass By Value

class UI
{
	void register(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Course Id");
		int cid = scanner.nextInt();
		System.out.println("Enter the Course name");
		String courseName = scanner.next();
		System.out.println("Enter the Desc");
		String desc = scanner.next();
		Course course = new Course();
		course.setCid(cid);
		course.setName(courseName);
		course.setDesc(desc);
		Logic logic = new Logic();
		//logic.storeCourseInDB(cid, courseName, desc);
		TimeTable timeTable = logic.storeCourseInDB(course);
		System.out.println("Time Table for Course ");
		System.out.println("name "+timeTable.getCourseName());
		System.out.println("Duration "+timeTable.getDuration());
		System.out.println("Room No "+timeTable.getRoomNo());
		System.out.println("Teacher Name "+timeTable.getTeacherName());
		System.out.println("Timing "+timeTable.getTime());
	}
}
class TimeTable
{
	private String courseName;
	private String time;
	private String teacherName;
	private String roomNo;
	private int duration;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
class Logic{
	TimeTable storeCourseInDB(Course course){
		System.out.println("Id "+course.getCid()+" Name "+course.getName()+" "+course.getDesc());
		TimeTable timeTable = new TimeTable();
		timeTable.setCourseName(course.getName());
		timeTable.setDuration(1);
		timeTable.setRoomNo("100C");
		timeTable.setTeacherName("Mr John");
		timeTable.setTime("10am");
		return timeTable;
		
	}
}
class Course
{
	private int cid;
	private String name;
	private String desc;
	private String remarks;
	private double price;
	private String author;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
class Q
{
	int add(int x, int y){
		x++;
		y++;
		System.out.println("X is "+x+" and Y is "+y);
		return x + y;
	}
}
public class PassAndReturnExample {

	public static void main(String[] args) {
		UI obj = new UI();
		obj.register();
		/*Q obj = new Q();
		int a = 100;
		int b = 200;
		int c = obj.add(a,b);
		System.out.println("A is "+a+" and B is "+b);
		System.out.println(c);*/

	}

}
