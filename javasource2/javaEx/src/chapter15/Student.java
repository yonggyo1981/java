package chapter15;

import java.io.*;

public class Student implements Externalizable {
	public int id; // �й� 
	public String name; // �̸� 
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		//out.writeUTF(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		//name = in.readUTF();
		
	}
	
	public int getId() {
		return id;
	}
}
