#include<iostream>
using namespace std;
int main()
{
	int Menu01();
	int Length;
	int Width;
	int Height;
	int Radius;
	int Volume, Area;
	int Cho;
	Menu01();
	cin >> Cho;
	return 0;
}
int Menu01()
{
	cout << "********Menu********" << endl;
cout << "1.立体几何计算" << endl;
cout << "2.平面几何计算" << endl;
cout << "3.退出程序" << endl;
cout << "阿澈是sbb" << endl;
cin.get();
return 0;
}
int Menu02()
{
	cout << "球体" << endl;
	cout << "方体" << endl;
	return 0;
}
int Menu03()
{
	cout << "圆" << endl;
	cout << "矩形" << endl;
	return 0;
}