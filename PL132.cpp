#include<iostream>

using namespace std;
class Pattern
{
	private :
	int iRow,iCol;
	
	public :
		Pattern(int a, int b)
		{
			this->iRow = a;
			this->iCol = b;
			
		}
		
		void Display()
		{
			int i,j = 0;
			
			for(i = 1; i <= iRow; i++)
			{
				for(j = 1; j <= iCol; j++)
				{
					cout<<"*"<<"\t";
				}
				
				cout<<endl;
			}
			
		}
	
	
	
};

int main()
{
	Pattern pobj(4 , 4);
	
	pobj.Display();
	
	
	
	return 0;
}