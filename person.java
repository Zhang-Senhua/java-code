package demo11;

public class person {
	String name;
	String id;
	@Override
	public boolean equals(Object obj) {
		person p=(person) obj;
		boolean b1=this.name.equals(p.name);
		boolean b2=this.name.equals(p.id);
		
		return b1&&b2;
		
	}

	
	}


