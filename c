#include <stdio.h>

void insertionSort (int *prt, int n)
{

    int sortArray[n];
    
    int i, j ,t;

    for(int i = 0 ; i < n ; i++){
        for(j = i + 1; j < n; j++){
            if (*(prt + j) < *(prt + i)) {
                t = *(prt + i);
                *(prt + i) = *(prt + j); 
                *(prt + j) = t;
            }  
        }

    }
    for(i=0; i < n; i++){
        sortArray[i] = *(prt+i); 
    }


}


void printArray(int arr[], int n) 
{ 
    int i; 
    for (i = 0; i < n; i++) 
        printf("%d ", arr[i]); 
    printf("\n"); 
} 
  
int main() 
{ 
    int arr[] = { 12, 11, 13, 5, 6 }; 
    int n = sizeof(arr) / sizeof(arr[0]); 

    insertionSort(arr, n); 
    printArray(arr, n); 
  
    return 0; 
} 
