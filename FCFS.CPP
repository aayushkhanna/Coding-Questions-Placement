#include<iostream.h>
#include<stdio.h>
#include<conio.h>
int main()
{
    clrscr();
    int n,i,j,k,t,c;
    float avwt=0.0,avtat=0.0;
    cout<<"************First Come First Serve Algorithm***************"<<endl<<endl;
    cout<<"Enter number of processes to be executed"<<endl;
    cin>>n;
    int at[100],bt[100],ct[100],wt[100],tat[100],nat[100];

    cout<<"Enter arrival Time";
    for(i=0;i<n;i++)
    {
       cout<<"Processes "<<i+1<<" : ";
       cin>>at[i];
    }

    cout<<"Enter Burst Time"<<endl;
    for(i=0;i<n;i++)
    {
	cout<<"Process"<<i+1<<":";
	cin>>bt[i];
    }


    for(i=1;i<n;i++)
    {
	j=i-1;
	k=at[i];

	while((j>=0)&&(k<at[j]))
	{
	    at[j+1]=at[j];
	    at[j]=k;
	    t=bt[j+1];
	    bt[j+1]=bt[j];
	    bt[j]=t;
	    j--;
	}
    }
   c = at[0];
   for(i=0;i<n;i++)
   {
      ct[i]=c+bt[i];
      nat[i]=c;
      c=ct[i];
   }
   for (i=0;i<n;i++)
   {
    wt[i]=nat[i]-at[i];
    }

   for(i=0;i<n;i++)
   {
    tat[i]=ct[i]-at[i];
    }
    clrscr();
    cout<<"NUMBER OF PROCESSES ENTERED"<<" "<<n<<endl;

    cout<<"PROCESS"<<"\t"<<"AT"<<"\t"<<"BT"<<"\t"<<"CT"<<"\t"<<"TAT"<<"\t"<<"WT"<<endl;
    for(i=0;i<n;i++)
    {

    cout<<i<<"\t"<<at[i]<<"\t"<<bt[i]<<"\t"<<ct[i]<<"\t"<<tat[i]<<"\t"<<wt[i]<<endl;
   }

  cout<<"Average waiting time:";
  for(i=0;i<n;i++)
  {
     avwt=avwt+wt[i];
   }

  cout<<(avwt/n)<<endl;

  cout<<"Average Turn Around Time:";
  for(i=0;i<n;i++)
  {
     avtat = avtat+tat[i];
   }
  cout<<(avtat/n)<<endl;


  cout<<endl;
  getch();
  return 0;

}
