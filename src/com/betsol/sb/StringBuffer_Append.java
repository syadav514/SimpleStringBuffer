package com.betsol.sb;

import javax.sql.rowset.spi.SyncResolver;
import java.lang.*;

public class StringBuffer_Append {

		char buffer[];
		int capacity;
		int length;
		public StringBuffer_Append()
		{
			this(16);
		}
		public StringBuffer_Append(int l)
		{
			capacity=l;
			buffer=new char[capacity];
			length=0;
		}
		
		public synchronized StringBuffer_Append myAppend(String a)
		{
			if(a==null)	
				a="null";
			if(length+a.length()>capacity)
			{
				int i=Math.max(length+a.length(),2*capacity);
						char[] b=new char[i];
				for(int l=0;l<length;l++)
				{
					b[l]=buffer[l];
				}
				buffer=b;
				capacity=i;
				
			}
			
			for(int i=0;i<a.length();i++)
			{
				buffer[length+i]=a.charAt(i);
			}
			length+=a.length();
			return this;
		
			
		}
		
				
		
}
