#include<iostream>
using namespace std;


int Count(char str[])
{
	int iCnt = 0;
	
	while(*str != '\0')
	{
		if( *str == 'l')
		{
			iCnt++;
		}
		
		str++;
		
	}
	
		return iCnt;
} 



int main()
{
	char Arr[20];
	int iRet = 0;
	
	cout<<"Enter the String"<<endl;
	cin.getline(Arr,20);
	
	iRet = Count(Arr);
	cout<<"String contains l :"<<iRet<<"Times"<<endl;
	
	return 0;
}