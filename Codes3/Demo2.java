import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class T
{
	private int x,y,z;
	public int r;
	static int p;
}
public class Demo2 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		int privateCount = 0;
		T obj = new T();
		Class cls = obj.getClass(); // Class Meta Data + Data
		// obj.r
		cls.getDeclaredField("r").set(obj, 1000);
		System.out.println("Data is "+cls.getDeclaredField("r").get(obj));
		//Class cls = T.class; // Class Meta Data
		Field fields [] = cls.getDeclaredFields();
		System.out.println(fields.length);
		for(Field f : fields){
			if(Modifier.isPrivate(f.getModifiers())){
				privateCount++;
			}
		}
		System.out.println("No of Private Variables are "+privateCount);

	}

}
