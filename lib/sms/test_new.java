//�����Ƽ����޹�˾
import java.lang.*;
import montnets.*;
public class test
{
    public static void main(String args[])
    {

	mondem Mytest =new mondem();  //����һ�� mondem ���� �������������֧��64���˿ڷ���
	int rc;
	String[] wapResult=new String[3];
	
	rc=Mytest.SetThreadMode(1);   //�����߳�ģʽ
	if(rc==0){
	    System.out.println("�����߳�ģʽ�ɹ�");
	} else {
	    System.out.println("�����߳�ģʽʧ��");
	   Mytest.CloseModem(2);
	    return ;
	}

	//ȫ�����óɵ���è��ʽ
	Mytest.SetModemType(0,0);
	Mytest.SetModemType(1,0);
	Mytest.SetModemType(2,0);
	Mytest.SetModemType(3,0);
	Mytest.SetModemType(4,0);
	Mytest.SetModemType(5,0);
	Mytest.SetModemType(6,0);
	Mytest.SetModemType(7,0);
//	for(int i=0;i<10;i++)
//	{
	if((rc=(Mytest.InitModem(-1)))!=0)
	{
	System.out.println(2+"��ʼ��ʧ��"+rc);
	//Mytest.CloseModem(2);
	return ;
	}
//	}
	
	 rc=Mytest.SendMsg(-1,args[0],args[1]);  //����һ����Ϣ,�ӿ���ʹ�õ�����˿�
	 System.out.println("send message done, return="+rc);
	 
	try{Thread.sleep(5000);}catch(InterruptedException e){} 
		   String [] s = Mytest.ReadMsgEx(-1);
		   if(s[0].equals("-1")) {
		   	System.out.println("-����Ϣ-----");
		   } else {
		   	System.out.println(s[0]);
		   	System.out.println(s[1]);
		   	System.out.println(s[2]);
		   }
		   	for(int i=0;i<10;i++)
			{
	Mytest.CloseModem(i);
	}
		return;
	}
	

}
