#include<stdio.h>
int main()
{
void printlevelorderzigzag(BinaryTree*root)
{
int BinaryTree*root,boole;
stack<BinaryTree*>CurrentLevel,NextLevel;
boole leftToRight=true;
CurrentLevel.Push(root);
while(!CurrentLevel.empty())
{
BinaryTree*CurrentNode=Current.Level.top();
CurrentLevel.pop();
if(CurrentNode)
{
cout<<CurrentNode->data<<" ";
if(LeftToRight)
{
nextLevel.push(CurrentNode->Left);
nextLevel.push(CurrentNode->Right);
}
else
{
NextLevel.push(CurrentNode->Right);
NextLevel.push(CurrentNode->Left);
}
}
if(CurrentLevel.empty())
{
cout<<end1;
LeftToRight=!LeftToRight;
swap(CurrentLevel,NextLevel);
}
}
}
return 0;
}
