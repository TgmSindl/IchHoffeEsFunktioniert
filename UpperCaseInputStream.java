package design;

public class UpperCaseInputStream extends FilterInputStream{
	public UpperCaseInputStream(Input Stream in){
		super(in);
	}
	public int read() throws IOException{
		int c = super.read();
		return (c == -1 ? c :Character.toUpperCase((char)c));
		
	}
	public int read(byte[], int offset, int len) throws IOException{
		int result = super.read(b, offset, len);
		for (int i=offset; i<offset+result;i++){
			b[i]=(byte)Character.toUpperCase((char)b[i]);
		}
		return result;
	}

}
