package Assignment3;
import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Assignment3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//TreeMap<Integer,String> tr = new TreeMap<>();
File fin = new File("C:\\Users\\DELL\\eclipse-workspace\\IOstreamAssignment\\src\\Assignment3\\Input.txt");
File fout = new File("C:\\Users\\DELL\\eclipse-workspace\\IOstreamAssignment\\src\\Assignment3\\Output.txt");
FileReader fr =null;
FileWriter fw =null;

BufferedReader br = new BufferedReader(new FileReader(fin));
BufferedWriter bw = new BufferedWriter(new FileWriter(fout));


	//BufferedWriter bw = new BufferedWriter(new FileWriter(fout));
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}

Map<String, Integer> map = new TreeMap<>();

String str;
while ((str = br.readLine()) != null) {
	str = str.trim();
	String[] words = str.split(" ");
	
	for (String word : words) {
		if (!map.containsKey(word))
			map.put(word, 1);
		else
			map.put(word, map.get(word) + 1);
	}		
};

Set<Entry<String, Integer>> set = map.entrySet();
Iterator<Entry<String, Integer>> it = set.iterator();
while (it.hasNext()) {
	Entry<String, Integer> me = it.next();
	
	bw.write(me.getKey() + " : " + me.getValue() + "\n");
}

br.close();
bw.close();//sc.close();
}




	}



