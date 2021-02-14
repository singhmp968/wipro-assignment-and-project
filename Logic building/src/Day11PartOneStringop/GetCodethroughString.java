package Day11PartOneStringop;

public class GetCodethroughString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
gctStr("Hello word");
	}
public static void gctStr(String str) {
	String st[] = str.split(" ");
	int sum=0;
	for(String i:st) {
		sum+=i.length();
	}

int tp=sum;
int ans = 0;
while(tp!=0) {
	int rem = tp%10;
	ans+=rem;
	tp/=10;
}

System.out.print(ans);}
}
