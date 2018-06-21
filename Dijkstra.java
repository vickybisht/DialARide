package com.hackercode.utilities;

public class Dijkstra {

    public void dij(int graph[][],int n,int src){
    	
    	int visited[] = new int[n];
        int [] distance = new int[5];
        distance = graph [src];
        visited[src]=1;
        distance[src]=0;
        

        int v=0;
        for(int i=0;i<n;i++){
           int  inf=999;

            for(int j =0;j<n;j++){
                if(inf>distance[j] && visited[j]!=1){
                    inf= distance[j];
                    v=j;

                }
            }
            visited[v]=1;
            for(int j=0;j<n;j++){
                if((inf+graph[j][v]<distance[j])&&visited[j]!=1){
                    distance[j]=inf+graph[j][v];

                }

            }

        }
        for(int i =0;i<n;i++){
            graph[src][i]=distance[i];

            visited[i]=0;
        }


    }

		}
