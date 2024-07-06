     }
            if(ele1==arr[i]){
                coun2++;
            }
        }

        int min=(int)(n/3)+1;
        if(coun1>=min){
            list.add(ele1);
        }
        if(coun2>=min){
            list.add(ele2);
        }
        return list;

        // Time compleixty = O(n)
        // Time compleixty = O(1)
    }