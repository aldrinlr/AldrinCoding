package linkedlist;

import java.io.*;

public class MyLinkedList {
		Node start , ptr , ptrprev ;
		void create() throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
			System.out.print( "Enter the no of nodes to be created : ") ;
			int n = Integer.parseInt(br.readLine()) ;
			for(int i=0 ; i<n ; i++ )
			{
				System.out.print( "Enter the data : " ) ;
				int x = Integer.parseInt(br.readLine()) ;
				insert_end( x ) ;
			}
		}
		void create(int inputArray[])
		{
			int n = inputArray.length ;
			for(int i=0 ; i<n ; i++ )
			{
				insert_end( inputArray[i] ) ;
			}
		}
		void insert_end( int x )
		{
			Node info = new Node() ;
			info.data = x ;
			info.next = null ;
			if( start==null )
			{	
				start = info ;
			}
			else
			{
				ptr = start ;
				while( ptr.next!=null )
				{
					ptr = ptr.next ;
				}
				ptr.next = info ;
			}
		}
		void insert_begin( int x ) 
		{
			Node info = new Node() ;
			info.data = x ;
			info.next = null ;
			if( start==null )
			{
				start = info ;
			}
			else
			{
				info.next = start ;
				start = info ;
			}
		}
		void delete_end()
		{
			if( start==null )
			{
				System.out.print( " Underflow..!!! " ) ;
			}
			else
			{
				ptr = start ;
				while( ptr.next!=null )
				{
					ptrprev = ptr ;
					ptr = ptr.next ;
				}
				ptrprev.next = null ;
			}
		}
		void delete_begin()
		{
			if( start==null )
			{
				System.out.print( "Underflow" ) ;
			}
			else
			{
				ptr = start ;
				ptr = ptr.next ;
				start = ptr ;
			}
		}
		void delete_between(int index) {
			ptr = start;
			if(index==0) {
				delete_begin();
			}
			else {
				if(start==null) {
					System.out.print( " Underflow..!!! " ) ;
				}
				else {
					for( int i=0 ; i<index-1 ; i++ ) {
						ptr = ptr.next;
					}
					Node n = ptr.next;
					ptr.next = n.next;
				}
			}
		}
		void insert_between( int z , int x )
		{
			Node info = new Node() ;
			info.data = x ;
			info.next = null ;
			ptr = start ;
			ptrprev = null ;
			if( start==null )
			{	
				start = info ;
			}
			else
			{
				for( int i=0 ; i<z-1 ; i++ )
				{	
					ptr = ptr.next ;
				}
				ptrprev = ptr.next ;
				ptr.next = info ;
				info.next = ptrprev ;
			}
		}
		void display()
		{
			System.out.print( "\n\n" ) ;
			ptr = start ;
			while( ptr.next!=null )
			{
				System.out.print(ptr.data) ;
				System.out.print( "-->" ) ;
				ptr = ptr.next ;
			}
			System.out.print(ptr.data) ;
		}

}
