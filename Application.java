import java.util.*;

public class Application{

	public static void main(String[] args){

		List<String> names = new ArrayList<String>();
		String formatString = "%sa%stl%sn%s";

		List<String> options_0 = Arrays.asList("K","C");
		List<String> options_1 = Arrays.asList("i","y");
		List<String> options_2 = Arrays.asList("i","y");
		List<String> options_3 = Arrays.asList("","n");

		for(String a : options_0){
			for(String b : options_1){
				for(String c : options_2){
					for(String d : options_3){
						String name = String.format(formatString, a, b, c, d);
						names.add(name);
					}
				}
			}
		}

		for(int i=0; i < names.size(); i++){
			String line = String.format("%d:\t%s", i, names.get(i));
			System.out.println(line);
		}

	}

}
