
public class IncrementDecrementOperator {

	public static void main(String[] args) {
		
		int i=1;
		//i= i+1;
		System.out.println(i);
		
		//  ++ is known as incremental operator
		
		int j=i++;  //Post increment  (Post -later)
		
		System.out.println(i);
		System.out.println(j);
		
		int p=-89;
		int q =p++;
		System.out.println(p);
		System.out.println(q);
		
		//Pre increment 
		int h=2;
		int g=++h;
		System.out.println(h); //3
		System.out.println(g ); //3
		
		//Post decrement
		int t=2;
		int u = t--;
		System.out.println(t);//1
		System.out.println(u);//2
		
		int s=-999;
		int x = s--;
		System.out.println(s);
		System.out.println(x);
		
		//Pre decrement
		
		int m = 3;
		int n = --m;
		System.out.println(m); //2
		System.out.println(n); //2
		
		int l =1;
		System.out.println(l++); //1
		System.out.println(l); //2
		
		int o =2;
		System.out.println(++o);
		System.out.println(o);
		
		System.out.println(o++); //3
		System.out.println(o);
		
		
		int r =5;
		int a1 = 5+(++r);
		System.out.println(a1); //11
		
		int q1 = 5;
		int a2 = 5+(r++);
		System.out.println(a2); //11
		
		
		
		

	}

}
