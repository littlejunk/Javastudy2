package reload;

public class Dog {
    
	public void yao() {
		// TODO Auto-generated method stub
       System.out.println("汪汪叫");
	}
    
    public void yao(String str) {
    	System.out.println("咬骨头，好香啊");
    }
    
    public void yao(Person p) {
    	if(p.getSex()=='女') {
    		System.out.println("跑过来舔了两口");
    	}else {
			System.out.println("扑上去撕咬");
		}
    }
}
