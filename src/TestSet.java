import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class TestSet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("123");
		set.add("456");
		set.add("789");
		//��Ϊcollegtion��iterator�������������еļ����඼ӵ���������
		Iterator<String> it=set.iterator();
		//iterator����hasnext���������Ԫ���Ƿ񻹴���
		while(it.hasNext()){
			//ͨ��next�������Ի�ȡ��һ��Ԫ��
			String str=it.next();
			System.out.println(str);
		}
		System.err.println(set);
	}

}
